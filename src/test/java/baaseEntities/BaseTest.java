package baaseEntities;

import configurator.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import services.BrowserService;
import services.WaitService;
import utils.Listener;

@Listeners(Listener.class)

public class BaseTest {
    protected WebDriver driver;
    protected WaitService waitService;

    @BeforeMethod
    public void beforeMethod(ITestContext iTestContext) {
        driver = new BrowserService().getDriver();
        this.setDriverToContext(iTestContext, driver);
        waitService = new WaitService(driver);

        driver.get(ReadProperties.getUrl());
        waitService.waitForVisibilityLocatedBy(By.id("cookie-agree")).click();

        WebElement selector = waitService.waitForVisibilityLocatedBy(By.xpath("//button[@class='select__header']"));
        selector.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public static void setDriverToContext(ITestContext iTestContext, WebDriver driver) {
        iTestContext.setAttribute("WebDriver", driver);
    }

    public static WebDriver getDriverFromContext(ITestContext iTestContext) {
        return (WebDriver) iTestContext.getAttribute("WebDriver");
    }
}
