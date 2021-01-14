package hw3.ex2;

import hw3.data.AbstractPageTest;
import hw3.data.GetProperties;
import hw3.page.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DifferentElementsVPOTest extends AbstractPageTest {

    public static DefaultPage defaultPage;
    public static LoginPage loginPage;
    public static DropDownService dropDownService;
    public static DifferentElementPageCheckboxes checkbox;
    public static DifferentElementsPageRadioButtons radioButton;
    public static DropDownColors dropDownColors;
    public static DifferentElementsPageLogs log;

    @BeforeClass
    public static void startUp() {
        defaultPage = new DefaultPage(driver);
        loginPage = new LoginPage(driver);
        dropDownService = new DropDownService(driver);
        checkbox = new DifferentElementPageCheckboxes(driver);
        radioButton = new DifferentElementsPageRadioButtons(driver);
        dropDownColors = new DropDownColors(driver);
        log = new DifferentElementsPageLogs(driver);

    }

    @Test
    public void loginTest() {

    //1. Open test site by URL
    //2. Assert Browser title
    defaultPage.openDefaultPage();
    defaultPage.checkDefaultPageTitle();

    //3. Perform login
    // 4. Assert Username is logged
    loginPage.openView();
    loginPage.inputLogin(GetProperties.getProperty("login"));
    loginPage.inputPassword(GetProperties.getProperty("password"));
    loginPage.clickLoginButton();
    loginPage.checkUserName(GetProperties.getProperty("username"));

    //5. Open through the header menu Service -> Different Elements Page
    dropDownService.openServiceDropdown();
    dropDownService.openDifferentElementsPage();

    //6. Select checkboxes
    checkbox.selectCheckbox(checkbox.checkWater);
    checkbox.selectCheckbox(checkbox.checkWind);

    //7. Select radio
    radioButton.selectRadio(radioButton.radioSelen);

    //8. Select in dropdown
    dropDownColors.selectElementFromColors(GetProperties.getProperty("color"));

    //9.1 Assert that
    //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
    //•	for radio button there is a log row and value is corresponded to the status of radio button
    //•	for dropdown there is a log row and value is corresponded to the selected value
    log.checkLogPresence(log.logWater);
    log.checkLogPresence(log.logWind);
    log.checkLogPresence(log.logSelen);
    log.checkLogPresence(log.logYellow);

    }
}
