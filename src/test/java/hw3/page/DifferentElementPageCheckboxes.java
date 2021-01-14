package hw3.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentElementPageCheckboxes {

    public WebDriver driver;

    public DifferentElementPageCheckboxes(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    // Water checkbox locator
    @FindBy(css = "div.checkbox-row>label:nth-child(1)")
    public WebElement checkWater;

    // Earth checkbox locator
    @FindBy(css = "div.checkbox-row>label:nth-child(2)")
    public WebElement checkEarth;

    // Wind checkbox locator
    @FindBy(css = "div.checkbox-row>label:nth-child(3)")
    public WebElement checkWind;

    // Fire checkbox locator
    @FindBy(css = "div.checkbox-row>label:nth-child(4)")
    public WebElement checkFire;

    public void selectCheckbox(WebElement element){
        element.click();
    }

}
