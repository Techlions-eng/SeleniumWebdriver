package day21;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		//1) Launch browser (chrome)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//2) Open URL https://demo.opencart.com/
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		String act_title = driver.getTitle();
		if(act_title.equals("STORE")) {
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		driver.close();
		}

}
