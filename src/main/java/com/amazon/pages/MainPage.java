package com.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class MainPage {
/*1-navigate to amazon website
  2- search for iphone 13 case
  3- Validate teh number is
  4 validate all teh header has"iPhone". */
public MainPage(WebDriver driver)
{PageFactory.initElements(driver,this);
}
@FindBy(name="field-keywords")
    WebElement searchBox;
    @FindBy(xpath = "//span[contains(text(),'of over')]")
    WebElement results;
    @FindBy(xpath = "//h2//a")
    List<WebElement> allHeader;


    public void searchBoxField(String searchWord){
        searchBox.sendKeys(searchWord, Keys.ENTER);
    }
    public int resultOfSearch(){
        String [] result=results.getText().trim().split(" ");
        int lastResult=Integer.parseInt(result[3].replace(",",""));//40000
        return lastResult;
    }
    public void validateHeaders(String word){
        for(WebElement header:allHeader){
            if(!BrowserUtils.getText(header).equals(""))
            Assert.assertTrue(BrowserUtils.getText(header).contains(word));
        }
    }


}
