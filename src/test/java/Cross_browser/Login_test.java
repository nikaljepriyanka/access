package Cross_browser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_test extends Base_file {
@Test
	
	public void verifylogin() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("priy@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("p18");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
}
