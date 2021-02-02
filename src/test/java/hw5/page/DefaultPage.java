package hw5.page;

import hw5.data.AbstractPageTest;
import hw5.data.GetProperties;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class DefaultPage extends AbstractPageTest {

    private static final String testing_page = "https://jdi-testing.github.io/jdi-light/index.html";

    public DefaultPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(testing_page);
    }

    public void checkTitle() {
        assertEquals(driver.getTitle(), GetProperties.getProperty("pageTitle"));
    }
}