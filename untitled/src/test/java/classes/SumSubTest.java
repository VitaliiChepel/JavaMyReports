package classes;

/**
 * Created by Витал on 31.10.2016.
 */
import classes.Calculator;
import classes.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.*;


import static org.testng.Assert.assertTrue;

/**
 * Created by Витал on 31.10.2016.
 */
@Listeners(TestListener.class)
public class SumSubTest extends ConfigurationForTest {

    @Parameters({"a", "b"})
    @Test(dataProvider = "createFromExcelLong", groups="smoke")
    public void sumLong(@Optional(value = "100")long a, @Optional(value = "700")long b, long expected) {
        Assert.assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelDouble", groups="smoke")
    public void sumDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelLong", groups="smoke")
    public void subLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a, b), expected);
    }

    @Test(dataProvider = "createFromExcelDouble", groups="smoke")
    public void subDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sub(a, b), expected);
    }
}




