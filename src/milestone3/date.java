package milestone3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;

//Class that takes two dates and finds a day available between those two dates based on available schedules
public class date {

	Scanner sc = new Scanner(System.in);
	
	//gets the first date of the date range
	public Date inputDate1() {
		System.out.println("Please enter the first date");
		String date = sc.next();
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-YYY");
		Date date1 = null;
		try {
			date1 = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date1;
		
	}
	
	//gets the second date of the date range
	public Date inputDate2() {
		System.out.println("Please enter the second date");
		String date = sc.next();
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-YYY");
		Date date2 = null;
		try {
			date2 = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date2;
	}
	
	//returns the avaivlable daus in between the the user inputed dates
	public ArrayList<Date> availableDays(Date one, Date two){
		one = inputDate1();
		two = inputDate2();
		
		ArrayList<Date> list = new ArrayList<Date>();
		Date temp = one;
		while(temp != two) {
			//To do- add all the dates in between one and two to the list
		}
	
		return list;
		
		
	}
	
	public static void main(String[] args) {
		
	}
}
