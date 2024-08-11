package com.bestbuy.tests;

import com.bestbuy.pages.HomePage;
import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.CheckoutPage;
import com.bestbuy.utils.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BestBuyTestSuite {

    private WebDriver driver;
    private WebDriverWait wait;
    private String baseUrl = "https://www.bestbuy.com/";

    @BeforeClass
    public void setUp() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void navigateToBestBuy() {
        // Task 1: Open a web browser and navigate to Best Buy
        driver.get(baseUrl);
        Assert.assertEquals(driver.getTitle(), "Best Buy | Official Online Store | Shop Now & Save");
    }

    @Test(priority = 2)
    public void validateLinks() {
        // Task 2: Validate if the given URL link is broken
        boolean isBroken = Utils.isLinkBroken(baseUrl);
        Assert.assertFalse(isBroken, "The URL is broken");
    }

    @Test(priority = 3)
    public void signUpAndLogin() {
        // Task 3: Sign-Up and Login functionality
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signUp("testuser", "password123");
        loginPage.login("testuser", "password123");
        Assert.assertTrue(loginPage.isLoggedIn(), "Login failed!");
    }

    @Test(priority = 4)
    public void navigateAndValidateMenuTitles() {
        // Task 4: Navigate through all Menu and validate titles
        HomePage homePage = new HomePage(driver);
        homePage.navigateToMenuAndValidateTitles();
    }

    @Test(priority = 5)
    public void validateBottomLinks() {
        // Task 5: Validate the bottom links on the homepage
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateBottomLinks(), "Bottom links validation failed");
    }

    @Test(priority = 6)
    public void searchAndAddToCart() {
        // Task 6: Search for and add an item to the shopping cart
        HomePage homePage = new HomePage(driver);
        homePage.searchAndAddToCart("Laptop");
    }

    @Test(priority = 7)
    public void selectAndAddFromShopByDepartment() {
        // Task 7: Select and add an item from Shop by Department
        HomePage homePage = new HomePage(driver);
        homePage.selectAndAddFromShopByDepartment("Computers & Tablets");
    }

    @Test(priority = 8)
    public void selectAndAddFromBrand() {
        // Task 8: Select and add an item from a specific brand
        HomePage homePage = new HomePage(driver);
        homePage.selectAndAddFromBrand("Apple");
    }

    @Test(priority = 9)
    public void checkoutAndFillDummyPayment() {
        // Task 9: Navigate to checkout page and fill out the form with dummy payment information
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkout("John Doe", "4111111111111111", "12/25", "123");
        Assert.assertTrue(checkoutPage.isOrderPlaced(), "Order was not placed successfully");
    }

    @Test(priority = 10)
    public void closeBrowser() {
        // Task 11: Close the web browser when testing is complete
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 12)
    public void automateTestSuite() {
        // Task 12: Run the test suite automatically on a regular basis (you would configure this in Jenkins)
        // This is just a placeholder for Jenkins setup. No implementation is needed in the code.
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
