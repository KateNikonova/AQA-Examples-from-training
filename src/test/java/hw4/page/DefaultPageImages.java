package hw4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DefaultPageImages {

    public WebDriver driver;

    public DefaultPageImages(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // icon practise locator
    @FindBy(css = "div.benefit-icon>span.icons-benefit.icon-practise")
    public WebElement iconPractise;

    //icon custom locator
    @FindBy(css = "div.benefit-icon>span.icons-benefit.icon-custom")
    public WebElement iconCustom;

    //icon multi locator
    @FindBy(css = "div.benefit-icon>span.icons-benefit.icon-multi")
    public WebElement iconMulti;

    //icon base locator
    @FindBy(css = "div.benefit-icon>span.icons-benefit.icon-base")
    public WebElement iconBase;

    //get all images amount
    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8>li")
    public List<WebElement> images;

    //check images amount
    public void checkImagesAmount(int num) {
        int size = images.size();
        assertEquals(size, num);
    }

    //check images presence
    public void imageIsDisplayed(WebElement element) {
        element.isDisplayed();
    }

}
