package com.weborder.runners;
/*THESE ARE INTERVIEW QUESTIONS:
  RUNNER CLASS is a way to run your all features files from here. Regression, smoke, integration  etc
  @RunWith  --> annotation from Junit, and it executes the feature file steps.
  @CucumberOptions ---> is a special annotation that has some keywords
  features---> this is the location of features files(this one should be content root)
  glue--> is the location of the step definition files(this one should be source root)
  dryRun--> it is a way to get snips without executing the hole implementation
  tags--> is a way to specialize scenarios for the specific purpose . It means you can run for some scenarios for only regression, smoke etc
  plugin ---> it is a way to integrate specific condition for the keyword. It is mostly used to create a report card.
  */
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.FindBy;

@RunWith(Cucumber.class)//Karate.class
@CucumberOptions(
        features = "src/main/resources/features/Weborder",
        glue="com/weborder/stepdefinitions",
        dryRun= false,
        tags="@web",
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class WebOrderRunner {


}
