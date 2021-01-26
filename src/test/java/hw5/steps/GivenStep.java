package hw5.steps;

import hw5.data.GetProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GivenStep extends AbstractScenarioStep {

    @Given("I open JDI GitHub site")
    public void iOpenJdiGitHubSite() {
        defaultPage.open();
        defaultPage.checkTitle();
    }

    @Given("I login as user {string}")
    public void iLoginAsUser(String user) {
        if (user.equals("Roman Iovlev")) {
            loginPage.openView();
            loginPage.inputLogin(GetProperties.getProperty("login"));
            loginPage.inputPassword(GetProperties.getProperty("password"));
            loginPage.clickLoginButton();
//                loginPage.checkUserName(GetProperties.getProperty("username"));
        }
    }

    @Given("I click on {string} button in Header")
    public void iClickOnButton(String header) {
        if (header.equals("Service")) {
            dropDownService.openServiceDropdown();
        }
    }

    @Given("I click on {string} button in Service dropdown")
    public void iOpenSpecificPage(String page) {
        switch (page) {
            case "Different Elements Page":
                dropDownService.openDifferentElementsPage();
                break;
            case "User Table":
                dropDownService.openUserTablePage();
                break;
            default:
                break;

        }
    }
}
