import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public Factorial factorial;


    @BeforeMethod
    public void beforeMethod() {
        factorial = new Factorial();
        System.out.print("**************factorial is initialized**************");
    }
}
