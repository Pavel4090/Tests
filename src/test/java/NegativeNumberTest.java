import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeNumberTest extends BaseTest {

    @Test(dataProvider = "dataForNegNum")
    public void negNumTest(double a, boolean expectedResult) {
        boolean negNum = calculator.negativeNumber(a);
        System.out.printf("Number %s be negative: %s" + "\n", a, expectedResult);
        Assert.assertEquals(expectedResult, negNum);
    }

    @DataProvider(name = "dataForNegNum")
    public Object[][] dataForNegNumTest() {
        return new Object[][]{
                {-56.5, true},
                {-65.6, true},
                {42.1, false}
        };
    }
}
