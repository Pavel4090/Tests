import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{

    @Test(dataProvider = "dataForMultiplication")
    public void multiplicationCalc(int a, int b, int c) {
        double mult = calculator.multiplication(a, b);
        System.out.println(mult);
        Assert.assertEquals(c, mult, "invalid result");
    }

    @DataProvider(name = "dataForMultiplication")
    public Object[][] dataForMultiplication() {
        return new Object[][]{
                {2, 5, 10},
                {20, 5, 100},
                {42, 2, 84}
        };
    }
}
