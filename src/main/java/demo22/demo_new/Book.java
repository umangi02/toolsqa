package demo22.demo_new;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public interface Book {
	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/login");
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("abcdef");
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("Abcdef@12");
		driver.findElement(By.id("login")).click();
		//driver.findElement(By.id("gotoStore")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@id=\"gotoStore\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Go To Book Store')]")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.linkText("Git Pocket Guide")).click();
	
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Add To Your Collection')]")).click();
		Thread.sleep(2000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		driver.findElement(By.xpath("//button[contains(.,'Back To Book Store')]")).click();
		Thread.sleep(2000);
		
		driver.navigate().to("https://demoqa.com/profile");
		WebElement search = driver.findElement(By.id("searchBox"));
		search.sendKeys("Git");
		WebElement title =driver.findElement(By.linkText("Git Pocket Guide"));
		
		 
		
		
		Assert.assertEquals(title.getText(), "Git Pocket Guide");
		
		  
		
		
		driver.findElement(By.xpath("//span[@title=\"Delete\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(.,'Cancel')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title=\"Delete\"]")).click();
		driver.findElement(By.xpath("//button[contains(.,'OK')]")).click();

	
		
		Thread.sleep(2000);
		Alert simpleAlert1 = driver.switchTo().alert();
		simpleAlert1.accept();
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Log out')]")).click();
		WebElement label = driver.findElement(By.className("main-header"));
		Assert.assertEquals(label.getText(), "Login");
		driver.quit();
	}

}