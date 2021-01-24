package hw6;


import hw6.data.DataProviderTestData;
import org.testng.annotations.Test;


import static hw6.JdiSite.*;

public class MetalAndColorsFormTest extends AbstractJdiTest {


    @Test(dataProviderClass = DataProviderTestData.class,
            dataProvider = "getMetalsAndColorsTestData")
    public void idiMetalAndColorsFormTest(int[] summary, String[] elements,
                                          String color, String metals,
                                          String[] vegetables) {

        metalAndColorsPage.selectNumbers(summary);
        metalAndColorsPage.selectElements(elements);
        metalAndColorsPage.selectColor(color);
        metalAndColorsPage.selectMetal(metals);
        metalAndColorsPage.selectVegetable(vegetables);
        metalAndColorsPage.clickSubmitButton();
        metalAndColorsPage.verifyResult(summary, elements, color, metals, vegetables);

    }


}
