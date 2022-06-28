package com.herokuapp.stepdefinitions;

import com.herokuapp.pages.HerokuappMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverHelper;

public class HerokuappMainStepDef {
    WebDriver driver = DriverHelper.getDriver();
    HerokuappMainPage herokuappMainPage = new HerokuappMainPage(driver);

//    @Given("User navigates to {string}")
//    public void user_navigates_to_https_the_internet_herokuapp_com(String url) {
//        driver.get(url);
//    }

    @When("User clicks on {string}")
    public void user_clicks_on(String elm ) {
        herokuappMainPage.clickLink(elm);
    }

    @Then("User validates the {string} of the page")
    public void user_validates_the_of_the_page(String expectedURL) {
        Assert.assertEquals(expectedURL,herokuappMainPage.validation(driver));
    }

}
