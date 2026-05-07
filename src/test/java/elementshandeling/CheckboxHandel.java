package elementshandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHandel {

	public static void main(String[] args) throws InterruptedException {
		//Checkboxes
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "https://testautomationpractice.blogspot.com/";
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='form-group']//input[@type='checkbox']"));
		/*for(int i=0; i<=checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}*/
		for(WebElement checkbox:checkboxes) {
			checkbox.click();
		}
		Thread.sleep(5000);
		for(int i=0;i<=checkboxes.size();i++) {
			if(i == 4) {
				checkboxes.get(i).click();
			}
		}

	}

}
