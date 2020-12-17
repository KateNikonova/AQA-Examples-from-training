package hw1.data;

import org.testng.annotations.DataProvider;

public class DevData {

    @DataProvider(name = "DevDataProvider")
    public Object[][] DevDataSet() {
        return new Object[][]{
                {7.7, 2.2, 3.5},
                {10.1, 1.0, 10.1},
                {-5.0, 2, -2.5},
                {-30.3, -3.0, 10.1}
        };
    }
}
