package Direction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XL_readr {

	public static void main(String[] args) throws Exception {
		
		
		String path="C:\\Users\\DELL\\eclipse-workspace\\batch16_test\\src\\test\\java\\XLdata\\xldata.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		String a=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String a1=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		String a2=wb.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
		String a3=wb.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
		String a4=wb.getSheet("sheet1").getRow(0).getCell(4).getStringCellValue();
		String a5=wb.getSheet("sheet1").getRow(0).getCell(5).getStringCellValue();
		String a6=wb.getSheet("sheet1").getRow(0).getCell(6).getStringCellValue();
		String a7=wb.getSheet("sheet1").getRow(0).getCell(7).getStringCellValue();
		String a8=wb.getSheet("sheet1").getRow(0).getCell(8).getStringCellValue();
		String a9=wb.getSheet("sheet1").getRow(0).getCell(9).getStringCellValue();
		String a10=wb.getSheet("sheet1").getRow(0).getCell(10).getStringCellValue();
		  
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(a1);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(a2);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(a3);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(a4);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(a5);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(a6);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(a7);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(a8);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(a9);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(a10);
		
		
		
		

	}

}
