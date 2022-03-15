package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Text {
	
	
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("xyzvshj");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("xyzvshj@gmail.com");
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("j-109,dhhhejjhj");
		WebElement paddress = driver.findElement(By.id("permanentAddress"));
		paddress.sendKeys("j-109,fsgbshbjnzn");
	    WebElement submit = driver.findElement(By.id("submit"));
	    submit.submit();
	   

	}
}
