package Direction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(drp);
	//	s.selectByIndex(1);
		s.selectByValue("INDIA");
	//s.selectByVisibleText("BENIA");
		Thread.sleep(3000);
		List<WebElement>list=s.getOptions();
		System.out.println(list.size());         //264
	}

}
