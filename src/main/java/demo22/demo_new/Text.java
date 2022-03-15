package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	WebDriver driver;
	String text = "This is a sample page";

	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");

	}

	@Test(description = "verify form Demo work successfully.")
	public void Frame() throws Exception {

		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("abcdef");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abcdef");

		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("abcdef");

		WebElement paddress = driver.findElement(By.id("permanentAddress"));
		paddress.sendKeys("abcdef");

		driver.findElement(By.id("submit")).submit();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}