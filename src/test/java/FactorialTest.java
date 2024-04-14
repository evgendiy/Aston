import data.Provider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest extends BaseTest {

    @Test(description = "Test with data provider", dataProvider = "dataForFactorial", dataProviderClass = Provider.class)
    public void factorialCalcTest(int number, long expectedResult) {
        Assert.assertEquals(factorial.factorialCalc(number), expectedResult, "wrong result");
    }

    @Test(description = "negative test", expectedExceptions = IllegalArgumentException.class)
    public void factorialException() {
        Assert.assertEquals(factorial.factorialCalc(-1), 1, "wrong result");
    }


}
