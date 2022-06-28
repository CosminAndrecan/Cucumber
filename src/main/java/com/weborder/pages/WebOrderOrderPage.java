package com.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderOrderPage {
    public WebOrderOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//label[@for='GroupOrder']")
    WebElement groupOrderBox;

    @FindBy(id="getAddressNextButton")
    WebElement nextButton;
    public void clickTheButtons(){
        groupOrderBox.click();
        nextButton.click();
    }
}