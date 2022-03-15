package demo22.demo_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Other {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		String i= driver.getCurrentUrl();
		System.out.println(i);
		String j = driver.getTitle();
		System.out.println(j);
		
		//driver.getCurrentUrl();

		
	}

}
