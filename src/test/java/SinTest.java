import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {

    @Test(dataProvider = "dataForSin")
    public void sinCalc(double a, double b) {
        double sin = calculator.sin(a);
        System.out.printf("Sinus %s is:" + sin + "\n", a);
        Assert.assertEquals(b, sin, "invalid result");
    }

    @DataProvider(name = "dataForSin")
    public Object[][] dataForSin() {
        return new Object[][]{
                {90, 0.89},
                {0, 0},
                {270, -0.18}
        };
    }
}
