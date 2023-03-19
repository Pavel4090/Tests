import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveNumberTest extends BaseTest{

    @Test(dataProvider = "dataForPositiveTest")
    public void posTest(double a, boolean expectedValue) {
        boolean positLongResult = calculator.positiveNumber(a);
        System.out.printf("Number %s be positive: %s" + "\n", a, expectedValue);
        Assert.assertEquals(expectedValue, positLongResult);
    }

    @DataProvider(name = "dataForPositiveTest")
    public Object[][] dataForPosTest() {
        return new Object[][]{
                {4.5, true},
                {-1.65, false},
                {-10, false},
                {32, true}
        };
    }
}
