package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.name("confirm");
    By agreeCheckbox = By.name("agree");
    By continueButton = By.cssSelector("input.btn.btn-primary");

    // Action method
    public void fillRegistrationForm(String fName, String lName, String mail, String phone, String pass, String country) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(telephone).sendKeys(phone);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);

        WebElement agree = driver.findElement(agreeCheckbox);
        if (!agree.isSelected()) {
            agree.click();
        }

        driver.findElement(continueButton).click();
    }
}
