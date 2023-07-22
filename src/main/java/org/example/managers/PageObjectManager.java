package org.example.managers;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private HomePage homePage;
    private LoginPage loginPage;
    private WebDriver driver;



    //constructors
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public PageObjectManager(HomePage homePage) {
        this.homePage = homePage;
    }
    public PageObjectManager(LoginPage loginPage) {
        this.loginPage = loginPage;
    }



    // manage homePage
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }
    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

}
