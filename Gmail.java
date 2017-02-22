package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Users\\srujith\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver d  = new ChromeDriver();
		
		d.get("http://www.Gmail.com");
	
		d.findElement(By.name("Email")).sendKeys("priyankabqa@gmail.com");
		
		
		d.findElement(By.id("next")).click();
		
		d.findElement(By.name("Passwd")).sendKeys("pathi143");
	
		
		d.findElement(By.id("signIn")).click();
	}

	
	}

