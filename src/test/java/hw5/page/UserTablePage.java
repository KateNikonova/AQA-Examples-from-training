package hw5.page;

import hw5.data.AbstractPageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserTablePage extends AbstractPageTest {


    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public void checkPageTitle() {
        assertEquals(driver.getTitle(), "User Table");
    }

    @FindBy(xpath = " //input[@id='ivan']")
    public WebElement checkboxSergeyIvan;

    public void selectCheckbox(WebElement element) {
        element.click();
    }

    //Numbers
    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement numberTypeDropDownOne;

    @FindBy(xpath = "//tbody/tr[2]")
    public WebElement numberTypeDropDownTwo;

    @FindBy(xpath = "//tbody/tr[3]")
    public WebElement numberTypeDropDownThree;

    @FindBy(xpath = "//tbody/tr[4]")
    public WebElement numberTypeDropDownFour;

    @FindBy(xpath = "//tbody/tr[5]")
    public WebElement numberTypeDropDownFive;

    @FindBy(xpath = "//tbody/tr[6]")
    public WebElement numberTypeDropDownSix;


    //Dropdown options
    @FindBy(xpath = "//tbody/tr[1]/td[2]/select[1]/option[1]")
    public WebElement valueDropDownOneList;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/select[1]/option[2]")
    public WebElement valueDropDownTwoList;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/select[1]/option[3]")
    public WebElement valueDropDownThreeList;


    //User names
    @FindBy(xpath = " //a[contains(text(),'Roman')]")
    public WebElement userNameOne;

    @FindBy(xpath = " //a[contains(text(),'Sergey Ivan')]")
    public WebElement userNameTwo;

    @FindBy(xpath = " //a[contains(text(),'Vladzimir')]")
    public WebElement userNameThree;

    @FindBy(xpath = " //a[contains(text(),'Helen Bennett')]")
    public WebElement userNameFour;

    @FindBy(xpath = " //a[contains(text(),'Yoshi Tannamuri')]")
    public WebElement userNameFive;

    @FindBy(xpath = "//a[contains(text(),'Giovanni Rovelli')]")
    public WebElement userNameSix;

    //Texts under images
    @FindBy(xpath = " //span[contains(text(),'Wolverine')]")
    public WebElement descriptionTextOne;

    @FindBy(xpath = " //span[contains(text(),'Spider Man')]")
    public WebElement descriptionTextTwo;

    @FindBy(xpath = "//span[contains(text(),'Punisher')]")
    public WebElement descriptionTextThree;

    @FindBy(xpath = "//span[contains(text(),'Captain America')]")
    public WebElement descriptionTextFour;

    @FindBy(xpath = "//span[contains(text(),'Cyclope')]")
    public WebElement descriptionTextFive;

    @FindBy(xpath = "//span[contains(text(),'Hulk')]")
    public WebElement descriptionTextSix;

    public void elementDisplayed(WebElement element) {
        assertTrue(element.isDisplayed());
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxesNumber;

    public void numberCheckboxes(int num) {
        assertEquals(checkboxesNumber.size(), num);
    }

    public void assertOptionText(WebElement option, String text){
        String textOption;
        textOption = option.getText();
        textOption.equals(text);
    }


}
