package hw2.ex1;

import hw2.data.AbstractPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DefaultPageTest extends AbstractPageTest {

    final String testing_page = "https://jdi-testing.github.io/jdi-light/index.html";

    public static void loginPage(String name, String password) {
        WebDriverWait wait_icon = new WebDriverWait(driver, 10);
        wait_icon.until(ExpectedConditions.presenceOfElementLocated(By.id("user-icon")));
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    public static void checkElementPresence(String path, String type) {
      switch (type){
          case "id":
              assertTrue(driver.findElement(By.id(path)).isDisplayed());
              break;
          case "css":
              assertTrue(driver.findElement(By.cssSelector(path)).isDisplayed());
              break;
          default:
              assertTrue(driver.findElement(By.xpath(path)).isDisplayed());
      }
    }

    public static void checkElementPresenceAndValue(String path, String text, String type) {
        switch (type){
            case "id":
                assertTrue(driver.findElement(By.id(path)).isDisplayed());
                assertEquals(driver.findElement(By.id(path)).getText(), text);
                break;
            case "css":
                assertTrue(driver.findElement(By.cssSelector(path)).isDisplayed());
                assertEquals(driver.findElement(By.cssSelector(path)).getText(),text);
                break;
            default:
                assertTrue(driver.findElement(By.xpath(path)).isDisplayed());
                assertEquals(driver.findElement(By.xpath(path)).getText(),text);
                break;
        }
    }

    @Test (description = "Default Page Test")
    public void DefaultPageTestMethod() {

        driver.manage().window().maximize();

        //1. Open test site by URL
        driver.get(testing_page);

        //2. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

        //3. Perform login
        loginPage("Roman","Jdi1234");

        //4. Assert Username is logged
        WebDriverWait waitNames = new WebDriverWait(driver, 20);
        waitNames.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        checkElementPresenceAndValue("user-name","ROMAN IOVLEV","id");


        //5. Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> headers = driver.findElements (By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li"));
        assertEquals(headers.size(),4);
        checkElementPresenceAndValue("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(1)>a","HOME","css");
        checkElementPresenceAndValue("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(2)>a","CONTACT FORM","css");
        checkElementPresenceAndValue("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(3)>a","SERVICE","css");
        checkElementPresenceAndValue("ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(4)>a","METALS & COLORS","css");

        //6. Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> images = driver.findElements (By.cssSelector("div.benefit>div.benefit-icon"));
        assertEquals(images.size(),4);
        checkElementPresence("div.benefit-icon>span.icons-benefit.icon-practise","css");
        checkElementPresence("div.benefit-icon>span.icons-benefit.icon-custom","css");
        checkElementPresence("div.benefit-icon>span.icons-benefit.icon-multi","css");
        checkElementPresence("div.benefit-icon>span.icons-benefit.icon-base","css");

        //7. Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<WebElement> texts = driver.findElements (By.cssSelector("div.benefit>span.benefit-txt"));
        assertEquals(texts.size(),4);
        checkElementPresenceAndValue("div.col-sm-3:nth-child(1)>div.benefit>span.benefit-txt","To include good practices\n" +
                "and ideas from successful\n" +
                "EPAM project","css");
        checkElementPresenceAndValue("div.col-sm-3:nth-child(2)>div.benefit>span.benefit-txt","To be flexible and\n" +
                "customizable","css");
        checkElementPresenceAndValue("div.col-sm-3:nth-child(3)>div.benefit>span.benefit-txt","To be multiplatform","css");
        checkElementPresenceAndValue("div.col-sm-3:nth-child(4)>div.benefit>span.benefit-txt","Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…","css");

        //8. Assert that there is the iframe with “Frame Button” exist
        WebDriverWait waiti_frame = new WebDriverWait(driver, 20);
        waiti_frame.until(ExpectedConditions.presenceOfElementLocated(By.id("frame")));
        checkElementPresence("frame","id");


        //9. Switch to the iframe and check that there is “Frame Button” in the iframe
        String window_hendler = driver.getWindowHandle();
        driver.switchTo().frame("frame");
        checkElementPresence("frame-button","id");
        driver.findElement(By.id("frame-button")).click();

        //10.Switch to original window back
        driver.switchTo().window(window_hendler);

        //11. Assert that there are 5 items in the Left Section are displayed and they have proper text
        List<WebElement> items = driver.findElements (By.cssSelector("ul.sidebar-menu>li"));
        assertEquals(items.size(),5);
        checkElementPresenceAndValue("ul.sidebar-menu>li:nth-child(1)>a>span","Home","css");
        checkElementPresenceAndValue("ul.sidebar-menu>li:nth-child(2)>a>span","Contact form","css");
        checkElementPresenceAndValue("ul.sidebar-menu>li:nth-child(3)>a>span","Service","css");
        checkElementPresenceAndValue("ul.sidebar-menu>li:nth-child(4)>a>span","Metals & Colors","css");
        checkElementPresenceAndValue("ul.sidebar-menu>li:nth-child(5)>a>span","Elements packs","css");
    }

}
