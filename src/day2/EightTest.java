package day2;

public class EightTest {
	public static boolean hasEight(int number) {
		boolean result = true;
		// Convert a int number to String
		String numberStr = String.valueOf(number);
		// Duyet qua tung ki tu trong string
		for (int i = 0; i < numberStr.length(); i++) {
			// So sANH TUNG KI TU TRONG string, neu chua ki tu 8 thi gans result=true,thoat
			// khoi vong lap

			// char laf kie so
			if (numberStr.charAt(i) == '8') {
				return result;
			}

		}
		result = false;
		return result;

	}
}
