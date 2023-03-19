package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void checkedUnchecked() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> element = driver.findElements(By.cssSelector("[type='checkbox']"));
        WebElement firstCheckbox = element.get(0);
        WebElement secondCheckbox = element.get(1);

        firstCheckbox.click();
        Assert.assertTrue(firstCheckbox.isSelected(),
                "Checkbox 1 not enabled");

        secondCheckbox.click();
        Assert.assertFalse(secondCheckbox.isSelected(),
                "Checkbox 2 is enabled");
    }
}
