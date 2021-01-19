package hw4.steps;

import hw4.data.GetProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep{

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Open Default page")
    public void openDefaultPage(){
        defaultPage.openDefaultPage();
    }

    @Step("Perform login")
    public void performLogin(String login,String password,String username){
        loginPage.openView();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();
        loginPage.checkUserName(username);
    }

    @Step("iframe with “Frame Button” exist")
    public void checkIframeButton(){
        frame.checkButton();
    }

    @Step("Open Different Elements page")
    public void openDifferentElementsPage(){
        dropDownService.openServiceDropdown();
        dropDownService.openDifferentElementsPage();
    }

    @Step("Select elements on the Different Elements Page")
    public void selectElements(){
        checkbox.selectCheckbox(checkbox.checkWater);
        checkbox.selectCheckbox(checkbox.checkWind);
        radioButton.selectRadio(radioButton.radioSelen);
        dropDownColors.selectElementFromColors(GetProperties.getProperty("color"));
    }
}
