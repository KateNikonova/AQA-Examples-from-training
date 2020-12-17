package hw1.operations;

import hw1.data.SumData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumOperationTest extends AbstractOperationTest{

    @DataProvider
    public Object[][] SumDataSet_long() {
        return new Object[][] {
                {2, 2, 4},
                {0, 0, 0},
                {-5, 6, 1},
                {-6, -6, -12}
        };
    }

    @Test(dataProvider = "SumDataSet_long")
    public void dataProviderLongSumTest(long a, long b, long expected) {
        double actual = calculator.sum(a, b);
        assertEquals(actual, expected, 0.001);
    }

    @Test(dataProvider = "SumDataProvider_double", dataProviderClass = SumData.class)
    public void dataProviderDoubleSumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        assertEquals(actual, expected, 0.001);
    }
}
