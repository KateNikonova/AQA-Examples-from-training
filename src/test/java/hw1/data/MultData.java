package hw1.data;

import org.testng.annotations.DataProvider;

public class MultData {

    @DataProvider(name = "MultDataProvider")
    public Object[][] MultDataSet() {
        return new Object[][]{
                {3.5, 2.2, 7.7},
                {10.1, 1.0, 10.1},
                {-5.0, 2, -10},
                {-30.3, -3.0, 90.9}
        };
    }
}
