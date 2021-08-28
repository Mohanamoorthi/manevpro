package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbloginpage{
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Mvnpro1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		Fbpomclass a = new Fbpomclass();
		WebElement username = a.getUsername();
		
		username.sendKeys("mona");
		
		WebElement password = a.getPassword();
		password.sendKeys("mona");
		
		driver.navigate().refresh();
		
		WebElement username2 = a.getUsername();
		username2.sendKeys("mona");
		
		
	}

}
