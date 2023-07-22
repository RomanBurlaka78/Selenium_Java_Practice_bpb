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

//    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")
//    WebElement inputGender;
//    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[2]/td[2]/input")
//    WebElement inputFirstname;
//    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[3]/td[2]/input")
//    WebElement inputLastname;
//    @FindBy(xpath = "//*[@id=\"bodyContent\"]/div/div[1]/a[2]/u")
//    WebElement emailAddress;

    public void goToHomePage() {
        driver.get("https://practice.bpbonline.com/");
    }

    public void myAccountClick() {
        myAccount.click();
    }
    @FindBy(id = "tdb2")
    WebElement createAccount;

    public void myAccountCreate() {
        createAccount.click();
    }






//    public void inputGenderMethod() {
//        inputGender.click();
//    }
//
//    public void inputFirstnameMethod() {
//        inputFirstname.sendKeys("Robert");
//    }
//
//    public void inputLastnameMethod() {
//        inputLastname.sendKeys("Kowalski");
//    }
//
//
//    public void emailAddressMethod() {
//        emailAddress.sendKeys("wer@wp.pl");
//    }


    public void closeDriver() {
        driver.quit();
    }


}
