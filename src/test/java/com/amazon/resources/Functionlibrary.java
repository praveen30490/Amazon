package com.amazon.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionlibrary {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\sudhar\\Amazon\\src\\test\\resources\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	   return driver;
	}
		public static void  loadurl(String url) {
			driver.get(url);
			
		}
		public static void type(WebElement element,String name) {
			element.sendKeys(name);
		}
		public static void  clicks(WebElement element) {
			element.click();
		}
		public static void action(int a) {
			
		}
	

}
