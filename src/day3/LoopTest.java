package day3;

public class LoopTest {
	public static void Exp1() {
		int a[] = { 21, 3, 4, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void Ex10(String str) {
		int index = 0;
		while (index < str.length()) {
			if (str.charAt(index) == 'r') {
				System.out.println("chi so " + index);
				return;
			}
			index++;
		}
		System.out.println("khong tim thay");
	}

	public static void Ex9() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print(" #");
				}

			}
			System.out.println();
		}
	}

	public static void Ex8() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void Ex7(int n) {
		int sum1 = 1;
		int sum2 = 0;
		//
		for (int i = 2; i <= 50000; i++) {
			sum1 += (1 / i);
		}
		for (int j = 50000; j >= 1; j--) {
			sum2 += (1 / j);
		}
		if (sum1 == sum2) {
			System.out.println("hai tong bang nhau");
		} else if (sum1 > sum2) {
			System.out.println("Tong 1>Tong 2");
		} else if (sum1 < sum2) {
			System.out.println("Tong 2>Tong 1");
		}

	}

	public static void Ex6() {
		int tong = 0;
		for (int i = 1; i <= 100; i++) {
			tong += (i * i);

		}
		System.out.println("tong 1->100 binh phuong= " + tong);
	}

	public static void Ex5() {
		int sum = 0;
		int count = 0;
		int compute = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sum += (i);
				count++;
			}
		}

		System.out.println("tong 1->100 chi het cho 7= " + sum);
		if (count > 0) {
			System.out.println("trung binh cngt cho 7= " + sum / count);
		}
	}

	public static void Ex4() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += (i);
				count++;
			}
		}

		System.out.println("tong 1->100 le= " + sum);
		if (count > 0) {
			System.out.println("trung binh cong= " + (double) sum / (double) count);
		}
	}

	public static void Ex3() {
		int sum = 0;
		int count = 0;
		for (int i = 111; i <= 8899; i++) {

			sum += (i);
			count++;

		}

		System.out.println("tong 111->8899 le= " + sum);
		if (count > 0) {
			System.out.println("trung binh cong= " + (double) sum / (double) count);
		}
	}

	public static void Ex2() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {

			sum += (i);
			count++;

		}

		System.out.println("tong 1->100 le= " + sum);
		if (count > 0) {
			System.out.println("trung binh cong= " + (float) sum / count);
		}
	}

	public static void Ex1() {
		int a[] = { 1, 3, 5, 8, 9 };
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ;");
		}

	}
}
