package classes;

import classes.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Витал on 31.10.2016.
 */
@Listeners(TestListener.class)
public class TrigonometryTest extends ConfigurationForTest  {

    @Test(dataProvider = "createFromExcelDouble", groups = "trigonometry", priority = 4)
    public void tg (double a, double expected, double delta) {
        Assert.assertEquals(calculator.tg (a), expected, delta);
    }

    @Test(dataProvider = "createFromExcelDouble", groups = "trigonometry",  priority = 3)
    public void ctg (double a, double expected) {
        Assert.assertEquals(calculator.ctg (a), expected);
    }

    @Test(dataProvider = "createFromExcelDouble", groups = "trigonometry",  priority = 2)
    public void cos (double a, double expected) {
        Assert.assertEquals(calculator.cos(a), expected);
    }

    @Test(dataProvider = "createFromExcelDouble", groups = "trigonometry",  priority = 1)
   public void sin (double a, double expected) {
        Assert.assertEquals(calculator.sin(a), expected);
   }

}
