package hw1.data;

import org.testng.annotations.DataProvider;

public class MultDataLong {

    @DataProvider(name = "MultDataProviderLong")
    public Object[][] MultLongDataSet() {
        return new Object[][]{
                {7, 2, 14},
                {10, 1, 10},
                {-50, 2, -100},
                {-30, -3, 90}
        };
    }
}
