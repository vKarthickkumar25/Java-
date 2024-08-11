package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.BookingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetTestSuiteTest {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private BookingPage bookingPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        bookingPage = new BookingPage(driver);
    }

    @Test
    public void testSignUpAndLogin() {
        loginPage.enterEmail("testuser@example.com");
        loginPage.enterPassword("testpassword");
        loginPage.clickLoginButton();
        // Additional verification code here
    }

    @Test
    public void testSearchFlights() {
        homePage.enterOrigin("New York");
        homePage.enterDestination("Los Angeles");
        homePage.selectOneWay();
        homePage.searchFlights();
        // Additional verification code here
    }

    @Test
    public void testBooking() {
        // Assuming you have selected a flight and navigated to the booking page
        bookingPage.enterPassengerDetails("John", "Doe");
        bookingPage.enterPaymentDetails("4111111111111111", "12/24", "123");
        bookingPage.submitBooking();
        Assert.assertTrue(bookingPage.isBookingSuccessful(), "Booking was not successful");
        bookingPage.validateBookingFields();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
