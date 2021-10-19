package milestone3;

import java.util.TreeSet;

/**
 * Should we make this class extend the TreeSet Class?
 *
 * If we use a TreeSet, information will be retained in sorted order. That might be really helpful
 */
public class Availability extends TreeSet<Interval>{

    public Availability(){}

    public Availability(TreeSet<Interval> a) {
        addAll(a);
    }

    /**
     * TODO: Method that reduces collection until there are no overlaps between the intervals.
     * I don't know if I need this functionality yet, but I might need a method that reduces existing overlaps in an
     * Availability object.
     */
    public void reduce() {

    }


    /**
     * TODO: The toughest part of it all. (First complete reduce() and sort())
     * 1. First I need to create a distinction between the two Availabilities (possibly by reducing?). Let's assume that
     * the two availabilities are fully reduced for me already.
     * <p>
     * 2. Sort the two collections of already sorted Intervals (best case Insertion Sort runs in Linear Time) and
     * store the sorted Intervals in a collection.
     * <p>
     * 3. In linear fashion, compare each interval with the next to see if there is an overlap. If there is an overlap,
     * calculate it and store it in the Availability object that will be returned at the end of the method
     * <p>
     * Step 3 will work because only potential overlaps will exist between intervals that don't belong to the same
     * person IF the original collections were fully reduced.
     * <p>
     * 4. Once I am done iterating through the entire List, go ahead and return the Availability object.
     */
    public Availability computeOverlap(Availability a) {
        // Part 1
        reduce();
        a.reduce();

        //Part 2
        Availability union = sort(this, a);
        Availability intersection = new Availability();

        /**
         * TODO: Part 3
         */


        //Part 4
        return intersection;
    }


    /**
     * TODO: Insertion Sort for TreeSet. We will be using it to run sorts in linear time.
     * @param a
     * @param b
     * @return
     */
    public Availability sort (Availability a, Availability b){

        return null;
    }


    /**
     * Insertion sort algorithm from Geeks for Geeks
     * This code is contributed by Rajat Mishra.
     *
     * @param arr
     */
//    public void sort(int arr[]) {
//
//        int n = arr.length;
//        for (int i = 1; i < n; ++i) {
//            int key = arr[i];
//            int j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }

}
