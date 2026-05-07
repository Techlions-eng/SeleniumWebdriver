package elementshandeling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "https://testautomationpractice.blogspot.com/";
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		

	}

}
