package hw5;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"classpath:hw5/cucumber_features"},
        plugin = {
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        })
public class RunCucumberScenario extends AbstractTestNGCucumberTests {
}
