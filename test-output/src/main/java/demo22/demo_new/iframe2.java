package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/frames");

		driver.switchTo().frame(0);

		WebElement frame1Heading = driver.findElement(By.id("sampleHeading"));

		String frame1Text = frame1Heading.getText();

		System.out.println(frame1Text);

		driver.close();
	}
}
