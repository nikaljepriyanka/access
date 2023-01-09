package Direction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class RandomString_ss {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		String s=RandomString.make(4);
		File f=shot.getScreenshotAs(OutputType.FILE);
		  File l=new File("C:\\Users\\DELL\\eclipse-workspace\\batch16_test\\src\\test\\java\\Screnshottt\\"+s+".png");
	        FileUtils.copyFile(f, l);

	}

}
