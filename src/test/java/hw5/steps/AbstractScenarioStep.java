package hw5.steps;

import hw5.data.WebDriverSingleton;
import hw5.page.*;
import org.openqa.selenium.WebDriver;

public class AbstractScenarioStep {

    public DefaultPage defaultPage;
    public LoginPage loginPage;
    public DropDownService dropDownService;
    public DifferentElementPageCheckboxes checkbox;
    public DifferentElementsPageRadioButtons radioButton;
    public DropDownColors dropDownColors;
    public CheckPageLogs log;
    public UserTablePage userTablePage;

    protected AbstractScenarioStep(){

        WebDriver driver = WebDriverSingleton.getDriver();
        defaultPage = new DefaultPage(driver);
        loginPage = new LoginPage(driver);
        dropDownService = new DropDownService(driver);
        checkbox = new DifferentElementPageCheckboxes(driver);
        radioButton = new DifferentElementsPageRadioButtons(driver);
        dropDownColors = new DropDownColors(driver);
        log = new CheckPageLogs(driver);
        userTablePage = new UserTablePage(driver);
    }
}
