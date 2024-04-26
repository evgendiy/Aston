import configurator.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void dTest() {
        driver.get(ReadProperties.getUrl());
        driver.findElement(By.id("cookie-agree")).click();
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        String actualTitle = blockTitle.getText();
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", actualTitle, "Название блока не соответствует ожидаемому");

    }
}
