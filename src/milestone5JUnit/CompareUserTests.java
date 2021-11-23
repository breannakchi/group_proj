package milestone5JUnit;


import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import milestone5.CompareUserAvailability;


public class CompareUserTests {

    @Test
    /**
     * Is the timestamp constructor working even though it is deprecated?
     */
    public void testCompareTo() {
        // name, month, day, year , time
        // Karan
        CompareUserAvailability c1 = new CompareUserAvailability("Joy", 10, 3, 2020, 24);
        CompareUserAvailability c2 = new CompareUserAvailability("Joy", 10, 3, 2020, 24);
        assertEquals(0, c1.compareTo(c2));


        CompareUserAvailability c3 = new CompareUserAvailability("James", 11, 3, 2020, 24);
        CompareUserAvailability c4 = new CompareUserAvailability("Joy", 10, 3, 2050, 24);
        assertEquals(1, c3.compareTo(c4));



        CompareUserAvailability c5 = new CompareUserAvailability("James", 11, 3, 2020, 24);
        CompareUserAvailability c6 = new CompareUserAvailability("Joy", 12, 20, 2050, 26);
        assertEquals(-1, c5.compareTo(c6));
    }

    @Test //checks if they are the same
    public void testOne() {
        CompareUserAvailability a = new CompareUserAvailability("Bob", 9, 12, 2001, 12);
        CompareUserAvailability b = new CompareUserAvailability("Bob", 9, 12, 2001, 12);

        assertEquals(a.compareTo(b), 0);
    }

    @Test//confirms they are not the same
    public void testTwo() {
        CompareUserAvailability a = new CompareUserAvailability("Bob", 9, 12, 2001, 12);
        CompareUserAvailability b = new CompareUserAvailability("Bob", 10, 12, 2001, 12);

        assertNotEquals(a.compareTo(b), 0);
    }

    @Test//checks if months aren't equal
    public void testThree() {
        CompareUserAvailability a = new CompareUserAvailability("Bob", 9, 12, 2001, 12);
        CompareUserAvailability b = new CompareUserAvailability("Bob", 10, 12, 2001, 12);

        assertEquals(a.compareTo(b), -1);
    }

    @Test//checks if days arent equal
    public void testFour() {
        CompareUserAvailability a = new CompareUserAvailability("Bob", 9, 12, 2001, 12);
        CompareUserAvailability b = new CompareUserAvailability("Bob", 9, 13, 2001, 12);

        assertEquals(a.compareTo(b), -1);
    }

    @Test//checks if years arent equal
    public void testFive() {
        CompareUserAvailability a = new CompareUserAvailability("Bob", 9, 12, 2001, 12);
        CompareUserAvailability b = new CompareUserAvailability("Bob", 9, 12, 2002, 12);

        assertEquals(a.compareTo(b), -1);
    }

    @Test//checks if times arent equal
    public void testSix() {
        CompareUserAvailability a = new CompareUserAvailability("Bob", 9, 12, 2001, 12);
        CompareUserAvailability b = new CompareUserAvailability("Bob", 9, 12, 2001, 13);

        assertEquals(a.compareTo(b), -1);
    }
}
