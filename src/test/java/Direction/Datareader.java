package Direction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datareader {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		

		String path="C:\\Users\\DELL\\eclipse-workspace\\batch16_test\\src\\test\\java\\XLdata\\xldata.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		String x=wb.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
		String y=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
            
		System.out.println(x);
		System.out.println(y);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(x);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(y);
		
		
		
	}

}
