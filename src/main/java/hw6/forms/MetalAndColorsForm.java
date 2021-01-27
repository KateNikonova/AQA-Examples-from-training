package hw6.forms;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import hw6.entities.MetalAndColorsTestData;


public class MetalAndColorsForm extends Form<MetalAndColorsTestData> {


    @JDropdown(root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public Dropdown colorsDropdown;

    @JDropdown(
            root = "div[ui=combobox]",
            value = "input",
            list = "li",
            expand = ".caret"
    )
    public Dropdown metalsDropdown;

    @UI("[name=custom_radio_odd]")
    public RadioButtons oddNumbers;

    @UI("[name=custom_radio_even]")
    public RadioButtons evenNumbers;

    @FindBy(css = "#elements-checklist input")
    public Checklist earthElements;

    @JDropdown(root = "div[ui=droplist]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public Dropdown vegetablesDropdown;

    @FindBy(css = "#salad-dropdown  input")
    public Checklist vegetablesCheckList;

    @UI("[id=submit-button]")
    public Button submitButton;

    public void fillInMetalAndColorsForm(MetalAndColorsTestData testData) {
        oddNumbers.select(Integer.toString(testData.getSummary()[0]));
        evenNumbers.select(Integer.toString(testData.getSummary()[1]));
        for (int i = 0; i < testData.getElements().length; i++) {
            earthElements.select(testData.getElements()[i]);
        }
        colorsDropdown.select(testData.getColor());
        metalsDropdown.select(testData.getMetals());
        vegetablesDropdown.expand();

        //to clean up vegetables for the first time
        if (vegetablesCheckList.selected().length() > 0) {
            vegetablesCheckList.select(vegetablesCheckList.selected());
        }
        for (int i = 0; i < testData.getVegetables().length; i++) {
            vegetablesCheckList.select(testData.getVegetables()[i]);
        }
        submitButton.click();

        // to clean up vegetables and elements
        for (int i = 0; i < testData.getElements().length; i++) {
            earthElements.select(testData.getElements()[i]);
        }
        vegetablesDropdown.expand();
        for (int i = 0; i < testData.getVegetables().length; i++) {
            vegetablesCheckList.select(testData.getVegetables()[i]);
        }
    }
}
