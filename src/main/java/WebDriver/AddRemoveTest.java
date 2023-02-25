package WebDriver;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveTest extends BaseTest {

    @Test
    public void operationsWithElements() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement element = driver.findElement(By.xpath("//button[text()='Add Element']"));
        element.click();
        element.click();
        List<WebElement> buttonDelete = driver.findElements(By.xpath("//button[text()='Delete']"));
        WebElement d = buttonDelete.get(1);
        d.click();
        Assertions.assertThat(buttonDelete.size())
                .as("Elements 'delete' more then 1")
                .isNotNull()
                .hasSameClassAs(1);
    }
}
