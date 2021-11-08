package milestone3JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import milestone3.Availability;
import milestone3.Interval;

class ReduceTests {

	@Test//Abhinav
	void test() {
		int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);
        
        Availability apple = new Availability();
        apple.add(i1);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);
        
        Availability monkey = new Availability();
        monkey.add(i2);
        
        
        //Availability.computeOverlap(apple, monkey);
        assertEquals(Availability.computeOverlap(apple, monkey), new ArrayList<Interval>());

        
	}

}
