package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Inputs extends BaseTest{

    @Test
    public void operationsWithElements() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement element = driver.findElement(By.tagName("input"));
        element.click();
    }
}
