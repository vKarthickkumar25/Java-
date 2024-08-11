package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    private WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassengerDetails(String firstName, String lastName) {
        driver.findElement(By.id("ctl00_mainContent_txt_FName")).sendKeys(firstName);
        driver.findElement(By.id("ctl00_mainContent_txt_LName")).sendKeys(lastName);
    }

    public void enterPaymentDetails(String cardNumber, String expiryDate, String cvv) {
        driver.findElement(By.id("ctl00_mainContent_txt_CardNumber")).sendKeys(cardNumber);
        driver.findElement(By.id("ctl00_mainContent_txt_ExpiryDate")).sendKeys(expiryDate);
        driver.findElement(By.id("ctl00_mainContent_txt_CVV")).sendKeys(cvv);
    }

    public void submitBooking() {
        driver.findElement(By.id("ctl00_mainContent_btn_ConfirmBooking")).click();
    }

    public boolean isBookingSuccessful() {
        return driver.findElement(By.id("confirmationMessage")).isDisplayed();
    }

    public void validateBookingFields() {
        // Validate Check-in, Flight Status, Manage Booking fields
        driver.findElement(By.id("checkIn")).isDisplayed();
        driver.findElement(By.id("flightStatus")).isDisplayed();
        driver.findElement(By.id("manageBooking")).isDisplayed();
    }
}
