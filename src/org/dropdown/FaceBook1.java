package org.dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Day10(q-4)
public class FaceBook1 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay10Task\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
btncreate.click();
Thread.sleep(3000);
WebElement ddmonth = driver.findElement(By.id("month"));
Select s=new Select(ddmonth);
List<WebElement> options = s.getOptions();
for (WebElement web : options) {
	String text = web.getText();
	System.out.println(text);
}

	}

}
