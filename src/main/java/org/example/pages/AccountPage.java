package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends HomePage {
    final WebDriver driver;

    //constructor
    public AccountPage (WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(xpath = "//a[@id=\"tdb4\"]")
    WebElement log_off;


    //Methods

    public void clickLogOff() {
        log_off.click();
    }






}





