package org.example.managers;

import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private HomePage homePage;
    private WebDriver driver;

    //constructors
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public PageObjectManager(HomePage homePage) {
        this.homePage = homePage;
    }

    // manage homePage
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

}
