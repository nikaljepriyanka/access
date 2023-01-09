package Direction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_action {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//right click
	//	WebElement rc=driver.findElement(By.xpath("//span[text()='right click me']"));
	//	act.contextClick(rc).build().perform();
		
		//double click
	//	WebElement dc=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//	act.doubleClick(dc).build().perform();
		
		//move click
		WebElement mc=driver.findElement(By.xpath("//a[text()='Demo Site']"));
		act.moveToElement(mc).click().build().perform();
		
		
		
		
		
		
		

	}

}
