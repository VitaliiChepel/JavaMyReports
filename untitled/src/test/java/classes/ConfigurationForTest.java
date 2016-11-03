package classes;

/**
 * Created by Витал on 31.10.2016.
 */
import classes.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * Created by Витал on 31.10.2016.
 */


public class ConfigurationForTest {

    public Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void SetUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() throws Exception {
        this.calculator = null;
    }

    @DataProvider(name = "createFromExcelLong")
    public static Object[][] getDataLong(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet, true);
    }

    @DataProvider(name = "createFromExcelDouble")
    public static Object[][] getDataDouble(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet, false);
    }
}

