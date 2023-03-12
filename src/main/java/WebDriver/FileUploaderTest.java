package WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUploaderTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        driver.get("https://the-internet.herokuapp.com/upload");
        //driver.findElement(By.xpath("//input[@id=file-upload]")).click();
        driver.findElement(By.cssSelector("#file-upload")).click();
        String filePath = System.getProperty("user.dir") + "/src/main/resources/text.txt";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        driver.navigate().back();
    }
}
