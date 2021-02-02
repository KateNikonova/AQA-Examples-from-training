package hw5.steps;

import io.cucumber.java.en.Then;

public class ThenStep extends AbstractScenarioStep {

    @Then("1 log row has {string} text in log section")
    public void verifyLogRowForWater(String condition) {
        switch (condition) {
            case "'Water': condition changed to true":
                log.checkLogPresence(log.logWater);
                break;
            case "'Wind': condition changed to true":
                log.checkLogPresence(log.logWind);
                break;
            case "metal: value changed to Selen":
                log.checkLogPresence(log.logSelen);
                break;
            case "Colors: value changed to 'Yellow'":
                log.checkLogPresence(log.logYellow);
                break;
            case "Vip: condition changed to true":
                log.checkLogPresence(log.logVipChanges);
                break;
            default:
                break;

        }
    }

    @Then("{string} page should be opened")
    public void chosenPageOpen(String title) {
        if (title.equals("User Table")) {
            userTablePage.checkPageTitle();
        }

    }

    @Then("{int} Type Dropdowns should be displayed on Users Table on User Table Page")
    public void verifySixNumberTypeDropdownsDisplayed(int droDownNumber) {
        switch (droDownNumber) {
            case 1:
                userTablePage.elementDisplayed(userTablePage.numberTypeDropDownOne);
                break;
            case 2:
                userTablePage.elementDisplayed(userTablePage.numberTypeDropDownTwo);
                break;
            case 3:
                userTablePage.elementDisplayed(userTablePage.numberTypeDropDownThree);
                break;
            case 4:
                userTablePage.elementDisplayed(userTablePage.numberTypeDropDownFour);
                break;
            case 5:
                userTablePage.elementDisplayed(userTablePage.numberTypeDropDownFive);
                break;
            case 6:
                userTablePage.elementDisplayed(userTablePage.numberTypeDropDownSix);
                break;
            default:
                break;

        }

    }

    @Then("{string} should be displayed on Users Table on User Table Page")
    public void verifySixUsernamesDisplayed(String userName) {
        switch (userName) {
            case "Roman":
                userTablePage.elementDisplayed(userTablePage.userNameOne);
                break;
            case "Sergey Ivan":
                userTablePage.elementDisplayed(userTablePage.userNameTwo);
                break;
            case "Vladzimir":
                userTablePage.elementDisplayed(userTablePage.userNameThree);
                break;
            case "Helen Bennett":
                userTablePage.elementDisplayed(userTablePage.userNameFour);
                break;
            case "Yoshi Tannamuri":
                userTablePage.elementDisplayed(userTablePage.userNameFive);
                break;
            case "Giovanni Rovelli":
                userTablePage.elementDisplayed(userTablePage.userNameSix);
                break;
            default:
                break;
        }
    }

    @Then("{string} texts under images should be displayed on Users Table on User Table Page")
    public void verifySixDescriptionTextsUnderImages(String textImage) {
        switch (textImage) {
            case "Wolverine":
                userTablePage.elementDisplayed(userTablePage.descriptionTextOne);
                break;
            case "Spider Man":
                userTablePage.elementDisplayed(userTablePage.descriptionTextTwo);
                break;
            case "Punisher":
                userTablePage.elementDisplayed(userTablePage.descriptionTextThree);
                break;
            case "Captain America some description":
                userTablePage.elementDisplayed(userTablePage.descriptionTextFour);
                break;
            case "Cyclope some description":
                userTablePage.elementDisplayed(userTablePage.descriptionTextFive);
                break;
            case "Hulksome description":
                userTablePage.elementDisplayed(userTablePage.descriptionTextSix);
                break;
            default:
                break;
        }

    }

    @Then("{int} checkboxes should be displayed on Users Table on User Table Page")
    public void verifySixCheckboxesDisplayed(int num) {
        userTablePage.numberCheckboxes(num);
    }

    @Then("dropdownlist should contain {string} in column Type for user {string}")
    public void verifyDropListValues(String dropDownvValue, String userToCheck) {
        if (userToCheck.equals("Roman")) {
            switch (dropDownvValue) {
                case "Admin":
                    userTablePage.assertOptionText(userTablePage.valueDropDownOneList,dropDownvValue);
                    break;
                case "User":
                    userTablePage.assertOptionText(userTablePage.valueDropDownTwoList,dropDownvValue);
                    break;
                case "Manager":
                    userTablePage.assertOptionText(userTablePage.valueDropDownThreeList,dropDownvValue);
                    break;
                default:
                    break;
            }
        }
    }

    @Then("User name present on the page")
    public void checkName() {
        loginPage.checkUserName("ROMAN IOVLEV");
    }

}
