package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tdb2")
    WebElement createAccount;

    @FindBy(xpath = "//input[@name=\"email_address\"]")
    WebElement emailLogin;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement paswordLogin;

    @FindBy(xpath = "//button[@id=\"tdb1\"]")
    WebElement clickSubmit;

    public void myAccountCreate() {
        createAccount.click();
    }

    public void inputEmail(String email) {
        emailLogin.sendKeys(email);
    }

    public void inputPassword(String password) {
        paswordLogin.sendKeys(password);
    }

    public void clickSubmitForm() {
        clickSubmit.click();
    }


}
