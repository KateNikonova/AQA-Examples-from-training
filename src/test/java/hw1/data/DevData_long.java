package hw1.data;

import org.testng.annotations.DataProvider;

public class DevData_long {

    @DataProvider(name = "DevDataProvider_long")
    public Object[][] DevDataSet() {
        return new Object[][]{
                {2, 2, 1},
                {-10, 5, -2},
                {-1000, -10, 100},
                {5000, 25, 200}
        };
    }
}
