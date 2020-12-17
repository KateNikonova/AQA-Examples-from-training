package hw1.operations;

import hw1.data.SubData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubOperationTest extends AbstractOperationTest {

    @DataProvider
    public Object[][] SubDataSet_long() {
        return new Object[][] {
                {2, 2, 0},
                {9, 0, 9},
                {0, 5, -5},
                {-1, 1, -2}
        };
    }

    @Test(dataProvider = "SubDataSet_long")
    public void dataProviderLongSumTest(long a, long b, long expected) {
        double actual = calculator.sub(a, b);
        assertEquals(actual, expected, 0.001);
    }

    @Test(dataProvider = "SubDataProvider_double", dataProviderClass = SubData.class)
    public void dataProviderSubTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        assertEquals(actual, expected, 0.000001);
    }
}
