package Direction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoseggesion {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("table");
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='nav-issFlyout nav-flyout']//div"));
		System.out.println(list.size());   //50
		
		for(int c=1;c<=list.size();c++) {
			String s=list.get(c).getText();
			System.out.println(s);
			
			if(s.equals("table fan")) {
				list.get(c).click();
				break;
			}
		}
		
	}

}
