package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class WebOrderLoginStepDef {
    WebDriver driver=DriverHelper.getDriver();

    @Given("User navigates to WebOrder")
    public void user_navigates_to_web_order() {

     //  driver.get(ConfigReader.readProperty("weborderurl"));

    }

//    @When("User provides correct {string} and {string} \\(credentials) for WebOrder")
//    public void user_provides_correct_user_name_and_password_credential_for_web_order(String userName, String password) {
//        WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
//        loginPage.webOrderLogin(userName, password);
//    }


//    @When("User provides correct email {string} and wrong pswd {string} for WebOrder")
//    public void user_provides_correct_email_and_wrong_pswd_for_web_order(String username, String password) {
//        WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
//        loginPage.webOrderLogin(username, password);
//    }

//    @When("User provides wrong username {string} and correct pswd {string} for WebOrder")
//    public void user_provides_wrong_username_and_correct_pswd_for_web_order(String username, String password) {
//        WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
//        loginPage.webOrderLogin(username, password);
//    }

//    @When("User doesn't provide any email {string} and password {string} for WebOrder")
//    public void user_doesn_t_provide_any_email_and_password_for_web_order(String username, String password) {
//        WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
//        loginPage.webOrderLogin(username, password);
//    }


    @When("User provides credentials {string} and {string} for WebOrder")
    public void user_provides_credentials_and_for_web_order(String username, String password) {
        WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
        loginPage.webOrderLogin(username, password);
    }
    @Then("User validate the {string} from homepage")
    public void user_validate_the_title_from_homepage(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
      //driver.quit();
    }
    @Then("User validate the {string} message")
    public void user_validate_the_message2(String expectedMessage) {
        WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
        Assert.assertEquals(expectedMessage,loginPage.getMessage());
      // driver.quit();
    }
}
