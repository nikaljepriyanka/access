package test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_L3 {
	WebDriver driver;
	 @BeforeMethod
	    public void setup() {
		 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
	    }
	    
	    @Test(priority=2,enabled=false)
	    public void TestA() {
	    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pri@gmail");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("p123");
			System.out.println("a");
			
	    }
	    
	    @Test(priority=1)
	    public void TestB() {
	    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pri@gmail");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("p123");
			System.out.println("b");
	    }
	    
	    @Test(priority=0)
	    public void TestC() {
	    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pri@gmail");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("p123");
			System.out.println("c");
	    }
	    
	    @AfterMethod
	    public void c1() {
	    	driver.close();
	    }
	
}
