package hw1.operations;


import hw1.data.DevData;
import hw1.data.DevDataLong;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DevOperationTest extends AbstractOperationTest{

    @Test(dataProvider = "DevDataProvider", dataProviderClass = DevData.class)
    public void dataProviderDevDoubleTest(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "DevDataProviderLong", dataProviderClass = DevDataLong.class)
    public void dataProviderDevLongTest(long a, long b, long expected) {
        double actual = calculator.div(a, b);
        assertEquals(actual, expected, 0.000001);
    }

}
