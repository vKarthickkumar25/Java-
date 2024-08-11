package com.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMenuAndValidateTitles() {
        // Implement logic for navigation and title validation
    }

    public boolean validateBottomLinks() {
        // Implement validation of bottom links
        return true;
    }

    public void searchAndAddToCart(String itemName) {
        // Implement search and add to cart
    }

    public void selectAndAddFromShopByDepartment(String department) {
        // Implement select and add item from department
    }

    public void selectAndAddFromBrand(String brand) {
        // Implement select and add item from brand
    }
}
