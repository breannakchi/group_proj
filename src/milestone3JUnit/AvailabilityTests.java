package milestone3JUnit;

import milestone3.Availability;
import milestone3.Interval;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import milestone3.Availability.IntervalComparator;


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
     *
     * Karan
     */
    public void test2(){

        // year, month, date, hour, minute

        int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 25, 11, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);

        // Karan
        int[] e = {20, 11, 25, 11, 46};
        int[] f = {50, 10, 25, 12, 45};
        Interval i3 = new Interval(e, f);

        int[] g = {2000, 11, 25, 11, 46};
        int[] h = {2050, 10, 25, 12, 45};
        Interval i4 = new Interval(g, h);

        // year, month, date, hour, minute

        int[] i = {1999, 9, 22, 21, 45};
        int[] j = {2001, 8, 12, 10, 45};
        Interval i5 = new Interval(i, j);

        int[] k = {2022, 11, 25, 11, 46};
        int[] l = {2050, 10, 25, 12, 45};
        Interval i6 = new Interval(k, l);

        Availability apple = new Availability();
        apple.add(i1);
        apple.add(i2);
        apple.add(i3);
        apple.add(i4);
        apple.add(i5);
        apple.add(i6);


        apple.reduce(false);

    }

    @Test
    /**
     * Singular Overlap --> Passing Properly
     */
    public void test3(){


        int[] a = {10, 21, 21, 21, 21};
        int[] b = {30, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);



        Availability preReduction = new Availability ();
        preReduction.add(i1);
        preReduction.add(i2);
        Availability postReduction = preReduction.reduce(true);
        assertNotEquals(preReduction,postReduction);
        System.out.println("Pre: " + preReduction);
        System.out.println("Post: " + postReduction);


    }

    @Test
    /**
     * Singular Overlap
     * Karan - modifed by Mickey --> Passing Properly now
     */
    public void test4(){

        // year, month, date, hour, minute

        int[] a = {10, 2, 21, 21, 21};
        int[] b = {10, 2, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 2, 25, 11, 21};
        int[] d = {100, 2, 21, 21, 21};
        Interval i2 = new Interval(c, d);

        // Karan
        int[] e = {20, 11, 25, 11, 46};
        int[] f = {50, 10, 25, 12, 45};
        Interval i3 = new Interval(e, f);

        int[] g = {0, 11, 25, 11, 46};
        int[] h = {50, 10, 25, 12, 45};
        Interval i4 = new Interval(g, h);

        // year, month, date, hour, minute

        int[] i = {-1, 9, 22, 21, 45};
        int[] j = {1, 8, 12, 10, 45};
        Interval i5 = new Interval(i, j);

        int[] k = {22, 11, 25, 11, 46};
        int[] l = {50, 10, 25, 12, 45};
        Interval i6 = new Interval(k, l);

        Availability apple = new Availability();
        apple.add(i1);
        apple.add(i2);
        apple.add(i3);


        Availability banana = new Availability();
        banana.add(i4);
        banana.add(i5);
        banana.add(i6);

        System.out.println(apple + " " +  banana);

        System.out.println(computeOverlap(apple,banana));




    }

    @Test
    /**
     * Singular Overlap
     * Karan
     */
    public void test5(){

        // year, month, date, hour, minute



        // Karan
//        int[] e = {20, 11, 25, 11, 46};
//        int[] f = {50, 10, 25, 12, 45};
//        Interval i3 = new Interval(e, f);

        int[] g = {2000, 11, 25, 11, 46};
        int[] h = {2050, 10, 25, 12, 45};
        Interval i1 = new Interval(g, h);

        // year, month, date, hour, minute

        int[] i = {1999, 9, 22, 21, 45};
        int[] j = {2001, 8, 12, 10, 45};
        Interval i2 = new Interval(i, j);

//        int[] k = {2022, 11, 25, 11, 46};
//        int[] l = {2050, 10, 25, 12, 45};
//        Interval i6 = new Interval(k, l);

        Availability apple = new Availability();
        apple.add(i1);


        Availability banana = new Availability();
        banana.add(i2);


        System.out.println(computeOverlap(apple,banana));




    }

    /**
     * Can we perform a reduction and a computeOverlap()?
     *
     * Test Case written by Mickey --> passing properly
     */

    @Test
    public void test6() {
        int[] a = {10, 21, 21, 21, 21};
        int[] b = {10, 21, 21, 21, 21};
        Interval i1 = new Interval(a, b);

        int[] c = {20, 21, 21, 21, 21};
        int[] d = {100, 21, 21, 21, 21};
        Interval i2 = new Interval(c, d);


        ArrayList<Interval> list = new ArrayList<Interval>();
        list.add(i1);
        list.add(i2);


        Availability preReduction = new Availability (list);
        Availability postReduction = preReduction.reduce(true);
        assertEquals(preReduction,postReduction);

    }

}

//class IntervalComparator implements Comparator<Interval> {
//
//    @Override
//    public int compare(Interval o1, Interval o2) {
//        return o1.compareTo(o2);
//    }
//}
