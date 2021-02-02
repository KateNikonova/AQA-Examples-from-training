package hw5.page;

import hw5.data.AbstractPageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownService extends AbstractPageTest {

    public DropDownService(WebDriver driver) {
        super(driver);
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

    //User Table Page item
    @FindBy(xpath = "//a[contains(text(),'User Table')]")
    public WebElement userTablePageItem;

    //Open Different Elements Page
    public void openDifferentElementsPage() {
        differentPageItem.click();
    }

    //Open User Table Page
    public void openUserTablePage() {
        userTablePageItem.click();
    }
}
