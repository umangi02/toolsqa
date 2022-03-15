package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New { 
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("xyz.d.a@gmail.com");
		driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).click();
		//WebElement title = driver.findElement(By.xpath("page-subheading"));
	     driver.findElement(By.xpath("//label[@for=\"id_gender1\"]")).click();//("//input[@id=\"id_gender1\"]")).click();
		
		//driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
		//driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	
	//	assertEquals(.getText(), "Hello from JavaScript!"); 
		  
		driver.findElement(By.xpath("//a[@title=\"Women\"]")).click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]"));
		firstname.click();//sendKeys("sbhbn dh xb");
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]"));
		lastname.sendKeys("swhh shh xhh");
		WebElement email1 = driver.findElement(By.id("email_create"));
		email1.sendKeys("xyz.d.a@gmail.com");
	//	WebElement password = driver.findElement(By.id("email_create"));
	//	password.sendKeys("");
		WebElement dob = driver.findElement(By.xpath("//select[@id=\"days\"]"));
		dob.click();
		Select day = new Select(driver.findElement(By.xpath("//select[@id=\"days\"]")));
		day.selectByValue("7");
		driver.findElement(By.xpath("//select[@id=\"months\"]")).click();
		Select month = new Select(driver.findElement(By.xpath("//select[@id=\"months\"]")));
		month.selectByValue("2");
		driver.findElement(By.xpath("//select[@id=\"years\"]")).click();
		Select year = new Select(driver.findElement(By.xpath("//select[@id=\"years\"]")));
		year.selectByValue("4");
		driver.findElement(By.xpath("//input[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"optin\"]")).clear();
		WebElement firstname1 = driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
		firstname1.sendKeys("sbhbn dh xb");
		WebElement lastname1 = driver.findElement(By.xpath("//input[@id=\"lastname\"]"));
		lastname1.sendKeys("swhh shh xhh");
		WebElement company = driver.findElement(By.xpath("//input[@id=\"company\"]"));
		company.sendKeys("xyz.d.a@gmail.com");
		WebElement address = driver.findElement(By.xpath("//input[@id=\"address1\"]"));
		address.sendKeys("d-17 shbhjjsuujmnsjn");
		WebElement address1 = driver.findElement(By.xpath("//input[@id=\"address2\"]"));
		address1.sendKeys("d-12 djndnjjejjjd");
		WebElement city = driver.findElement(By.xpath("//input[@id=\"city\"]"));
		city.sendKeys("//input[@id=\"city\"]");
		 driver.findElement(By.xpath("//select[@id=\"days\"]")).click();
	
		Select state = new Select(driver.findElement(By.xpath("//select[@id=\"id_state\"]")));
		state.selectByValue("7");
		WebElement zip = driver.findElement(By.xpath("//input[@id=\"postcode\"]"));
		zip.sendKeys("122345");
		driver.findElement(By.xpath("//select[@id=\"id_country\"]")).click();
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id=\"id_country\"]")));
		country.selectByValue("7");//
		WebElement info = driver.findElement(By.xpath("//textarea[@id=\"other\"]"));
		info.sendKeys("d-12 djndnjjejjjd");
		WebElement homep = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
		homep.sendKeys("1728489499");
		
		WebElement mobilep = driver.findElement(By.xpath("//input[@id=\"phone_mobile\"]"));
		mobilep.sendKeys("1728489499");//input[@id="alias"]
		WebElement alis = driver.findElement(By.xpath("//input[@id=\"alias\"]"));
		alis.sendKeys("1728489499");
		driver.findElement(By.xpath("//span[contains(.,'Register')]")).click();
		
		
		

		
		


}
}