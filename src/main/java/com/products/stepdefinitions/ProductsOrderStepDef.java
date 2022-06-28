package com.products.stepdefinitions;

import com.products.pages.ProductsLoginPage;
import com.products.pages.ProductsMainPage;
import com.products.pages.ProductsOrderPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class ProductsOrderStepDef {
    WebDriver driver = DriverHelper.getDriver();
    ProductsLoginPage loginPage = new ProductsLoginPage(driver);
    ProductsMainPage mainPage = new ProductsMainPage(driver);
    ProductsOrderPage orderPage = new ProductsOrderPage(driver);

    @Given("User navigates to product Homepage and clicks Order button")
    public void user_navigates_to_product_homepage_and_clicks_order_button() {
        driver.get(ConfigReader.readProperty("producturl"));
        loginPage.login(ConfigReader.readProperty("productusername"), ConfigReader.readProperty("productpassword"));
        mainPage.clickOrderButton();
    }

    @When("User enters the product information {string} and {string}")
    public void user_enters_the_product_information_and(String product, String quantity) {
        orderPage.sendProductInformation(product, quantity);
    }

    @When("User enters the address information {string}, {string},{string},{string},{string}")
    public void user_enters_the_address_information(String name, String street, String city, String state, String zip) {
        orderPage.sendAddressInfo(name, street, city, state, zip);
    }

    @When("User enters the payment information {string}, {string},{string} and process the order")
    public void user_enters_the_payment_information_and_process_the_order(String cardNumber, String expireDate, String cardType) {
        orderPage.sendPaymentInfo(cardNumber, expireDate, cardType);
    }

    @Then("User validates the success message {string}")
    public void user_validates_the_success_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage, orderPage.getMessage());

    }

    @Then("User clicks View All Orders and validates {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_clicks_view_all_orders_and_validates(String name, String product, String quantity, String street, String city, String state, String zip, String cardNumber, String expireDate, String cardType) {

        mainPage.clickViewAllOrderButton();
        orderPage.validation(name, product, quantity, street, city, state, zip, cardNumber, expireDate, cardType);

    }

    @Given("User navigates to product Homepage and clicks Order button with DataTable")
    public void user_navigates_to_product_homepage_and_clicks_order_button_with_data_table(DataTable dataTable) {
        driver.get(ConfigReader.readProperty("producturl"));
        Map<String ,String> loginCredentials=dataTable.asMap();// username=Tester, password=test
        loginPage.login(loginCredentials.get("username"),loginCredentials.get("password"));
        mainPage.clickOrderButton();
    }
    @When("User enters the product information")
    public void user_enters_the_product_information(DataTable dataTable) {
        Map<String,String>productInfo=dataTable.asMap();
        orderPage.sendProductInformation(productInfo.get("product"),productInfo.get("quantity"));
    }
    @When("User enters the address information")
    public void user_enters_the_address_information(DataTable dataTable) {
        Map<String,String>addressInfo=dataTable.asMap();
        orderPage.sendAddressInfo(addressInfo.get("name"),addressInfo.get("street"),addressInfo.get("city"),addressInfo.get("state")
        ,addressInfo.get("zipcode"));
    }
    @When("User enters the payment information")
    public void user_enters_the_payment_information(DataTable dataTable) {
        Map<String,String>paymentInfo=dataTable.asMap();
        orderPage.sendPaymentInfo(paymentInfo.get("cardNumber"),paymentInfo.get("expireDate"),paymentInfo.get("cardType"));
    }
    @Then("User validates the success message")
    public void user_validates_the_success_message(DataTable dataTable) {
        List<String> message=dataTable.asList();
        Assert.assertEquals(message.get(0),orderPage.getMessage());
    }
    @Then("User clicks View All Orders and validates")
    public void user_clicks_view_all_orders_and_validates(DataTable dataTable) {
        Map<String,String> allOrdersValid=dataTable.asMap();
        mainPage.clickViewAllOrderButton();
        orderPage.validation(allOrdersValid.get("name"),
                            allOrdersValid.get("product"),
                            allOrdersValid.get("quantity"),
                            allOrdersValid.get("street"),
                            allOrdersValid.get("city"),
                            allOrdersValid.get("state"),
                            allOrdersValid.get("zipcode"),
                            allOrdersValid.get("cardNumber"),
                            allOrdersValid.get("expireDate"),
                            allOrdersValid.get("cardType"));
    }

}
