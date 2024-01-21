package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.AccountPage;
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
    AccountPage accountPage;
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
        createAccountPage.setEmailAddress("qwery17@wp.pl");
        createAccountPage.setCompanyName("myCompany");
        createAccountPage.setStreetAddress("Warszawska");
        createAccountPage.setPostCode(2344);
        createAccountPage.setCity("Warszawa");
        createAccountPage.setState("Mazowieckie");
        createAccountPage.setCountry();
        createAccountPage.setTelefone(232312222);
        createAccountPage.setFax(234422445);
        createAccountPage.setNewsLetter();
        createAccountPage.setPassword("123Wqq122");
        createAccountPage.setConfirmation("123Wqq122");
    }

    @And("I submit the registration form")
    public void i_submit_the_registration_form() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage.setSubmitForm();

    }

    @Then("I should see a successful registration message")
    public void i_should_see_a_successful_registration_message() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage.setSuccessMessage();
        //homePage.closeDriver();

    }

    @Then("I click button Continue and redirect to account user page")
    public void i_click_button_continue_and_redirect_to_account_user_page() {
        createAccountPage.clickContinueButton();

    }

    @Then("I click button Log off and user  log out  from account page")
    public void i_click_button_log_off_and_user_log_out_from_account_page() {
        accountPage = pageObjectManager.getAccountPage();
        accountPage.clickLogOff();

    }

    @Then("I click button Continue and redirect to Home  page")
    public void i_click_button_continue_and_redirect_to_home_page() {

        accountPage.clickLogOff();
        accountPage.closeDriver();

    }


//Scenario Login user in existing account

    @When("I click myAccount and redirect to login page")
    public void i_click_my_account_and_redirect_to_login_page() {
        homePage = pageObjectManager.getHomePage();
        homePage.myAccountClick();

    }

    @When("I fill email, password in inputs form and click {string}")
    public void i_fill_email_password_in_inputs_form_and_click(String string) {
        loginPage = pageObjectManager.getLoginPage();
        loginPage.inputEmail("qwery12@wp.pl");
        loginPage.inputPassword("123Wqq122");
        loginPage.clickSubmitForm();


    }

    @Then("I on users account, click myAccount and redirect me  to account page")
    public void i_on_users_account_click_my_account_and_redirect_me_to_account_page() {
        i_click_button_my_account_and_redirect_to_login_page();
        accountPage = pageObjectManager.getAccountPage();
        accountPage.clickMyAccountButton();


    }

    @Then("I click on  {string}")
    public void i_click_on(String string) {
        accountPage.clickChangeInformation();
    }

    @Then("I am on account_edit page, shows information about user")
    public void i_am_on_account_edit_page_shows_information_about_user() {
        accountPage.showAccountInformation();



    }

    @And("I change First name, Last name and click {string}")
    public void i_change_first_name_last_name_and_click(String string) {
     accountPage.clickContinue();


    }

    @Then("I am on the account page")
    public void i_am_on_the_account_page() {
       accountPage.clickLogOff();
       accountPage.closeDriver();
    }


}
