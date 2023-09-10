package day5;

//
public class SinhVien {
	public int id;
	public String name;
	public String birthDay;
	public String gender;

	public void inThongTin() {
		System.out.format("%10s %10s %10s %10s\n", "ID", "Name", "DOB", "Gender");
		System.out.format("%10d %10s %10s %10s\n", id, name, birthDay, gender);
	}

}
