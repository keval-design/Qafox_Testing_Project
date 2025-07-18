package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {

    WebDriver driver;

    By contactLink = By.xpath("//i[@class='fa fa-phone']");
    By yourName = By.xpath("//input[@name='name']");
    By email = By.xpath("//input[@name='email']");
    By enquiry = By.xpath("//textarea[@name='enquiry']");
    By submitButton = By.xpath("//input[@value='Submit']");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openContactPage() {
        driver.findElement(contactLink).click();
    }

    public void fillContactForm(String name, String mail, String message) {
        driver.findElement(yourName).sendKeys(name);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(enquiry).sendKeys(message);
        driver.findElement(submitButton).click();
    }
}
