package hw1.data;

import org.testng.annotations.DataProvider;

public class SumData {

    @DataProvider(name = "SumDataProviderDouble")
    public Object[][] SumDataSet() {
        return new Object[][] {
                {3.5, 4.4, 7.9},
                {-10.11,5.89,-4.22},
                {1.8, 2.2, 4.0},
                {-1.1, 1.1, 0}
        };
    }
}
