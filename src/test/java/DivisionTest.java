import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest{

    @Test(dataProvider = "dataForDivision")
    public void divisionCalc(int a, int b, int c) {
        double div = calculator.division(a, b);
        System.out.println(div);
        Assert.assertEquals(c, div, "invalid result");
    }

    @DataProvider(name = "dataForDivision")
    public Object[][] dataForDivision() {
        return new Object[][]{
                {10, 5, 2},
                {20, 5, 4},
                {42, 2, 21}
        };
    }
}
