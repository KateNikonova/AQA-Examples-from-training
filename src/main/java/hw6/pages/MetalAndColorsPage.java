package hw6.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.Text;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;

public class MetalAndColorsPage extends WebPage {

    // Colors dropdown
    @JDropdown(root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public Dropdown colorsDropdown;

    public void selectColor(String colorValue) {
        colorsDropdown.select(colorValue);
    }

    //Metals dropdown
    @JDropdown(
            root = "div[ui=combobox]",
            value = "input",
            list = "li",
            expand = ".caret"
    )
    public Dropdown metalsDropdown;

    public void selectMetal(String metalValue) {
        metalsDropdown.select(metalValue);
    }

    // Numbers summary
    @UI("[name=custom_radio_odd]")
    public RadioButtons oddNumbers;

    @UI("[name=custom_radio_even]")
    public RadioButtons evenNumbers;

    public void selectNumbers(int[] numbers) {
        int first;
        int second;
        switch (numbers[0]) {
            case (1):
                first = 1;
                break;
            case (3):
                first = 2;
                break;
            case (5):
                first = 3;
                break;
            default:
                first = 4;
                break;
        }
        switch (numbers[1]) {
            case (2):
                second = 1;
                break;
            case (4):
                second = 2;
                break;
            case (6):
                second = 3;
                break;
            default:
                second = 4;
                break;
        }

        oddNumbers.select(first);
        evenNumbers.select(second);
    }


    //Elements checklist
    @FindBy(css = "section[id=elements-checklist] input[type=checkbox]")
    public Checklist earthElements;

    @XPath("//input[@id='g1']")
    public Checkbox waterCheckBox;

    @XPath("//input[@id='g2']")
    public Checkbox earthCheckBox;

    @XPath("//input[@id='g3']")
    public Checkbox windCheckBox;

    @XPath("//input[@id='g4']")
    public Checkbox fireCheckBox;

    public void selectElements(String[] elements) {
        cleanUpElements();
        earthElements.select(elements);
    }

    public void cleanUpElements() {
        if (waterCheckBox.isSelected()) {
            waterCheckBox.uncheck();
        }
        if (earthCheckBox.isSelected()) {
            earthCheckBox.uncheck();
        }
        if (windCheckBox.isSelected()) {
            windCheckBox.uncheck();
        }
        if (fireCheckBox.isSelected()) {
            fireCheckBox.uncheck();
        }
    }

    //Vegetables dropdown with checboxes
    @JDropdown(root = "div[ui=droplist]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public Dropdown vegetablesDropdown;

    @XPath("//input[@id='g5']")
    public Checkbox cucumberCheckBox;

    @XPath("//input[@id='g6']")
    public Checkbox tomatoCheckBox;

    @XPath("//input[@id='g7']")
    public Checkbox vegetableCheckBox;

    @XPath("//input[@id='g8']")
    public Checkbox onionCheckBox;


    public void cleanUpVegetables() {
        vegetablesDropdown.expand();
        if (cucumberCheckBox.isSelected()) {
            cucumberCheckBox.uncheck();
        }
        if (tomatoCheckBox.isSelected()) {
            tomatoCheckBox.uncheck();
        }
        if (vegetableCheckBox.isSelected()) {
            vegetableCheckBox.uncheck();
        }
        if (onionCheckBox.isSelected()) {
            onionCheckBox.uncheck();
        }
    }

    public void selectVegetable(String[] vegList) {
        cleanUpVegetables();
        vegetablesDropdown.select(vegList);
    }


    // Buttons
    @UI("[id=submit-button]")
    public Button submitButton;

    public void clickSubmitButton() {
        submitButton.click();
    }

    // Results section
    @UI("[class=summ-res]")
    public Text summaryResult;

    @UI("[class=col-res]")
    public Text colorResult;

    @UI("[class=met-res]")
    public Text metalResult;

    @UI("[class=sal-res]")
    public Text vegResult;

    @UI("[class=elem-res]")
    public Text elementsResult;


    public void verifyResult(int[] intSumNumbers, String[] intElements,
                             String intColor, String intMetal,
                             String[] intVegetables) {

        int sum;
        String elemList = intElements[0];
        String vegList = intVegetables[0];
        sum = intSumNumbers[0] + intSumNumbers[1];

        for (int i = 1; i < intElements.length; i++) {
            elemList = elemList + ", " + intElements[i];
        }

        for (int i = 1; i < intVegetables.length; i++) {
            vegList = vegList + ", " + intVegetables[i];
        }

        summaryResult.is().text("Summary: " + sum);
        colorResult.is().text("Color: " + intColor);
        metalResult.is().text("Metal: " + intMetal);
        vegResult.is().text("Vegetables: " + vegList);
        elementsResult.is().text("Elements: " + elemList);

    }


}
