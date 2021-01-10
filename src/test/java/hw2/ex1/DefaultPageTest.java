package hw2.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DefaultPageTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void ChromeSetUp()
    {
        driver = new ChromeDriver();
    }

    @Test (description = "Default Page Test")
    public void MyTes_01() {

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

        //5. Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> headers = driver.findElements (By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li"));
        assertEquals(headers.size(),4);
        assertTrue(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(1)>a")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(1)>a")).getText(),"HOME");
        assertTrue(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(2)>a")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(2)>a")).getText(),"CONTACT FORM");
        assertTrue(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(3)>a")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(3)>a")).getText(),"SERVICE");
        assertTrue(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(4)>a")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(4)>a")).getText(),"METALS & COLORS");

        //6. Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> images = driver.findElements (By.cssSelector("div.benefit>div.benefit-icon"));
        assertEquals(images.size(),4);
        assertTrue(driver.findElement(By.cssSelector("div.benefit-icon>span.icons-benefit.icon-practise")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector("div.benefit-icon>span.icons-benefit.icon-custom")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector("div.benefit-icon>span.icons-benefit.icon-multi")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector("div.benefit-icon>span.icons-benefit.icon-base")).isDisplayed());

        //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<WebElement> texts = driver.findElements (By.cssSelector("div.benefit>span.benefit-txt"));
        assertEquals(texts.size(),4);
        assertEquals(driver.findElement(By.cssSelector("div.col-sm-3:nth-child(1)>div.benefit>span.benefit-txt")).getText(),"To include good practices\n" +
                "and ideas from successful\n" +
                "EPAM project");
        assertEquals(driver.findElement(By.cssSelector("div.col-sm-3:nth-child(2)>div.benefit>span.benefit-txt")).getText(),"To be flexible and\n" +
                "customizable");
        assertEquals(driver.findElement(By.cssSelector("div.col-sm-3:nth-child(3)>div.benefit>span.benefit-txt")).getText(),"To be multiplatform");
        assertEquals(driver.findElement(By.cssSelector("div.col-sm-3:nth-child(4)>div.benefit>span.benefit-txt")).getText(),"Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…");

        //8. Assert that there is the iframe with “Frame Button” exist
        WebDriverWait waitiframe = new WebDriverWait(driver, 20);
        waitiframe.until(ExpectedConditions.presenceOfElementLocated(By.id("frame")));
        assertTrue(driver.findElement(By.id("frame")).isDisplayed());

        //9. Switch to the iframe and check that there is “Frame Button” in the iframe
        String windowHendler = driver.getWindowHandle();
        driver.switchTo().frame("frame");
        assertTrue(driver.findElement(By.id("frame-button")).isDisplayed());
        driver.findElement(By.id("frame-button")).click();

        //10.Switch to original window back
        driver.switchTo().window(windowHendler);

        //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
        List<WebElement> items = driver.findElements (By.cssSelector("ul.sidebar-menu>li"));
        assertEquals(items.size(),5);
        assertTrue(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(1)>a>span")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(1)>a>span")).getText(),"Home");
        assertTrue(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(2)>a>span")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(2)>a>span")).getText(),"Contact form");
        assertTrue(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(3)>a>span")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(3)>a>span")).getText(),"Service");
        assertTrue(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(4)>a>span")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(4)>a>span")).getText(),"Metals & Colors");
        assertTrue(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(5)>a>span")).isDisplayed());
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(5)>a>span")).getText(),"Elements packs");
    }
    //12. Close Browser
    @AfterMethod(alwaysRun = true)
    public  void ChromeClose()
    {
        driver.quit();
        driver=null;
    }
}
