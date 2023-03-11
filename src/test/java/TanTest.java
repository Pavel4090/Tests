import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TanTest extends BaseTest{

    @Test(dataProvider = "dataForTan")
    public void tanCalc(double a, double b) {
        double tan = calculator.tan(a);
        System.out.printf("Tangents %s is: " + tan + "\n", a);
        Assert.assertEquals(b, tan, "invalid result");
    }

    @DataProvider(name = "dataForTan")
    public Object[][] dataForTan() {
        return new Object[][]{
                {45, 1.62},
                {0, 0},
                {135, -0.09}
        };
    }
}
