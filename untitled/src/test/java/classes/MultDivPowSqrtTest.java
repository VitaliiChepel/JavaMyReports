package classes;

import classes.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


/**
 * Created by Витал on 31.10.2016.
 */
@Listeners(TestListener.class)
public class MultDivPowSqrtTest extends ConfigurationForTest {

    @Test(dataProvider = "createFromExcelLong", groups="smoke")
    public void multLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.mult(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelDouble", groups="smoke")
    public void multDblMathFloor(double a, double b, double expected) {
        Assert.assertEquals(calculator.mult(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelLong", groups="smoke", dependsOnMethods = "multDblMathFloor")
    public void divLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.div(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelLong", groups="smoke", dependsOnMethods = "multDblMathFloor")
    public void divDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.div(a, b), expected);
    }


    @Test(dataProvider = "createFromExcelDouble")
    public void pow(double a, double b, double expected) {
        Assert.assertEquals(calculator.pow(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelDouble")
    public void sqrt (double a,  double expected) {
        Assert.assertEquals(calculator.sqrt(a), expected);
    }
}
