package hw6;


import hw6.data.DataProviderTestData;
import hw6.entities.MetalAndColorsTestData;
import org.testng.annotations.Test;


import static hw6.JdiSite.*;

public class MetalAndColorsFormTest extends AbstractJdiTest {


    @Test(dataProviderClass = DataProviderTestData.class,
            dataProvider = "getMetalsAndColorsTestData")
    public void jdiMetalAndColorsFormTest(MetalAndColorsTestData testData) {

        metalAndColorsPage.fillInMetalAndColorsData(testData);
        metalAndColorsPage.verifyResult(testData);

    }


}
