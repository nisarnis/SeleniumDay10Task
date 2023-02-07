package org.dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Day10(q-3)
public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay10Task\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/\r\n");
		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncreate.click();
		Thread.sleep(3000);
//To find element for dropdown
	WebElement ddyear = driver.findElement(By.id("year"));
	Select s=new Select(ddyear);
	List<WebElement> options = s.getOptions();
	for (int i = 0; i <options.size(); i++) {
		WebElement element = options.get(i);
		String txt = element.getAttribute("value");
		System.out.println(txt);
		
	}	
	}
}
