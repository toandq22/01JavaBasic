package day5;

public class SinhVienKhoaTiengAnh extends SinhVien {
	public String monNN;

	@Override
	public void inThongTin() {
		System.out.format("%10s %10s %10s %10s\n %10s\n ", "ID", "Name", "DOB", "Gender", "monNN");
		System.out.format("%10d %10s %10s %10s\n %10s\n", id, name, birthDay, gender, monNN);
	}

}
