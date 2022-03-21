package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTabel {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/webtables");

		driver.findElement(By.id("addNewRecordButton")).click();

		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("abc");

		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("def");

		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("abc@def.com");

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("21");

		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("210000");

		WebElement department = driver.findElement(By.id("department"));
		department.sendKeys("IT");

		driver.findElement(By.id("submit")).click();

		WebElement searchBox = driver.findElement(By.id("searchBox"));
		searchBox.sendKeys("abc");

	}
}