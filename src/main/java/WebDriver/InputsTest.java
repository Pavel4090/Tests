package WebDriver;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest{

    @Test
    public void keysArrowUPDown() {
        String result1 = "2";
        String result2 = "123456";
        String result3 = "Input test";
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement element = driver.findElement(By.tagName("input"));
        element.click();
        Keys arrowUp = Keys.ARROW_UP;
        Keys arrowDown = Keys.ARROW_DOWN;
        element.sendKeys(arrowUp);
        element.sendKeys(arrowUp);
        element.sendKeys(arrowUp);
        element.sendKeys(arrowUp);
        element.sendKeys(arrowUp);
        element.sendKeys(arrowDown);
        element.sendKeys(arrowDown);
        element.sendKeys(arrowDown);
        Assertions.assertThat(element.getAttribute("value"))
                .as("Result is not equal")
                .toString()
                .equals(result1);
        element.clear();
        element.sendKeys(result2);
        Assertions.assertThat(element.getAttribute("value"))
                .as("Result should be '123456'")
                .toString()
                .equals(result2);
        element.clear();
        element.sendKeys(result3);
        Assertions.assertThat(element.getAttribute("value"))
                .as("Result should be 'Input test'")
                .toString()
                .equals(result3);
    }
}
