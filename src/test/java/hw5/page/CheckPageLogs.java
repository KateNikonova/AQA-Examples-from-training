package hw5.page;

import hw5.data.AbstractPageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckPageLogs extends AbstractPageTest {


    public CheckPageLogs(WebDriver driver) {
        super(driver);
    }

    // log Water locator
    @FindBy(xpath = "//li[contains(text(),'Water: condition changed to true')]")
    public WebElement logWater;

    // log Wind locator
    @FindBy(xpath = "//li[contains(text(),'Wind: condition changed to true')]")
    public WebElement logWind;

    // log Selen locator
    @FindBy(xpath = "//li[contains(text(),'metal: value changed to Selen')]")
    public WebElement logSelen;

    // log Yellow locator
    @FindBy(xpath = "//li[contains(text(),'Colors: value changed to Yellow')]")
    public WebElement logYellow;

    // log Yellow locator
    @FindBy(xpath = "//li[contains(text(),'Vip: condition changed to true')]")
    public WebElement logVipChanges;

    // Check log presence
    public void checkLogPresence(WebElement element) {
        element.isDisplayed();
    }
}
