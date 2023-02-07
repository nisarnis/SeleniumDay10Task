package org.dropdown;
//Day10(q-7)
import java.util.List;
//Day10(q-7)Selenium DropDown
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Guru99Task7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay10Task\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement ddcountry = driver.findElement(By.name("country"));
		Select s=new Select(ddcountry);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement elements = options.get(i);
			String txt = elements.getAttribute("value");
			System.out.println(txt);
		}

	}

}
