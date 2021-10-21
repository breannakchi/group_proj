package milestone3;

import java.sql.Timestamp;

public class Interval implements Comparable<Interval> {
    private Timestamp start, end;

    public Interval(int[] a, int[] b) {
        /**
         * TODO: We need to do a comparison right here to ensure that the start timestamp is before the end timestamp
         */

        start = new Timestamp(a[0], a[1], a[2], a[3], a[4], 0, 0);
        end = new Timestamp(b[0], b[1], b[2], b[3], b[4], 0, 0);
    }

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

    @Override
    public int compareTo(Interval o) {
        return 0;
    }

    @Override
    public boolean equals(Object o){
        return true;
    }
}
