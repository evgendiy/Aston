import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    @Test(description = "Проверка работы ссылки \"Подробнее о сервисе\"")
    public void linkTest() {
        WebElement link = waitService.waitForElementClickable(By.linkText("Подробнее о сервисе"));
        link.click();

        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "URL не совпадают");
    }

}
