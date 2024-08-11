package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("ctl00_mainContent_txt_UserName")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("ctl00_mainContent_txt_Password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.id("ctl00_mainContent_btn_Login")).click();
    }
}
