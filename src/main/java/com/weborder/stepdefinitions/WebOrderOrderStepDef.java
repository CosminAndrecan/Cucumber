package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderOrderPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderOrderStepDef {
    WebDriver driver= DriverHelper.getDriver();
    WebOrderOrderPage orderPage=new WebOrderOrderPage(driver);
    @Then("User clicks Group Order box and next button")
    public void user_clicks_group_order_box_and_next_button() {
     orderPage.clickTheButtons();
    }

}
