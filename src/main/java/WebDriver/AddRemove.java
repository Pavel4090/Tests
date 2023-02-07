package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRemove extends BaseTest {

    @Test
    public void operationsWithElements() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement element = driver.findElement(By.xpath("//button[text()='Add Element']"));
        element.click();
        element.click();
        WebElement element1 = driver.findElement(By.xpath("//button[text()='Delete']"));
        element1.click();
    }
}
