package hw5.hooks;

import hw5.data.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void startUp(){
        WebDriverSingleton.getDriver();
    }


    @After
    public void tearDown(){
        WebDriverSingleton.closeDriver();
    }
}
