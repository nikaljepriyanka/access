package practice_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_12 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Documents/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.switchTo().frame(1);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Categories']")).click();
	}

}
