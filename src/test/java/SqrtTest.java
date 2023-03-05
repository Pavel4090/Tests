import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest{

    @Test(dataProvider = "dataForSqrt")
    public void sqrtCalc(int a, int b) {
        double sqrt = calculator.squaring(a);
        System.out.println(sqrt);
        Assert.assertEquals(b, sqrt, "invalid result");
    }

    @DataProvider(name = "dataForSqrt")
    public Object[][] dataForSqrt() {
        return new Object[][]{
                {25, 5},
                {9, 3},
                {0, 0}
        };
    }
}
