package hw3.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownColors {

    public WebDriver driver;

    public DropDownColors(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Different Elements Page - Colors dropdown
    @FindBy(css = "div.colors>select.uui-form-element")
    public WebElement dropdownColor;


    //Select element from dropdown by text
    public void selectElementFromColors(String text) {
        Select dropdownColorsMethod = new Select(dropdownColor);
        dropdownColorsMethod.selectByVisibleText(text);
    }
}
