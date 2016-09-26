package epam.testing.entities;

import org.junit.Test;
import static org.junit.Assert.*;


public class DriverTest {


    @Test
    public void testDriverConstructor() {
        DriverLicense driverLicense = new DriverLicense();
        Human human = new Human();
        Driver driver = new Driver(human, driverLicense);
        assertTrue(driver.getHuman().equals(human));
        assertTrue(driver.getDriverLicense().equals(driverLicense));
    }

}