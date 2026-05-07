package elementshandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				String URL = "https://testautomationpractice.blogspot.com/";
				driver.navigate().to(URL);
				driver.manage().window().maximize();
				WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
				Select drpCountry = new Select(drpCountryEle);
				//select option from the drop down
				//drpCountry.selectByVisibleText("Canada");
				//drpCountry.selectByIndex(5);
				//drpCountry.selectByValue("france");
				List<WebElement> options=drpCountry.getOptions();
				System.out.println("Number of options in a dropdown:" +options.size());
				
				//printing the options
				for(WebElement op:options) {
					System.out.println(op.getText());
					String optionText =  op.getText();
					if(optionText.equals("France")) {
						drpCountry.selectByVisibleText(optionText);
					}
				}
				
			
	}

}
