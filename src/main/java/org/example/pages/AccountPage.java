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

    @FindBy(xpath = "//a[@id=\"tdb3\"]")
    WebElement myAccountButton;

    @FindBy(xpath = "//ul[@class=\"accountLinkList\"]/li[1]/a")
    WebElement changeInformationLink;
    @FindBy(xpath = "//div[@class = \"contentContainer\"]//h2")
    WebElement subTitleAccount;
    @FindBy(xpath = "//input[@checked=\"checked\"]")
    WebElement radioButton;
    @FindBy(xpath = "//input[@name=\"firstname\"]")
    WebElement firstNameAccount;
    @FindBy(xpath = "//input[@name=\"lastname\"]")
    WebElement lastnameAccount;
    @FindBy(xpath = "//input[@id= \"dob\"]")
    WebElement dateOfBirthAccount;
    @FindBy(xpath = "//input[@name= \"email_address\"]")
    WebElement emailAddressAccount;
    @FindBy(xpath = "//input[@name= \"telephone\"]")
    WebElement telephoneAccount;
    @FindBy(xpath = "//input[@name= \"fax\"]")
    WebElement faxAccount;
    @FindBy(xpath = "//button[@id=\"tdb5\"]")
    WebElement continueAccount;





    //Methods

    public void clickLogOff() {
        log_off.click();
    }

    public  void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickChangeInformation() {
        changeInformationLink.click();
    }

    public void showAccountInformation() {
        System.out.println(subTitleAccount.getText());
        System.out.println("Gender: "+ radioButton.getAttribute("value"));
        System.out.println("First Name: "+ firstNameAccount.getAttribute("value"));
        System.out.println("Last Name: "+ lastnameAccount.getAttribute("value"));
        System.out.println("Date of birth: "+ dateOfBirthAccount.getAttribute("value"));
        System.out.println("E-mail: "+ emailAddressAccount.getAttribute("value"));
        System.out.println("Telephone Number: "+ telephoneAccount.getAttribute("value"));
        System.out.println("Fax Number: "+ faxAccount.getAttribute("value"));

    }
    public void clickContinue() {
        continueAccount.click();
    }
    public void closeDriver() {
        driver.quit();
    }





}





