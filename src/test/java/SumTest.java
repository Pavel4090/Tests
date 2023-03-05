import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @Test(dataProvider = "dataForSum")
    public void trueSum(int a, int b, int c) {
        int sum = calculator.sum(a, b);
        Assert.assertEquals(c, sum);
    }

    @DataProvider(name = "dataForSum")
    public Object[][] dataForSum() {
        return new Object[][]{
                {2, 3, 5},
                {20, 50, 70},
                {35, 15, 50}
        };
    }
}
