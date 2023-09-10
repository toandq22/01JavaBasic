package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {

	}

	public static void inThongTinSVT() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<SinhVienKhoaToan> sinhVienKhoaToans = new ArrayList<SinhVienKhoaToan>();

		System.out.println("Nhap so sv :");
		int dem = scanner.nextInt();
		int i = 0;
		while (i < dem) {
			SinhVienKhoaToan svKhoaToan = new SinhVienKhoaToan();
			System.out.println("nhap sv" + (i + 1));

			System.out.println("nhap id:");
			svKhoaToan.id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("nhap name:");
			svKhoaToan.name = scanner.nextLine();

			System.out.println("nhap gender:");
			svKhoaToan.gender = scanner.nextLine();

			System.out.println("nhap birthday:");
			svKhoaToan.birthDay = scanner.nextLine();
			sinhVienKhoaToans.add(svKhoaToan);
			i++;
		}

		for (SinhVienKhoaToan sinhVienKhoaToan : sinhVienKhoaToans) {
			sinhVienKhoaToan.inThongTin();
		}
	}
}
