package milestone3JUnit;

import milestone3.Availability;
import milestone3.Interval;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


import static milestone3.Availability.computeOverlap;
import static org.junit.Assert.*;


public class AvailabilityTests {

    @Test
    /**
     * Can we create an Availability Object?
     * Can we store Intervals in an Availability Object?
     * Does the Availability Object store the Intervals in sorted order?
     */
    public void test1() {
        int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);

        Interval i3, i4, i5, i6;

        i3 = new Interval(a, c);
        i4 = new Interval(a,d);
        i5 = new Interval(b,c);
        i6 = new Interval(b,d);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);

        ArrayList<Interval> list = new ArrayList<Interval>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);

        //Time to check if the TreeSet harbors the information in sorted order
        Availability avail = new Availability(list);
        list.sort(new IntervalComparator());
        Iterator treeSetIterator = avail.iterator();

        for(Interval i : avail){
            assertEquals(i, treeSetIterator.next());
        }

    }

    @Test
    /**
     * Reduce Test: No overlap
     */
    public void test2(){


        int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);

        Availability apple = new Availability();
        apple.add(i1);
        apple.add(i2);

        apple.reduce(false);

    }

    @Test
    /**
     * Singular Overlap
     */
    public void test3(){


        int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);

        Availability apple = new Availability();
        Availability bannana = new Availability();

       System.out.println(computeOverlap(apple,bannana));


    }


}

class IntervalComparator implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.compareTo(o2);
    }
}
