package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    WebDriver driver;

    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn-default");
    By productLink = By.linkText("iPhone"); // Change to the product you want to add
    By addToCartBtn = By.id("button-cart");
    By cartButton = By.id("cart");
    By viewCart = By.linkText("View Cart");
    By continueShopping = By.linkText("Continue Shopping");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public void selectProduct() {
        driver.findElement(productLink).click();
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }

    public void viewCart() {
        driver.findElement(viewCart).click();
    }

    public void continueShopping() {
        driver.findElement(continueShopping).click();
    }
}
