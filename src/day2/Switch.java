package day2;

import org.openqa.selenium.By;

public class Switch {
	public static void printDay(int n) {
		switch (n) {
		case 2:
			System.out.println(" thứ 2");
			break;
		case 3:
			System.out.println("thứ 3");
			break;
		case 4:
			System.out.println("thứ 4");
			break;
		case 5:
			System.out.println("thứ 5");
			break;
		case 6:
			System.out.println("thứ 6");
			break;
		case 7:
			System.out.println("thứ 7");
			break;
		case 8:
			System.out.println("thứ chu nhat");
			break;
		default:
			System.out.println("nhap lai:");
			break;
		}
	}

	public static By getLocator(String localType, String localvalue) {
		By result = null;
		switch (localType) {
		case "id":
			result = By.id(localvalue);
			break;
		case "name":
			result = By.name(localvalue);
			break;
		case "linkText":
			result = By.linkText(localvalue);
			break;
		case "cssSelector":
			result = By.cssSelector(localvalue);
			break;
		case "partialLinkText":
			result = By.partialLinkText(localvalue);
			break;
		case "tagName":
			result = By.tagName(localvalue);
			break;
		case "xpath":
			result = By.xpath(localvalue);
			break;
		default:
			System.out.println("locator is invalid");
			break;
		}

		return result;
	}
}
