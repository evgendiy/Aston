package data;

import org.testng.annotations.DataProvider;

public class Provider {
    @DataProvider(name = "dataForFactorial")
    public static Object[][] dataForFactorialCalc() {
        return new Object[][]{
                {1, 1},
                {0, 1},
                {3, 6}
        };
    }
}
