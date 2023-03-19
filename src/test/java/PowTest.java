import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseTest{

    @Test(dataProvider = "dataForPowTest")
    public void powNumber(double a, int b, double expectedValue) {
        double powDoubleResult = calculator.powNumber(a, b);
        System.out.printf("Number %s to step of %s is: %s" + "\n", a, b, expectedValue);
        Assert.assertEquals(powDoubleResult, expectedValue, "Invalid result");
    }

    @DataProvider(name = "dataForPowTest")
    public Object[][] dataForPowNumber() {
        return new Object[][]{
                {10, 2, 100},
                {3, 3, 27},
                {10.5, 2, 110.25}
        };
    }
}
