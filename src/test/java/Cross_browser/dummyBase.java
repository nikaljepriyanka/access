package Cross_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dummyBase {
	
	// open close
	
	public static WebDriver driver;
	
	@Parameters("priya")
	@BeforeMethod
	public void open(String priya) {
		if(priya.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(priya.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	

}
