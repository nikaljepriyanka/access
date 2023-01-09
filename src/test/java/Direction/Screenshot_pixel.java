package Direction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_pixel {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		File f=shot.getScreenshotAs(OutputType.FILE);
		File l=new File("C:\\Users\\DELL\\eclipse-workspace\\batch16_test\\src\\test\\java\\Screnshottt\\fullsc.png");
	    FileUtils.copyFile(f, l);
		
		
	}

}
