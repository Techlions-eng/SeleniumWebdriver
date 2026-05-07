package elementshandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*s.subsring(index1,index2) - for pagination count given under table
		 * as Sting s= "page 1 of 100"
		 * s.indexOf("(")+1
		 * s.indexOf("Pages")-1
		*/
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='productTable']//td"));
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
		
	
			for(int p=1; p<=pages.size();p++){
				if(p>1) {
					WebElement pageClick = driver.findElement(By.xpath("//ul[@id='pagination']//li["+p+"]//a"));
					pageClick.click();
					Thread.sleep(2000);
				}
					List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
					for(int i=0; i<=rows.size();i++) {
						WebElement productName = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[2]"));
						System.out.println(productName.getText());
						
					
				}
			}
				
		driver.close();
	}

}
