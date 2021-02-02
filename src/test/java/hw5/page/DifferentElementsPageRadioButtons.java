package hw5.page;

import hw5.data.AbstractPageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentElementsPageRadioButtons extends AbstractPageTest {

    public DifferentElementsPageRadioButtons(WebDriver driver) {
        super(driver);
    }

    // Gold radio locator
    @FindBy(css = "div.checkbox-row>label.label-radio:nth-child(1)")
    public WebElement radioGold;

    // Silver radio locator
    @FindBy(css = "div.checkbox-row>label.label-radio:nth-child(2)")
    public WebElement radioSilver;

    // Bronze radio locator
    @FindBy(css = "div.checkbox-row>label.label-radio:nth-child(3)")
    public WebElement radioBronze;

    // Selen radio locator
    @FindBy(css = "div.checkbox-row>label.label-radio:nth-child(4)")
    public WebElement radioSelen;

    public void selectRadio(WebElement element) {
        element.click();
    }
}
