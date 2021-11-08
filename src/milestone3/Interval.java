package milestone3;

import java.sql.Timestamp;

public class Interval implements Comparable<Interval> {
    private Timestamp start, end;

    public Interval(){
        start = end = null;
    }

    public Interval(Timestamp s, Timestamp e){
        start = s;
        end = e;
    }

    public Interval(int[] a, int[] b) {
        start = new Timestamp(a[0] + 99, a[1], a[2], a[3], a[4], 0, 0);
        end = new Timestamp(b[0], b[1], b[2], b[3], b[4], 0, 0);
    }

    /**
     * Assuming that these two parameters are already sorted, begin to overlap the two intervals into a new one.
     * @param a
     * @param b
     * @return
     */
    public static boolean overlap(Interval a, Interval b){
        Interval r = new Interval();

        return false;
    }

    /**
     * Every Interval should be compared first by their start times, and then their end times if the start times
     * are the same.
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Interval o) {
        int startComparison =  this.start.compareTo(o.start);
        if(startComparison != 0) return startComparison;
        else return this.end.compareTo(o.end);
    }

    /**
     * Compare two objects to see if they are both Interval objects with the same information (deep-equality check)
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        return this.compareTo(((Interval) o)) == 0;
//        return start.equals(((Interval) o).start) && end.equals(((Interval) o).end);
    }


    //    Accessor & Mutator methods

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }


    @Override
    public String toString() {
        return start.toString() + " " + end.toString();
    }
}
