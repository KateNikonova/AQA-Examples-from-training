package hw4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Headers {


    public WebDriver driver;

    public Headers(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // home header locator
    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(1)>a")
    public WebElement headerHome;

    //contact home header locator
    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(2)>a")
    public WebElement headerContactForm;

    //service header locator
    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(3)>a")
    public WebElement headerService;

    //metal & colors header locator
    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8>li:nth-child(4)>a")
    public WebElement headerMetalColors;

    //get all headers
    @FindBy(css = "div.benefit>div.benefit-icon")
    public List<WebElement> images;

    //check header text
    public void checkHeaders(WebElement element, String text) {
        assertEquals(element.getText(), text);
    }

    //check header amount
    public void checkHeadersAmount(Integer num) {
        Integer size = images.size();
        assertEquals(size, num);
    }

}
