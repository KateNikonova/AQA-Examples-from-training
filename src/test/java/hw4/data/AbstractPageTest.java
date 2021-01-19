package hw4.data;


import hw4.steps.ActionStep;
import hw4.steps.AssertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractPageTest {

    public WebDriver driver;
    public ActionStep actionStep;
    public AssertionStep assertionStep;

    @BeforeMethod()
    public void ChromeSetUp(ITestContext testContext) {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        testContext.setAttribute("driver", driver);
        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);
        testContext.setAttribute("driver", driver);

    }

    @AfterMethod()
    public void ChromeClose() {
        driver.quit();
        driver = null;
    }
}
