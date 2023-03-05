import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseTest{

    @Test(dataProvider = "dataForCos")
    public void cosCalc(double a, double b) {
        double cos = calculator.cos(a);
        System.out.println(cos);
        Assert.assertEquals(b, cos, "invalid result");
    }

    @DataProvider(name = "dataForCos")
    public Object[][] dataForCos() {
        return new Object[][]{
                {90, -0.45},
                {0, 1},
                {180, -0.6}
        };
    }
}
