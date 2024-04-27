import configurator.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.Driver;
import services.WaitService;

public class BaseTest {
    protected Driver simpleDriver;
    protected WebDriver driver;
    protected WaitService waitService;

    @BeforeMethod
    public void beforeMethod() {
        simpleDriver = new Driver();
        driver = simpleDriver.getDriver();
        waitService = new WaitService(driver);

        driver.get(ReadProperties.getUrl());
        waitService.waitForVisibilityLocatedBy(By.id("cookie-agree")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
