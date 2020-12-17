package hw1.operations;

import hw1.data.MultData;
import hw1.data.MultDataLong;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultOperationTest extends AbstractOperationTest{

    @Test(dataProvider = "MultDataProvider", dataProviderClass = MultData.class)
    public void dataProviderMultDoubleTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected, 0);
    }

    @Test(dataProvider = "MultDataProviderLong", dataProviderClass = MultDataLong.class)
    public void dataProviderMultLongTest(long a, long b, long expected) {
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected, 0);
    }
}
