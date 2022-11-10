package mypack;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String retireBetter = "https://meet.sagewellfinancial.com/teachers/retire-better";
		driver.get(retireBetter);
	}

}
