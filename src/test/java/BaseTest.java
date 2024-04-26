import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.Driver;

public class BaseTest {
    Driver simpleDriver;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        simpleDriver = new Driver();
        driver = simpleDriver.getDriver();
        driver.manage().window().maximize();   //добавил т.к. не работает option --start-maximized
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
