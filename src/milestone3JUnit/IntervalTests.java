package milestone3JUnit;

import milestone3.Interval;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class IntervalTests {

    @Test
    public void test1(){
        int[] a = {1920,21,21,21,21};
        int[] b = {10,21,21,21,21};
        Interval i = new Interval(a,b);
        System.out.println(i);
    }


}
