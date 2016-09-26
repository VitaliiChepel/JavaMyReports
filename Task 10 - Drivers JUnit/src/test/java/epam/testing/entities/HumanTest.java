package epam.testing.entities;


import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HumanTest {

    @Test
    public void testHumanConstructorForInputtedBirthDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2013);
        cal.set(Calendar.MONTH, 8);
        cal.set(Calendar.DAY_OF_MONTH, 6);

        Date birthDate = cal.getTime();
        Human human = new Human("", birthDate, Human.Gender.MALE, Human.BloodGroup.SECOND);
        assertEquals(birthDate, human.getBirthDate());
    }



    @Test
    public void testHumanConstructorForInputtedBloodGroup() {
        Human.BloodGroup expResult = Human.BloodGroup.FOURTH;
        Human human = new Human("", new Date(), Human.Gender.FEMALE, expResult);
        assertEquals(expResult, human.getBloodGroup());
    }
}