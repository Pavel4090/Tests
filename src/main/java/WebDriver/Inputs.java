package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Inputs extends BaseTest{

    @Test
    public void keysArrowUPDown() {
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
        element.clear();
        element.sendKeys("123456");
        String result = element.getText();
        System.out.println(result);
        element.clear();
        element.sendKeys("Input test");
        String result2 = element.getText();
        System.out.println(result2);
    }
}
