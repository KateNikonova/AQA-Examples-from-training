package hw1.data;

import org.testng.annotations.DataProvider;

public class MultData_long {

    @DataProvider(name = "MultDataProvider_long")
    public Object[][] MultDataSet() {
        return new Object[][]{
                {7, 2, 14},
                {10, 1, 10},
                {-50, 2, -100},
                {-30, -3, 90}
        };
    }
}
