package hw4.page;

import hw4.data.GetProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class DefaultPage {

    public WebDriver driver;

    public DefaultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openDefaultPage() {
        driver.get(GetProperties.getProperty("mainPage"));
    }

    public void checkDefaultPageTitle() {
        assertEquals(driver.getTitle(), GetProperties.getProperty("pageTitle"));
    }
}
