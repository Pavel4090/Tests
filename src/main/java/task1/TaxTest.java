package task1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaxTest {

    public double getTax(double salary) {
        if (salary < 10000) {
            return salary * 0.13;
        } else if (salary >= 10000 && salary < 50000) {
            return salary * 0.2;
        } else {
            return salary * 0.3;
        }
    }

    @DataProvider
    public Object[][] salaryProvider() {
        return new Object[][]{
                {0,0},
                {9999, 0.13},
                {10000, 0.2},
                {49999, 0.2},
                {50000, 0.3},
        };
    }
    @Test(dataProvider = "salaryProvider")
    public void checkTaxesCalculation(int salary, double expTax) {
        Assert.assertEquals(getTax(salary), expTax * salary,
                String.format("Taxes for &s shuold be %s", salary, expTax));
    }

}

