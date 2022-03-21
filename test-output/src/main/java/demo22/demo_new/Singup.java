package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://app.testproject.io/signup/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xyz.n.s@gmail.com");
		driver.findElement(By.className("tp-submit-wrapper")).click();
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("hza shn xnnnx");
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("hza shn xnnnx");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("bhdjdjkd");
		password.clear();
		password.sendKeys("Hargjfjn");
		password.clear();
		password.sendKeys("Haefb123 4");
		password.clear();
		password.sendKeys("Hssedf12344777");
		driver.findElement(By.xpath("//span[@class=\"tp-checkbox-input-view\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"g-recaptcha-check\"]/following::div[1]")).click();
		
	}
}
