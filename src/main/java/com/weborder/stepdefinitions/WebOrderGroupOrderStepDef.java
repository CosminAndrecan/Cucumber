package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderGroupOrderPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderGroupOrderStepDef {
    WebDriver driver= DriverHelper.getDriver();
    WebOrderGroupOrderPage webOrderGroupOrderPage=new WebOrderGroupOrderPage(driver);
    @Then("User choose delivery address is {string} and validates the address {string}")
    public void user_choose_delivery_address_is_and_validates_the_address(String deliveryOption, String address) {
        webOrderGroupOrderPage.chooseTheDeliveryOption(deliveryOption,address);
    }
    @Then("User sends the word {string} for Note to Invites part")
    public void user_sends_the_word_for_note_to_invites_part(String note) {
        webOrderGroupOrderPage.sendingNote(note);
    }
    @Then("User sends e-mail addresses  which are {string} and {string} to Invite List")
    public void user_sends_e_mail_addresses_which_are_ahmet_gmail_com_and_berkey_gmail_com_to_invite_list(String email1, String email2) {
        webOrderGroupOrderPage.sendingInviteList(email1,email2);
    }
    @Then("User clicks create group order button.")
    public void user_clicks_create_group_order_button() {
        webOrderGroupOrderPage.clickOrderButton();
    }
    @Then("User validates the header of the page is {string}")
    public void user_validates_the_title_of_the_page_is(String header) {
       webOrderGroupOrderPage.validateHeader(driver,header);
    }
    @Then("User validates total participants is {int}.")
    public void user_validates_total_participants_is(int  expectedNumber) {
        Assert. assertEquals(expectedNumber,webOrderGroupOrderPage.getNumberOfParticipants());
       // driver.quit();
    }
}
