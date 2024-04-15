import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    void setup() {
        factorial = new Factorial();
    }


    @Test
    public void factorialCalcTest() {
        Assertions.assertEquals(factorial.factorialCalc(3), 6);
    }

    @Test
    public void factorialZeroTest() {
        Assertions.assertEquals(factorial.factorialCalc(0), 1);
    }

    @Test
    public void factorialNegativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorialCalc(-1));
    }
}
