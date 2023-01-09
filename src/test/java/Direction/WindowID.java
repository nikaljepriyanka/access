package Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowID {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//parent window id
      	String pwi= driver.getWindowHandle();
		System.out.println("parent window id==" +pwi);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		//child & parent ids
		Set<String> cpid=driver.getWindowHandles();
		System.out.println("child and parent id==" +cpid);
		
		List<String>list=new ArrayList(cpid);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("pri12@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.navigate().back();
		driver.switchTo().window(list.get(0));
		driver.quit();
		
		
	}

}
