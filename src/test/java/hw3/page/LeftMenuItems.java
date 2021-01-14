package hw3.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class LeftMenuItems {

    public WebDriver driver;

    public LeftMenuItems(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // home item locator
    @FindBy(css = "ul.sidebar-menu>li:nth-child(1)>a>span")
    public WebElement menuItemHome;

    //contact home item locator
    @FindBy(css = "ul.sidebar-menu>li:nth-child(2)>a>span")
    public WebElement menuItemContactForm;

    //service item locator
    @FindBy(css = "ul.sidebar-menu>li:nth-child(3)>a>span")
    public WebElement menuItemService;

    //metal & colors item locator
    @FindBy(css = "ul.sidebar-menu>li:nth-child(4)>a>span")
    public WebElement menuItemMetalColors;

    //element packs item locator
    @FindBy(css = "ul.sidebar-menu>li:nth-child(5)>a>span")
    public WebElement menuItemElementPacks;

    //get all headers
    @FindBy(css = "ul.sidebar-menu>li")
    public List<WebElement> items;

    //check items text
    public void checkItems(WebElement element, String text) {
        assertEquals(element.getText(), text);
    }

    //check items amount
    public void checkItemsAmount(Integer num) {
        Integer size = items.size();
        assertEquals(size, num);
    }
}
