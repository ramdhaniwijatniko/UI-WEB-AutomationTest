package org.example.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "org.example.stepdefinitions",  // Pastikan ini sesuai dengan package LoginSteps.java
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class CucumberTestRunner {
}