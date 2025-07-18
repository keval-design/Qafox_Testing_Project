package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SearchPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement searchBtn;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String searchTerm) {
        searchBox.clear();
        searchBox.sendKeys(searchTerm);
        searchBtn.click();
    }
}
