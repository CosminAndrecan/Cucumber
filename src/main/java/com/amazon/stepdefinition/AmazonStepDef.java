package com.amazon.stepdefinition;

import com.amazon.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStepDef {
    WebDriver driver;
    MainPage mainPage;

    @Given("User navigates to Amazon")
    public void user_navigates_to_amazon() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @When("user search for iPhone 13 case")
    public void user_search_for_i_phone_case() {
        mainPage = new MainPage(driver);
        mainPage.searchBoxField("iphone 13 case");
    }

    @Then("User sees more than 40k results on the top")
    public void user_sees_more_than_40k_results() {
        mainPage = new MainPage(driver);
        int expectedResult=40000;
        Assert.assertTrue(expectedResult==mainPage.resultOfSearch());
      //  Assert.assertEquals(mainPage.resultOfSearch(),expectedResult);
    }

    @Then("User validates that all results contains iPhone in headers")
    public void user_sees_that_all_results_contain_i_phone_in_headers() {
        mainPage=new MainPage(driver);
        mainPage.validateHeaders("iPhone");

    }
}
