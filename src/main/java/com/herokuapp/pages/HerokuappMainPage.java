package com.herokuapp.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HerokuappMainPage {
    public HerokuappMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //    @FindBy(linkText = "A/B Testing")
//    WebElement ABTesting;
//    @FindBy(linkText = "Add/Remove Elements")
//    WebElement addRemoveElements;
//    @FindBy(linkText = "Basic Auth")
//    WebElement basicAuth;
//    @FindBy(linkText = "Broken Images")
//    WebElement brokenImages;
//    @FindBy(linkText = "Challenging DOM")
//    WebElement challengingDOM;
//    @FindBy(linkText = "Checkboxes")
//    WebElement checkBoxes;
//    @FindBy(linkText = "Context Menu")
//    WebElement contextMenu;
//    @FindBy(linkText = "Digest Authentication")
//    WebElement digestAuth;
//    @FindBy(linkText = "Disappearing Elements")
//    WebElement disappearingElements;
    @FindBy(xpath = "//li/a")
    List<WebElement> allLinks;

    public void clickLink(String elm) {
        for (WebElement element : allLinks) {
            if (element.getText().trim().contains(elm)) {
                element.click();
                break;
            }
        }
    }

    public String validation(WebDriver driver) {
        return driver.getCurrentUrl();
    }
}
