package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest extends BaseTest {

    @Test
    public void DropDown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        WebElement element1 = driver.findElement(By.cssSelector("option[value='1']"));
        element1.click();
        Assert.assertTrue(element1.isEnabled(),
                "First option is not enabled");
        WebElement element2 = driver.findElement(By.cssSelector("option[value='2']"));
        element2.click();
        Assert.assertTrue(element2.isEnabled(), "Second option is not enabled");
    }
}
