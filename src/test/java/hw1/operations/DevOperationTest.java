package hw1.operations;


import hw1.data.DevData;
import hw1.data.DevData_long;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DevOperationTest extends AbstractOperationTest{

    @Test(dataProvider = "DevDataProvider", dataProviderClass = DevData.class)
    public void dataProviderDevTest(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "DevDataProvider_long", dataProviderClass = DevData_long.class)
    public void dataProviderDevTest(long a, long b, long expected) {
        double actual = calculator.div(a, b);
        assertEquals(actual, expected, 0.000001);
    }

}
