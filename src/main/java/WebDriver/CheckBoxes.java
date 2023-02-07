package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxes extends BaseTest {

    @Test
    public void CheckedUnchecked() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement element = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(1)")); //Этот путь был копирован из консоли в браузере, а не из примера в дз
        element.click();
        WebElement element1 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(3)"));
        element1.click();
    }
}
