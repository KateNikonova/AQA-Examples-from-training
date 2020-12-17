package hw1.data;

import org.testng.annotations.DataProvider;

public class SubData {

    @DataProvider(name = "SubDataProviderDouble")
    public static Object[][] SubDataSet() {
        return new Object[][]{
                {3.5, 4.4, -0.9},
                {-10.11, 5.89, -16},
                {10, 0.8, 9.2},
                {1, 1.5, -0.5}
        };
    }
}
