package hw3.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstractPageTest {


    protected static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void ChromeSetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass(alwaysRun = true)
    public  void ChromeClose()
    {
        driver.quit();
        driver=null;
    }
}
