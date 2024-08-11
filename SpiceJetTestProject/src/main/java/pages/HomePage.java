package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterOrigin(String origin) {
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(origin);
    }

    public void enterDestination(String destination) {
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys(destination);
    }

    public void selectOneWay() {
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
    }

    public void selectRoundTrip() {
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
    }

    public void searchFlights() {
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
