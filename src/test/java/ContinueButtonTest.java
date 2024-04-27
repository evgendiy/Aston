import configurator.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContinueButtonTest extends BaseTest {

    @Test
    public void continueButtonTest() throws InterruptedException {
        WebElement serviceSelector = waitService.waitForExists(By.id("pay"));
        Select service = new Select(serviceSelector);
        service.selectByValue("Услуги связи");

        WebElement inputNumber = waitService.waitForVisibilityLocatedBy(By.id("connection-phone"));
        inputNumber.sendKeys(ReadProperties.phoneNumber());

        WebElement inputSum = waitService.waitForVisibilityLocatedBy(By.id("connection-sum"));
        inputSum.sendKeys(ReadProperties.sum());

        WebElement inputEmail = waitService.waitForVisibilityLocatedBy(By.id("connection-email"));
        inputEmail.sendKeys(ReadProperties.email());

        WebElement continueButton = waitService.waitForElementClickable(By.xpath("//form[@id='pay-connection']/button"));
        continueButton.submit();

        Thread.sleep(2000);
    }
}
