package btday5;

import java.util.Calendar;
import java.util.Date;

public class Date2 {
//Write a Java program to get and display information 
	// (year,month,day,hour,minute)
	// of a default calendar
	public static void getDate() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println("time now :" + date);
		System.out.println("year now:" + calendar.get(Calendar.YEAR));
		System.out.println("Month now " + calendar.get(Calendar.MONTH) + 1);
		System.out.println("Day now " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hour now " + calendar.get(Calendar.HOUR));
		System.out.println("Minute now "+calendar.get(Calendar.MINUTE));
	}

}
