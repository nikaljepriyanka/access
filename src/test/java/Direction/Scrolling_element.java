package Direction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_element {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
      
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement e=driver.findElement(By.xpath("//a[text()='Australia']"));
		js.executeScript("arguments[0].scrollIntoView()", e);
		Thread.sleep(2000);


		
	
	}

}
