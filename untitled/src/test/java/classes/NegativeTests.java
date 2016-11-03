package classes;

import classes.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Витал on 01.11.2016.
 */
@Listeners(TestListener.class)
public class NegativeTests extends ConfigurationForTest  {

    @Test(dataProvider = "createFromExcelLong", groups = {"negative", "boolean"})
    public void negatIsPos (long a) {
        Assert.assertFalse(calculator.isPositive(a));
    }

    @Test(dataProvider = "createFromExcelLong", groups = {"negative", "boolean"})
    public void negatIsNegat (long a) {
        Assert.assertFalse(calculator.isNegative(a));
    }

    @Test(dataProvider = "createFromExcelLong", groups = "negative", expectedExceptions = {NumberFormatException.class})
    public void divByZero(long a, long b) {
        calculator.div (a, b);
    }

    @Test(dataProvider = "createFromExcelDouble", groups = "negative", expectedExceptions = {NumberFormatException.class})
    public void divByZeroD(double a, double b) {
        calculator.div (a, b);
    }

    @Test(dataProvider = "createFromExcelDouble",  groups = "negative",expectedExceptions= {Exception.class})
    public void ctgZeroDouble (double a){
        calculator.ctg(a);
    }

    @Test(dataProvider = "createFromExcelDouble",  groups = "negative",expectedExceptions= {Exception.class})
    public void sqrtNegValue (double a){
        calculator.sqrt(a);
    }

}
