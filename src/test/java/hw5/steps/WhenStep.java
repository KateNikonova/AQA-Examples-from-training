package hw5.steps;

import hw4.data.GetProperties;
import io.cucumber.java.en.When;

public class WhenStep extends AbstractScenarioStep{

    @When("I select {string} checkbox")
    public void iSelectWaterCheckbox(String condition){
       switch (condition) {
           case "Water":
               checkbox.selectCheckbox(checkbox.checkWater);
               break;
           case "Wind":
               checkbox.selectCheckbox(checkbox.checkWind);
               break;
           default:
               break;

       }
    }

    @When("I select {string} radio")
    public void iSelectSelenRadio(String element){
        switch (element){
            case "Selen":
                radioButton.selectRadio(radioButton.radioSelen);
                break;
            default:
                break;
        }


    }

    @When("I select {string} in Colors dropdown")
    public void iSelectYellowInColorsDropdown(String color){
        switch (color){
            case "Yellow":
                dropDownColors.selectElementFromColors(GetProperties.getProperty("color"));
                break;
            default:
                break;
        }

    }

    @When("I select {string} checkbox for {string}")
    public void iSelectVipCheckboxForSergeyIvan(String checkBox, String checkBoxName){
        if (checkBox.equals("vip")&&checkBoxName.equals("Sergey Ivan")){
            userTablePage.selectCheckbox(userTablePage.checkboxSergeyIvan);
        }

    }
}
