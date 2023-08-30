package day2;

import java.util.Scanner;

public class MagicSumTest {
	public static int MagicSum() {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int k = 0;
		while (k != -1) {
			System.out.println("Nhap so: ");
			k = scanner.nextInt();
			if (EightTest.hasEight(k)) {
				sum += k;
			}
		}

		return sum;

	}
}
