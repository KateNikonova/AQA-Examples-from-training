package hw2.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DifElementsPageTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void ChromeSetUp()
    {
        driver = new ChromeDriver();
    }

    @Test (description = "Different Elements Page Test")
    public void MyTest_02()  {

        driver.manage().window().maximize();

        //1. Open test site by URL
        driver.get("https://jdi-testing.github.io/jdi-light/index.html");

        //2. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

        //3. Perform login
        WebDriverWait waitcicon = new WebDriverWait(driver, 10);
        waitcicon.until(ExpectedConditions.presenceOfElementLocated(By.id("user-icon")));
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.id("name")).sendKeys("Roman");
        driver.findElement(By.id("password")).sendKeys("Jdi1234");
        driver.findElement(By.id("login-button")).click();

        //4. Assert Username is logged
        WebDriverWait waitname = new WebDriverWait(driver, 20);
        waitname.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        assertTrue(driver.findElement(By.id("user-name")).isDisplayed());
        assertEquals(driver.findElement(By.id("user-name")).getText(), "ROMAN IOVLEV");

        //5. Open through the header menu Service -> Different Elements Page
        driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li.dropdown")).click();
        WebDriverWait list = new WebDriverWait(driver, 10);
        list.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Different elements')]")));
        driver.findElement(By.xpath("//a[contains(text(),'Different elements')]")).click();

        //6. Select checkboxes
        WebElement checkbox1 = driver.findElement(By.cssSelector("div.checkbox-row>label:nth-child(1)"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("div.checkbox-row>label:nth-child(3)"));
        checkbox1.click();
        checkbox2.click();

        //7. Select radio
        WebElement radio = driver.findElement(By.cssSelector("div.checkbox-row>label.label-radio:nth-child(4)"));
        radio.click();

        //8. Select in dropdown
        Select drpYellow  = new Select(driver.findElement(By.cssSelector("div.colors>select.uui-form-element")));
        drpYellow.selectByVisibleText("Yellow");

        //9.1 Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Water')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Wind')]")).isDisplayed());

        //•	for radio button there is a log row and value is corresponded to the status of radio button
        assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Selen')]")).isDisplayed());

        //•	for dropdown there is a log row and value is corresponded to the selected value
        assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Yellow')]")).isDisplayed());

    }

    //10. Close Browser
    @AfterMethod(alwaysRun = true)
        public  void ChromeClose()
    {
        driver.quit();
        driver=null;
    }
}
