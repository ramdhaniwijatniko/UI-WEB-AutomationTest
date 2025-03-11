package org.example.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "org.example.stepdefinitions",  // Pastikan ini sesuai dengan package LoginSteps.java
    plugin = {"pretty", "html:build/cucumber-reports/cucumber-reports.html",
                       "json:build/cucumber-reports/cucumber.json"},
    monochrome = true
)
public class CucumberTestRunner {
}