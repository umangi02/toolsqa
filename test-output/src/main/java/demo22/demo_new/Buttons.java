package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
	public static void main (String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		WebElement dclick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(dclick).perform();
		
		//System.out.println("You Have Done A DoubleClick");
		
		Actions action1 = new Actions(driver);
		WebElement rclick = driver.findElement(By.id("rightClickBtn"));
		action1.contextClick(rclick).perform();
		//System.out.println("You Have Done A DoubleClick");
	
		 driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]/following::button[2]")).click();
	
		//System.out.println("You have done a dynamic click");
		driver.close();
		
		
	}

}
