import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest{

    @Test(dataProvider = "dataForDivision", priority = 2)
    public void divisionCalc(int a, int b, int c) {
        double div = calculator.division(a, b);
        System.out.printf("Division %s on %s is: " + div + "\n", a, b);
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

    @Test(dataProvider = "dataForDivTest", priority = 1)
    public void divisionTest(int a, int b, int c) {
        double div = calculator.division(a, b);
        System.out.printf("Division %s on %s is: " + div + "\n", a, b);
        Assert.assertEquals(c, div, "invalid result");
    }

    @DataProvider(name = "dataForDivTest")
    public Object[][] dataForDivTest() {
        return new Object[][]{
                {1, 1, 1},
                {6, 3, 2}
        };
    }
}
