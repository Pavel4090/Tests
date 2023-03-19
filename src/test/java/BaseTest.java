import Calculator.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @BeforeTest(alwaysRun = true)
    public void startMessage() {
        System.out.println("Test is starting");
    }

    @AfterTest(alwaysRun = true)
    public  void closeTestMessage() {
        System.out.println("Test ending");
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
