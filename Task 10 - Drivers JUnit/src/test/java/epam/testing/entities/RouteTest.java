package epam.testing.entities;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Витал on 26.09.2016.
 */
public class RouteTest {

    @Test
    public void testRouteConstructorWhenVehicleCategoryEqualsDriverCategoryWhichSetsByListOfCategories () {
        List<DriverLicense.Category> categories = new ArrayList<DriverLicense.Category>();
        categories.add(DriverLicense.Category.A);
        categories.add(DriverLicense.Category.B);
        categories.add(DriverLicense.Category.D);

        DriverLicense driverLicense = new DriverLicense();
        driverLicense.setCategories(categories);
        Driver driver = new Driver(new Human(), driverLicense);
        GasolineCar gasolineCar = new GasolineCar("TRUCK", "556", "56786567", DriverLicense.Category.D,
                8 , 8, GasolineCar.Transmission.MECHANICAL);
        Route route = new Route(gasolineCar, driver, "City A", "City B");
        assertTrue(driverLicense.getCategories().contains(gasolineCar.getCategory()));
    }


}