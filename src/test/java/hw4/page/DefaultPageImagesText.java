package hw4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DefaultPageImagesText {
    public WebDriver driver;

    public DefaultPageImagesText(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // icon practise text locator
    @FindBy(css = "div.col-sm-3:nth-child(1)>div.benefit>span.benefit-txt")
    public WebElement iconPractiseText;

    //icon custom  text locator
    @FindBy(css = "div.col-sm-3:nth-child(2)>div.benefit>span.benefit-txt")
    public WebElement iconCustomText;

    //icon multi text locator
    @FindBy(css = "div.col-sm-3:nth-child(3)>div.benefit>span.benefit-txt")
    public WebElement iconBaseText;

    //icon base text locator
    @FindBy(css = "div.col-sm-3:nth-child(4)>div.benefit>span.benefit-txt")
    public WebElement iconMultiText;

    //get all images text amount
    @FindBy(css = "div.benefit>span.benefit-txt")
    public List<WebElement> imagesText;

    //check images text amount
    public void checkImagesTextAmount(Integer num) {
        Integer size = imagesText.size();
        assertEquals(size, num);
    }

    //check images text presence
    public void imageTextIsDisplayed(WebElement element) {
        element.isDisplayed();
    }

    //check images text text
    public void checkImagesText(WebElement element, String text) {

        assertEquals(element.getText(), text);
    }
}
