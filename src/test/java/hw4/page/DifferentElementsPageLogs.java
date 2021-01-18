package hw4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentElementsPageLogs {

    public WebDriver driver;

    public DifferentElementsPageLogs(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // log Water locator
    @FindBy(xpath = "//li[contains(text(),'Water')]")
    public WebElement logWater;

    // log Wind locator
    @FindBy(xpath = "//li[contains(text(),'Wind')]")
    public WebElement logWind;

    // log Selen locator
    @FindBy(xpath = "//li[contains(text(),'Selen')]")
    public WebElement logSelen;

    // log Yellow locator
    @FindBy(xpath = "//li[contains(text(),'Yellow')]")
    public WebElement logYellow;

    // Check log presence
    public void checkLogPresence(WebElement element) {
        element.isDisplayed();
    }
}
