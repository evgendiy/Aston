package services;

import configurator.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitService {
    private WebDriver driver;
    private Duration timeout;
    private WebDriverWait wait;

    public WaitService(WebDriver driver) {
        this.driver = driver;
        timeout = Duration.ofSeconds(ReadProperties.timeout());
        wait = new WebDriverWait(driver, timeout);
    }

    public WebElement waitForExists(By by) {  //наличие в дом модели
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitForVisibilityLocatedBy(By by) {  //отображение на станице
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementClickable(By by) {  //кликабелен
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
