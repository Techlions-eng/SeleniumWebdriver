package day26;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		//String windowId = driver.getWindowHandle();
		//System.out.println("Window ID:"+ windowId);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);
		//close multiple browser windows
		driver.quit();
		//close single browser windows driver.close();
	}

}
