package org.example.pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    final WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")
    WebElement inputGender;
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[2]/td[2]/input")
    WebElement inputFirstname;
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[3]/td[2]/input")
    WebElement inputLastname;
    @FindBy(xpath = "//*[@id=\"dob\"]")
    WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[5]/td[2]/input")
    WebElement emailAddress;
    @FindBy(name = "company")
    WebElement companyName;
    @FindBy(name = "street_address")
    WebElement streetAddress;
    @FindBy(name = "postcode")
    WebElement postCode;
    @FindBy(name = "city")
    WebElement city;
    @FindBy(name = "state")
    WebElement state;
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[4]/table/tbody/tr[6]/td[2]/select/option[171]")
    WebElement country;
    @FindBy(name = "telephone")
    WebElement telefone;
    @FindBy(name = "fax")
    WebElement fax;
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/form/div/div[5]/table/tbody/tr[3]/td[2]/input")
    WebElement newsLetter;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "confirmation")
    WebElement confirmation;
    @FindBy(id = "tdb4")
    WebElement submitForm;
    @FindBy(xpath = "//*[@id=\"bodyContent\"]/h1")
    WebElement successMessage;
    @FindBy(xpath = "//a[@id=\"tdb5\"]")
    WebElement continueButton;


    public void inputGenderMethod() {
        inputGender.click();
    }

    public void setInputFirstname(String name) {
        inputFirstname.sendKeys(name);
    }

    public void setInputLastname(String surname) {
        inputLastname.sendKeys(surname);
    }

    public void setDateOfBirth(String birth) {
        dateOfBirth.sendKeys(birth);
    }

    public void setEmailAddress(String email) {
        emailAddress.sendKeys(email);
    }

    public void setCompanyName(String company_name) {
        companyName.sendKeys(company_name);
    }

    public void setStreetAddress(String street) {
        streetAddress.sendKeys(street);
    }

    public void setPostCode(int code) {
        int code_post = Integer.parseInt(Integer.toString(code));
        postCode.sendKeys(String.valueOf(code));
    }

    public void setCity(String city_name) {
        city.sendKeys(city_name);
    }

    public void setState(String state_name) {
        state.sendKeys(state_name);
    }

    public void setCountry() {
        country.click();
    }

    public void setTelefone(int telefone_name) {
        telefone.sendKeys(String.valueOf(telefone_name));
    }

    public void setFax(int fax_name) {
        fax.sendKeys(String.valueOf(fax_name));
    }

    public void setNewsLetter() {
        newsLetter.click();
    }

    public void setPassword(String password_set) {
        password.sendKeys(password_set);
    }

    public void setConfirmation(String confirmation_set) {
        confirmation.sendKeys(confirmation_set);
    }

    public void setSubmitForm() {
        submitForm.click();
    }

    public void setSuccessMessage() {
        successMessage.getText();
        System.out.println(successMessage.getText());

    }

    public  void clickContinueButton() {
        continueButton.click();

    }
}
