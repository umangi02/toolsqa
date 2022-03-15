package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/frames");

	
		WebElement frame1Heading = driver.findElement(By.id("sampleHeading"));

		
		String frame1Text = frame1Heading.getText();

	
		System.out.println("Text of the frame1 heading is:" + frame1Text);

	
		driver.close();
	}
}
