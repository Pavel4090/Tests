import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest extends BaseTest{

    @Test(dataProvider = "dataForFactorial")
    public void factorial(int a, double b) {
        double fact = calculator.factorial(a);
        System.out.printf("Factorial %s is: " + fact + "\n", a);
        Assert.assertEquals(fact, b, "invalid result");
    }

    @DataProvider(name = "dataForFactorial")
    public Object[][] dataForFactorial() {
        return new Object[][]{
                {1, 1},
                {4, 24},
                {3, 6},
                {5, 120}
        };
    }
}
