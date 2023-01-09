package Direction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement x=driver.findElement(By.xpath(""));
		WebElement y=driver.findElement(By.xpath(""));
		act.dragAndDrop(x, y);
		
		WebElement x1=driver.findElement(By.xpath(""));
		WebElement y1=driver.findElement(By.xpath(""));
		act.dragAndDrop(x1, y1);
		
		WebElement x2=driver.findElement(By.xpath(""));
		WebElement y2=driver.findElement(By.xpath(""));
		act.dragAndDrop(x2, y2);
		
		WebElement x3=driver.findElement(By.xpath(""));
		WebElement y3=driver.findElement(By.xpath(""));
		act.dragAndDrop(x3, y3);
	}

}
