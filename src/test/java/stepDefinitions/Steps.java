package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.CreateAccountPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;
    PageObjectManager pageObjectManager;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Disk D\\Java-Selenium\\Selenium_Java_Practice_bpb\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.goToHomePage();

    }

    @When("I click button myAccount and redirect to login page")
    public void i_click_button_my_account_and_redirect_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.myAccountClick();
    }

    @When("I click button Continue and redirect to create_account page")
    public void i_click_button_continue_and_redirect_to_create_account_page() {
        // Write code here that turns the phrase above into concrete actions
        loginPage = pageObjectManager.getLoginPage();
        loginPage.myAccountCreate();

    }

    @And("I enter input forms for My Account Information")
    public void i_enter_input_forms_for_my_account_information() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage = pageObjectManager.getCreateAccountPage();
        createAccountPage.inputGenderMethod();
        createAccountPage.setInputFirstname("Robert");
        createAccountPage.setInputLastname("Kowalski");
        createAccountPage.setDateOfBirth("05/07/1988");
        createAccountPage.setEmailAddress("qwery3@wp.pl");
        createAccountPage.setCompanyName("myCompany");
        createAccountPage.setStreetAddress("Warszawska");
        createAccountPage.setPostCode(2344);
        createAccountPage.setCity("Warszawa");
        createAccountPage.setState("Mazowieckie");
        createAccountPage.setCountry();
        createAccountPage.setTelefone(232312222);
        createAccountPage.setFax(234422445);
        createAccountPage.setNews_letter();
        createAccountPage.setPassword("123Wqq122");
        createAccountPage.setConfirmation("123Wqq122");
    }

    @And("I submit the registration form")
    public void i_submit_the_registration_form() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage.setSubmit_form();

    }

    @Then("I should see a successful registration message")
    public void i_should_see_a_successful_registration_message() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage.setSuccess_message();
        homePage.closeDriver();

    }


}
