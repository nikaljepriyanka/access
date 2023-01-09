package Direction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_handle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//Alert
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("priy@gmail.com");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//Alert handle
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		a.dismiss();
		

	}

}
