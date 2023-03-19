package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest{

    String text = "Your content goes here.";

    @Test
    public void frames() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textInsideParagraph = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        Assert.assertEquals(textInsideParagraph.getText(), text,
                "Text in Frame is not same as 'Your content goes here.'");
    }
}
