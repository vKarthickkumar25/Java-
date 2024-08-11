package com.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signUp(String username, String password) {
        // Implement sign-up functionality
    }

    public void login(String username, String password) {
        // Implement login functionality
    }

    public boolean isLoggedIn() {
        // Implement logic to verify if the user is logged in
        return true;
    }
}
