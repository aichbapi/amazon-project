package com.Amazon.com;




import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static void check() {
	ChromeDriver driver;
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://amazon.com/");
 }
	public static void checkAgain() {
		System.out.println("Hello");
	}
	
}