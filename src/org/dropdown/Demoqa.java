package org.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Day10(q-2)Selenium 
public class Demoqa {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay10Task\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demoqa.com/automation-practice-form/");
	

	}

}
