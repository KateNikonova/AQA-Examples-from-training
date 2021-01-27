package hw6.pages;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import hw6.entities.MetalAndColorsTestData;
import hw6.forms.MetalAndColorsForm;

public class MetalAndColorsPage extends WebPage {


    public MetalAndColorsForm metalAndColorsForm;

    public void fillInMetalAndColorsData(MetalAndColorsTestData testData) {
        metalAndColorsForm.fillInMetalAndColorsForm(testData);

    }

    @FindBy(css = ".results li")
    public WebList results;

    public void verifyResult(MetalAndColorsTestData testData) {

        int sum;
        String elemList = testData.getElements()[0];
        String vegList = testData.getVegetables()[0];
        sum = testData.getSummary()[0] + testData.getSummary()[1];

        for (int i = 1; i < testData.getElements().length; i++) {
            elemList = elemList + ", " + testData.getElements()[i];
        }

        for (int i = 1; i < testData.getVegetables().length; i++) {
            vegList = vegList + ", " + testData.getVegetables()[i];
        }

        results.get(1).assertThat().text("Summary: " + sum);
        results.get(2).assertThat().text("Elements: " + elemList);
        results.get(3).assertThat().text("Color: " + testData.getColor());
        results.get(4).assertThat().text("Metal: " + testData.getMetals());
        results.get(5).assertThat().text("Vegetables: " + vegList);

    }


}
