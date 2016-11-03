package classes;

import classes.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Витал on 31.10.2016.
 */

@Listeners(TestListener.class)
public class BooleanTest extends ConfigurationForTest {

    @Test(dataProvider = "createFromExcelLong", groups="boolean",   priority = 1)
    public void isPos (long a) throws InterruptedException {
        Assert.assertTrue(calculator.isPositive(a));
        Thread.sleep(2000);
    }

    @Test(dataProvider = "createFromExcelLong", groups="boolean", priority = 2)
    public void isNegat (long a) throws InterruptedException {
        Assert.assertTrue(calculator.isNegative(a));
        Thread.sleep(2000);
    }
}
