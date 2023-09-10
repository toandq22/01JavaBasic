package btday5;

import java.util.Random;

public class Date1 {
	// Write a Java program to generate a random string with this format:
	// “Yourname_xxxx”. And “xxxx”
	// is the random integer number in the range of 0 to 7000
	public static void randomUser() {
		String username = "yourname";
		Random rd = new Random();
		int xxxx = rd.nextInt(7001);
		String result = username + "_" + xxxx;
		System.out.println("string random " + result);
	}
}
