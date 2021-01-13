package hw2.ex2;

import hw2.data.AbstractPageTest;
import hw2.ex1.DefaultPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DifElementsPageTest extends AbstractPageTest {

    final String testing_page = "https://jdi-testing.github.io/jdi-light/index.html";

    public void findAndClickElement(String path, String type)
    {
        switch (type){
        case "id":
            driver.findElement(By.id(path)).click();
            break;
        case "css":
            driver.findElement(By.cssSelector(path)).click();
            break;
        default:
            driver.findElement(By.xpath(path)).click();
    }

    }

    @Test (description = "Different Elements Page Test")
    public void DifferentElementsPageTestMethod()  {

        driver.manage().window().maximize();

        //1. Open test site by URL
        driver.get(testing_page);

        //2. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

        //3. Perform login
        DefaultPageTest.loginPage("Roman","Jdi1234");

        //4. Assert Username is logged
        WebDriverWait wait_name = new WebDriverWait(driver, 20);
        wait_name.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        DefaultPageTest.checkElementPresenceAndValue("user-name","ROMAN IOVLEV","id");

        //5. Open through the header menu Service -> Different Elements Page
        findAndClickElement("ul.uui-navigation.nav.navbar-nav.m-l8>li.dropdown","css");
        WebDriverWait list = new WebDriverWait(driver, 10);
        list.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Different elements')]")));
        findAndClickElement("//a[contains(text(),'Different elements')]","xpath");

        //6. Select checkboxes
        findAndClickElement("div.checkbox-row>label:nth-child(1)","css");
        findAndClickElement("div.checkbox-row>label:nth-child(3)","css");

        //7. Select radio
        findAndClickElement("div.checkbox-row>label.label-radio:nth-child(4)","css");

        //8. Select in dropdown
        Select drpYellow  = new Select(driver.findElement(By.cssSelector("div.colors>select.uui-form-element")));
        drpYellow.selectByVisibleText("Yellow");

        //9.1 Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        DefaultPageTest.checkElementPresence("//li[contains(text(),'Water')]","xpath");
        DefaultPageTest.checkElementPresence("//li[contains(text(),'Wind')]","xpath");

        //•	for radio button there is a log row and value is corresponded to the status of radio button
        DefaultPageTest.checkElementPresence("//li[contains(text(),'Selen')]","xpath");

        //•	for dropdown there is a log row and value is corresponded to the selected value
        DefaultPageTest.checkElementPresence("//li[contains(text(),'Yellow')]","xpath");

    }
}
