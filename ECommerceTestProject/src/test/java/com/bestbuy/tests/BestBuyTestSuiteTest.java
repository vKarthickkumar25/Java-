package com.bestbuy.tests;

import com.bestbuy.pages.HomePage;
import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.CheckoutPage;
import com.bestbuy.utils.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BestBuyTestSuiteTest {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;

    @BeforeClass
    public void setUp() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Initialize page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void testNavigateToBestBuy() {
        driver.get("https://www.bestbuy.com/");
        Assert.assertEquals(driver.getTitle(), "Best Buy | Official Online Store | Shop Now & Save");
    }

    @Test
    public void testValidateLinks() {
        boolean isBroken = Utils.isLinkBroken("https://www.bestbuy.com/");
        Assert.assertFalse(isBroken, "The URL is broken");
    }

    @Test
    public void testSignUpAndLogin() {
        loginPage.signUp("testuser", "password123");
        loginPage.login("testuser", "password123");
        Assert.assertTrue(loginPage.isLoggedIn(), "Login failed!");
    }

    @Test
    public void testNavigateAndValidateMenuTitles() {
        homePage.navigateToMenuAndValidateTitles();
    }

    @Test
    public void testValidateBottomLinks() {
        Assert.assertTrue(homePage.validateBottomLinks(), "Bottom links validation failed");
    }

    @Test
    public void testSearchAndAddToCart() {
        homePage.searchAndAddToCart("Laptop");
    }

    @Test
    public void testSelectAndAddFromShopByDepartment() {
        homePage.selectAndAddFromShopByDepartment("Computers & Tablets");
    }

    @Test
    public void testSelectAndAddFromBrand() {
        homePage.selectAndAddFromBrand("Apple");
    }

    @Test
    public void testCheckoutAndFillDummyPayment() {
        checkoutPage.checkout("John Doe", "4111111111111111", "12/25", "123");
        Assert.assertTrue(checkoutPage.isOrderPlaced(), "Order was not placed successfully");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
