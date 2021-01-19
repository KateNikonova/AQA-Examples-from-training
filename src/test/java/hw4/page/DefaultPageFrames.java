package hw4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultPageFrames {
    public WebDriver driver;

    public DefaultPageFrames(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // frame with button
    @FindBy(id = "frame")
    public WebElement iframe;

    //frame button
    @FindBy(id = "frame-button")
    public WebElement iframeButton;


    //check frame button

    public void checkButton() {
        iframeButton.isDisplayed();
    }

}
