import org.testng.annotations.Test;

public class DivZeroTest extends BaseTest {

    @Test(expectedExceptions = IllegalArgumentException.class, priority = 1)
    public void divLongByZero() {
        int divLongResult = calculator.division(1, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, priority = 2)
    public void divDoubleByZero() {
        double divDoubleResult = calculator.division((int) 1.99, 0);
    }
}
