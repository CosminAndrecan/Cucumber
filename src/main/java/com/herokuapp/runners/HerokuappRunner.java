package com.herokuapp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/Herokuapp",
        glue = "com/herokuapp/stepdefinitions",
        dryRun = false,
        tags = "@herokuapp",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTest.txt"}
)
public class HerokuappRunner {
}

