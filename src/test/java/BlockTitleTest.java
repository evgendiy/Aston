import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockTitleTest extends BaseTest {

    @Test(description = "Проверка названия блока")
    public void titleTest() {
        WebElement blockTitle = waitService.waitForVisibilityLocatedBy(By.xpath("//div[@class='pay__wrapper']/h2"));
        String actualTitle = blockTitle.getText();
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", actualTitle, "Название блока не соответствует ожидаемому");
    }
}
