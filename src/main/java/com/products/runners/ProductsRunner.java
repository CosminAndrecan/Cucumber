package com.products.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Karate.class
@CucumberOptions(
        features = "src/main/resources/features/Products",
        glue="com/products/stepdefinitions",
        dryRun=false,
        tags="@productTable",
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class ProductsRunner {
}
