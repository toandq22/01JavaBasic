package day3;

import java.util.Scanner;

public class ArrayTest {
	public static void GradesAverage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong sv: ");
		int numStudents = scanner.nextInt();
		int graades[] = new int[numStudents];
		int sum = 0;
		for (int i = 0; i < graades.length; i++) {

			System.out.println("Nhap diem sv[" + i + "]: ");
			graades[i] = scanner.nextInt();
			if (graades[i] >= 0 && graades[i] <= 100) {
				sum += graades[i];
			} else {
				System.out.println("Nhap lai diem sv[" + i + "]: ");
				graades[i] = scanner.nextInt();
				sum += graades[i];
			}
		}

		System.out.println("diem TB= " + (float) sum / (graades.length));
	}

	public static void arrayToString(int a[]) {
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			if (i == (a.length - 1)) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + ",");
			}

		}
		System.out.print("}");
	}

	public static void printArray(int a[]) {
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			if (i == (a.length - 1)) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + ",");
			}

		}
		System.out.print("}");

	}

	public static void printArray(double a[]) {
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			if (i == (a.length - 1)) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + ",");
			}

		}
		System.out.print("}");

	}

	public static void printArray(float a[]) {
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			if (i == (a.length - 1)) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + ",");
			}

		}
		System.out.print("}");

	}

	public static void main(String[] args) {
		double[] a = { 1.2, 2.3, 4.4, 5.4 };
		printArray(a);

	}
}
