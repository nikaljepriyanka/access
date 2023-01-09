package Cross_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_file {
//browser open close
	public static WebDriver driver;
	
	@Parameters("browsername")
	@BeforeMethod
	public void a1(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
				WebDriverManager.chromedriver().setup();
				driver=new EdgeDriver();	
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void a2() {
		driver.close();
	}
	
	
}
