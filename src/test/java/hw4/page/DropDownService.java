package hw4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownService {

    public WebDriver driver;

    public DropDownService(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //service dropdown
    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8>li.dropdown")
    public WebElement dropdownService;

    //open service dropdown
    public void openServiceDropdown() {
        dropdownService.click();
    }

    //Different Page item
    @FindBy(xpath = "//a[contains(text(),'Different elements')]")
    public WebElement differentPageItem;

    //Open Different Elements Page
    public void openDifferentElementsPage() {
        differentPageItem.click();
    }

}
