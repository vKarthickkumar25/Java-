package com.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout(String name, String cardNumber, String expiryDate, String cvv) {
        // Implement checkout and payment form filling
    }

    public boolean isOrderPlaced() {
        // Implement order confirmation check
        return true;
    }
}
