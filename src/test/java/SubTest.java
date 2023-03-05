import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest extends BaseTest{

    @Test(dataProvider = "dataForSubtraction")
    public void subCalc(int a, int b, int c) {
        double subtraction = calculator.subtraction(a, b);
        System.out.println(subtraction);
        Assert.assertEquals(c, subtraction, "invalid result");
    }

    @DataProvider(name = "dataForSubtraction")
    public Object[][] dataForSubtraction() {
        return new Object[][]{
                {90, 50, 40},
                {25, 5, 20},
                {180, 90, 90}
        };
    }
}
