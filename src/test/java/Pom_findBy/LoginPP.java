package Pom_findBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomRepo.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPP {
	WebDriver driver;
	
	@BeforeMethod
	public  void open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyloginvalid() {
		//enter value to emailid
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("p@gmail.com");
		
		//enter value to pass
		login.getTxt_pass().sendKeys("P123");
		
		//click on login btn
		login.getBtn_login().click();
	}
	
	@Test
	public void verifylogininvalid() {
		//enter value to emailid
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("p@gmail.com");
		
		//enter value to pass
		login.getTxt_pass().sendKeys("P123");
		
		//click on login btn
		login.getBtn_login().click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
