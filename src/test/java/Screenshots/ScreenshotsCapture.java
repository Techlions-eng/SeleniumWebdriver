package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsCapture {

	public static void main(String[] args) {
		//
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) full page screenshot
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
		sourcefile.renameTo(targetfile);//copy sourcefile to target file*/
		
		//2) capture the screenshot of specific section
		WebElement productSection = driver.findElement(By.xpath("//div[@class='item-grid']"));
		File sourcefile = productSection.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\productSection.png");
		sourcefile.renameTo(targetfile);//copy sourcefile to target file
		
	
	}

}
