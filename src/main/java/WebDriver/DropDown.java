package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends BaseTest {

    @Test
    public void DropDownTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        element.click();
        WebElement element1 = driver.findElement(By.cssSelector("#dropdown > option:nth-child(2)"));
        element1.click();
        WebElement element2 = driver.findElement(By.cssSelector("#dropdown > option:nth-child(3)"));
        element2.click();
    }
}
