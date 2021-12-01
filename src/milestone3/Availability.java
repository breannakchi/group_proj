package milestone3;

import java.sql.Timestamp;
import java.util.*;

/**
 * Should we make this class extend the TreeSet Class?
 *
 * If we use a TreeSet, information will be retained in sorted order. That might be really helpful
 */
public class Availability extends TreeSet<Interval> {

    public static class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.compareTo(o2);
        }
    }

//    private class AvailabilityIterator implements Iterator<Interval> {
//        int index = -1;
//
//        @Override
//        public boolean hasNext() {
//            sort(new IntervalComparator());
//            return index < size() - 1;
//        }
//
//        @Override
//        public Interval next() {
//            if(hasNext()) {
//                index++;
//                return get(index);
//            }
//            else return null;
//        }
//    }

    public Availability(){
        super();
    }

    public Availability(Collection<Interval> a) {
        super(a);
    }

    @Override
    public Iterator<Interval> iterator() {
        return super.iterator();
    }

    /**
     * TODO: Method that reduces collection until there are no overlaps between the intervals.
     * I don't know if I need this functionality yet, but I might need a method that reduces existing overlaps in an
     * Availability object.
     *
     * @param -
     * If the Intersection is null, remove the overlapping intervals and replace them with a new one.
     * Else, save the overlaps in the Intersection.
     */
    public Availability reduce(boolean performReduction) {

        if(size() < 2)
            return this;

        Iterator<Interval> i = iterator();

        Interval i1, i2;
        i1 = i.next();
        i2 = i.next();//TODO: what if size of Availability is 1?

        Availability reduction, intersection;
        intersection = reduction = new Availability();

        do {
        //while(i.hasNext()){
            /*
                If 1.end >= 2.start --> Ladies and Gentlemen, we got 'em

                During this time i have to calculate the overlap between these two intervals and return it.
            */
            if(i1.getEnd().compareTo(i2.getStart()) == 1){

                if(performReduction) {
                    //We know that the younger one has an earlier start time
                    Timestamp reductionStart = i1.getStart();
                    //However we don't know if the older or younger has a later finish time
                    //TODO: Figure out who has the later finish time.
                    Timestamp reductionEnd = (i1.getEnd().compareTo(i2.getEnd()) == 1) ? i1.getEnd() :  i2.getEnd();
                    Interval reducedInterval = new Interval(reductionStart, reductionEnd);

                    //Add the reduced interval to the Availability, and remove the two intervals.
                    reduction.add(reducedInterval);
                    //remove (i1);
                    //remove(i2);
                    //Assign the reduced interval to i1.
                    i1 = reducedInterval;

                }
                else{

                    Timestamp overlapStart = i1.getStart();
                    Timestamp overlapEnd = (i1.getEnd().compareTo(i2.getEnd()) == 1) ? i1.getEnd() :  i2.getEnd();
                    Interval overlap = new Interval(overlapStart, overlapEnd);
                    intersection.add(overlap);

                    //How do we handle the Interval pointers once we have completed the overlap
                    i1 = overlap;
                }

                if(i.hasNext()) {
                    i2 = i.next();
                    continue;
                }
                else break;
            }
            else{
                reduction.add(i1);
                i1 = i2;
            }

            //Ladies and Gentlemen, we don't got 'em
            //Move both of the Interval pointers down the line.



            if(i.hasNext())  i2 = i.next();
            else {
                reduction.add(i2);
                break;
            }
        } while(i.hasNext());
        return (performReduction ? reduction : intersection);
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
    public static Availability computeOverlap(Availability a1, Availability a2) {
        // Part 1
        a1.reduce(true);
        a2.reduce(true);

        //Part 2
//        Availability union = sort(this, a);
        //Let's assume that we don't do insertion sort
        a1.addAll(a2);

        //Part 3
        Availability intersection = a1.reduce(false);

        //Part 3.5 Reduce the thing until it is simplified
        int size1 = intersection.size();
        int size2 = 0;
        do{
            intersection = intersection.reduce(true);
            size2 = intersection.size();
        } while(size2 > size1);

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
