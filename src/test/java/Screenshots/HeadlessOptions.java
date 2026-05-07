package Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessOptions {

	public static void main(String[] args) {
		// https://demo.nopcommerce.com/register
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless=new");
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://demo.nopcommerce.com/register");
				driver.manage().window().maximize();
				
				//IsDisplayed()
				WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
				if(logo.isDisplayed()) {
					System.out.println("Test Passed");
				}else {
					System.out.println("logo is not visible");
				}
				WebElement searchBar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
				if(searchBar.isEnabled() == true) {
					System.out.println("Test Passed");
				}else{
					System.out.println("Test Fail");
				}
				WebElement checkboxValidation = driver.findElement(By.xpath("//input[@id=\"NewsLetterSubscriptions_0__IsActive\"]"));
				if(checkboxValidation.isSelected() == true) {
					System.out.println("Selected");
				}else {
					System.out.println("Not Selected");
				}
				
				driver.close();
			

	}

}
