package hw6;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static hw6.JdiSite.*;
import static hw6.JdiSite.homePage;
import static hw6.entities.User.ROMAN;


public class AbstractJdiTest {

    @BeforeSuite
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
        open();
        login(ROMAN);
        homePage.checkUserLoggedIn(ROMAN);
        homePage.openMetalAndColorsPage();
    }


    @AfterSuite
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
