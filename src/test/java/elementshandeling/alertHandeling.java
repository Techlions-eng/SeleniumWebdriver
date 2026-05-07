package elementshandeling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandeling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "https://testautomationpractice.blogspot.com/";
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		//Normal alert with OK button, alert window is not a webelement
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		//confirmation alert ok and cancel button 
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(5000);
		Alert myalertTwo = driver.switchTo().alert();
		myalertTwo.dismiss();
		
		//Prompt alert with text input fields 
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Thread.sleep(5000);
		Alert myalertPrompt = driver.switchTo().alert();
		myalertPrompt.sendKeys("Welcome");
		myalertPrompt.accept();
	}

}
