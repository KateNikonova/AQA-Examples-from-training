package hw5.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class AbstractPageTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected AbstractPageTest(WebDriver driver) {
        this.driver=driver;
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

}
