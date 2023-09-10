package btday5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
//Write a Java program to compare 2 inputted date with this format: dd-MM-YYYY
	public static void compareDate() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");
		Date date1 = simpleDateFormat.parse("01-02-1990");
		Date date2 = simpleDateFormat.parse("20-11-1998");
		System.out.println(date1.compareTo(date2));
	}
}
