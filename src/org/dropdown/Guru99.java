package org.dropdown;
import java.util.List;
import org.openqa.selenium.By;
//Day10(q-6)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay10Task\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/register.php");
WebElement ddmonth = driver.findElement(By.xpath("//select[@name='country']"));
Select s=new Select(ddmonth);
List<WebElement> options = s.getOptions();
for (WebElement element : options) {
	String text = element.getText();
	System.out.println(text);
}
	}
}
