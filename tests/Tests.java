package tests;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

public class Tests {
    WebDriver driver;
    LoginPage loginPage;
    RegisterPage registerPage;
    SearchPage searchPage;
    AddToCartPage addToCartPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://tutorialsninja.com/demo/");
    }

    @Test(priority = 1)
    public void loginTest() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        loginPage = new LoginPage(driver);
        loginPage.login("rathodkeval70901@gmail.com", "keval@1006");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 2)
    public void registerTest() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerPage = new RegisterPage(driver);
        registerPage.fillRegistrationForm("Keval", "Rathod", "keval123@gmail.com", "1234567890", "123456", "India");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 3)
    public void searchProduct() {
        searchPage = new SearchPage(driver);
        searchPage.search("iPhone");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 4)
    public void addToCartTest() throws InterruptedException {
        addToCartPage = new AddToCartPage(driver);
        addToCartPage.searchProduct("iPhone");
        addToCartPage.selectProduct();
        addToCartPage.addToCart();
        Thread.sleep(2000); 
        addToCartPage.openCart();
        Thread.sleep(1000);
        addToCartPage.viewCart();
        Thread.sleep(1000);
        addToCartPage.continueShopping();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 5)
    public void contactUsTest() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.openContactPage();
        contactPage.fillContactForm("Keval", "keval@mail.com", "This is a test enquiry.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
