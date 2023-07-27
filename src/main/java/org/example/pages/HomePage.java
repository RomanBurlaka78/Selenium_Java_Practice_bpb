package org.example.pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    final WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators html elements
    @FindBy(id = "tdb3")
    WebElement myAccount;


    public void goToHomePage() {
        driver.get("https://practice.bpbonline.com/");
    }

    public void myAccountClick() {
        myAccount.click();
    }


//    public void closeDriver() {
//        driver.quit();
//    }


}
