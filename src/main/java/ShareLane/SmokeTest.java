package ShareLane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{

    @Test
    public void SmokeTest1() {

        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[text()='Sign up']")).click();
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        WebElement signUp = driver.findElement(By.xpath("//tr[3]//td//p/b"));
        Assert.assertTrue(signUp.isDisplayed(),
                "Sign up page is not loaded");
        driver.findElement(By.name("first_name")).sendKeys("Pavel");
        driver.findElement(By.name("last_name")).sendKeys("Ivanov");
        driver.findElement(By.name("email")).sendKeys("ShareLane@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        WebElement accountCreated = driver.findElement(By.xpath("//span[text()='Account is created!']"));
        Assert.assertTrue(accountCreated.isDisplayed(),
                "Input invalid data in registration fields");
        WebElement element1 = driver.findElement(By.xpath("//td[2]/b"));
        String email = element1.getText();
        WebElement element2 = driver.findElement(By.xpath("//tr[2]//td[2]"));
        String password = element2.getText();
        System.out.println(email + "\n" + password);
        driver.findElement(By.xpath("//a[@href='./main.py']")).click();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
        Assert.assertTrue(logOut.isDisplayed(),
                "Wrong password or email");
        driver.findElement(By.name("keyword")).sendKeys("Great Expectations");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        WebElement price = driver.findElement(By.xpath("//font[text()='Price: $10.00']"));
        Assert.assertTrue(price.isDisplayed(),
                "Incorrect book title");
        driver.findElement(By.xpath("//a[@href='./add_to_cart.py?book_id=1']")).click();
        WebElement bookAddToCart = driver.findElement(By.xpath
                ("//span[text()='Book was added to the Shopping Cart']"));
        Assert.assertTrue(bookAddToCart.isDisplayed(),
                "Book not added to cart");
        driver.findElement(By.xpath("//a[@href='./shopping_cart.py']")).click();
        WebElement shoppingCart = driver.findElement(By.xpath("//input[@value='Update']"));
        Assert.assertTrue(shoppingCart.isDisplayed(),
                "Shopping cart not opened");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        WebElement cartUpdated = driver.findElement(By.xpath("//span[text()='Cart Updated']"));
        Assert.assertTrue(cartUpdated.isDisplayed(),
                "Cart not updated");
        driver.findElement(By.xpath("//input[@value='Proceed to Checkout']")).click();
        WebElement bookInfo = driver.findElement(By.xpath("//h2[text()='Book Info & Total']"));
        Assert.assertTrue(bookInfo.isDisplayed(),
                "Page with book info not opened");
        driver.findElement(By.name("card_number")).sendKeys("1111111111116477");
        driver.findElement(By.xpath("//input[@value='Make Payment']")).click();
        WebElement orderId = driver.findElement(By.xpath("//tr[4]//td//p/b"));
        Assert.assertTrue(orderId.isDisplayed(),
                "Page with order id not opened");
        String iD = orderId.getText();
        System.out.println(iD);
    }
}
