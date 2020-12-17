package hw1.operations;

import hw1.data.MultData;
import hw1.data.MultData_long;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultOperationTest extends AbstractOperationTest{

    @Test(dataProvider = "MultDataProvider", dataProviderClass = MultData.class)
    public void dataProviderMultTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected, 0.000001);
    }

    @Test(dataProvider = "MultDataProvider_long", dataProviderClass = MultData_long.class)
    public void dataProviderMultTest(long a, long b, long expected) {
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected, 0.000001);
    }
}
