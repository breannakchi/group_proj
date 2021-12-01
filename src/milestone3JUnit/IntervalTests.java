package milestone3JUnit;

import milestone3.Interval;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class IntervalTests {

    @Test
    /**
     * Is the timestamp constructor working even though it is deprecated?
     */
    public void test1() {
        int[] a = {1920, 21, 21, 21, 21};
        int[] b = {0, 21, 21, 21, 21};
        Interval i = new Interval(a, b);
        System.out.println(i);
    }

    @Test
    /**
     * Test the compareTo() and equals() methods of the Interval class.
     */
    public void test2() {
        int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);

        Interval i3 = new Interval(c, d);

        System.out.println(i1);
        System.out.println(i2);

        assertEquals(i1.compareTo(i2) == -1, true);
        assertEquals(i2.compareTo(i1) == 1, true);
        assertEquals(i2.compareTo(i3) == 0, true);
        assertEquals(i3.equals(i2), true);
        assertEquals(i1.equals(i3), false);
    }

    @Test
    /**
     * Time to
     */
    public void test3() {

    }


}
