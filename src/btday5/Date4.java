package btday5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Date4 {
	/*
	 * Write a Java program to display the dates in the following formats:
	 * 2009-12-31 31-12-2009 2009-12-31 23:59:59 23:59.59.999 2009-12-31
	 * 23:59:59.999 2009-12-31 23:59:59.999 +0100
	 * 
	 */
	public static void changeDate() {
		LocalDate datLocalDate = LocalDate.now();
		System.out.println(datLocalDate);

		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YYYY");
		String date1 = sdf1.format(date);
		System.out.println(date1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String date2 = sdf2.format(date);
		System.out.println(date2);
		/*
		 * HH:mm:ss.SSS (23:59.59.999)
		 * 
		 * yyyy-MM-dd HH:mm:ss.SSS (2009-12-31 23:59:59.999)
		 * 
		 * yyyy-MM-dd HH:mm:ss.SSS Z (2009-12-31 23:59:59.999 +0100)
		 */
		SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss.SSS");
		String date3 = sdf3.format(date);
		System.out.println(date3);

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String date4 = sdf4.format(date);
		System.out.println(date4);

		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z");
		String date5 = sdf5.format(date);
		System.out.println(date5);
	}
}
