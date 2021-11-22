package milestone5;

import java.util.ArrayList;
import java.util.TreeSet;



public class CompareUserAvailability implements Comparable<CompareUserAvailability>{
	
	
	
	private String name;
	private int month;
	private int day;
	private int year;
	private int time;
	
	public CompareUserAvailability(String name, int month, int day, int year, int time) {
		this.name = name;
		this.month = month;
		this.day = day;
		this.year = year;
		this.time = time;
	}
	
	public int compareTo(CompareUserAvailability that) {
		
		if(this.month != that.month) {
			return (int) Math.signum(this.month - that.month);
		}
		if(this.day != that.day) {
			return (int) Math.signum(this.day - that.day);
		}
		if(this.year != that.year) {
			return (int) Math.signum(this.year - that.year);
		}
		if(this.time != that.time) {
			return (int) Math.signum(this.time - that.time);
		}
		return 0;
		
		
	}
	
	public boolean equals(Object o) {
		
		CompareUserAvailability that = (CompareUserAvailability) o;
		return this.compareTo(that) == 0;
	}
	
	//if  times equal, then the time is unavailable
	

}

