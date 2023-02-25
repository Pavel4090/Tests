package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest{
    @Test
    public void rightClick() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));
        Assert.assertTrue(element.isDisplayed(), "The field for click not dislpayed");

        Actions action = new Actions(driver);
        action.contextClick(element).perform();
        Alert alert = driver.switchTo().alert();
        String textToEqual = "You selected a context menu";
        Assert.assertEquals(alert.getText(), textToEqual, "Alert is not displayed");

        alert.accept();
        WebElement element1 = driver.findElement(By.xpath("//h3[text()='Context Menu']"));
        Assert.assertTrue(element1.isDisplayed(), "Alert not closed");
    }
}
