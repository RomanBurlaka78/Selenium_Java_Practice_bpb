package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;
    HomePage homePage;
    PageObjectManager pageObjectManager;

    @Given("user is on Homepage")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Disk D\\Java-Selenium\\Selenium_Java_Practice_bpb\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();


    }
    @When("user clicks on myAccount button")
    public void user_clicks_on_my_account_button() {
        // Write code here that turns the phrase above into concrete actions
        //homePage.myAccountClick();
        homePage.closeDriver();
    }

}
