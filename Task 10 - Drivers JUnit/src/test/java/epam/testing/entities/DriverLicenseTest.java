package epam.testing.entities;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;


    public class DriverLicenseTest {

        @Rule
        public final ExpectedException exp = ExpectedException.none();

        @Test
        public void testDriverLicenseConstructorInputForEnumCategory() throws Exception {
            DriverLicense driverLicense = new DriverLicense(new Date(), DriverLicense.Category.A, new Date());
            Assert.assertTrue(driverLicense.getCategories().size() == 1 && driverLicense.getCategories().get(0) == DriverLicense.Category.A);
        }


        @Test
        public void testDriverLicenseConstructorForInputtedExpires() throws Exception {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, 2012);
            cal.set(Calendar.MONTH, 9);
            cal.set(Calendar.DAY_OF_MONTH, 4);

            Date expires = cal.getTime();
            List<DriverLicense.Category> categories = new ArrayList<DriverLicense.Category>();
            categories.add(DriverLicense.Category.B);
            DriverLicense driverLicense = new DriverLicense(expires, categories, new Date());
            assertTrue(driverLicense.getExpires().equals(expires));
        }


        @Test
        public void testDriverLicenseConstructorForInputMoreThanOneCategory() throws Exception {
            List<DriverLicense.Category> categories = new ArrayList<DriverLicense.Category>();
            categories.add(DriverLicense.Category.B);
            categories.add(DriverLicense.Category.B);
            categories.add(DriverLicense.Category.B);
            DriverLicense driverLicense = new DriverLicense(new Date(), categories, new Date());
            assertTrue("In list of categories is 3 categories 'B', 'B', 'B' but should be one category 'B' ",
                    driverLicense.getCategories().size() == 1 && driverLicense.getCategories().get(0) == DriverLicense.Category.B);
        }
}