package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(Switch.getLocator("id", "username"));
		
	}

	public static void doEx1() {
		// Method-Exe1 -start

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra:");
		int x = scanner.nextInt();
		if (OddTest.isOdd(x)) {
			System.out.println("ODD");

		} else {
			System.out.println("EVEN");
		}
		// Method-Exe1-end

	}

	public static void doEx2() {

		// Method-Exe2 -start
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra:");
		int x = scanner.nextInt();
		if (EightTest.hasEight(x)) {
			System.out.println("ODD");
		} else {
			System.out.println("EVEN");
		}
		// Method-Exe2 -end
	}

	// Method-Exe1-end
	public static void doEx3() {
		int sum = MagicSumTest.MagicSum();
		System.out.println("tong la :" + sum);

	}

	public static void doEx4(int n) {
		Switch.printDay(n);

	}

}
