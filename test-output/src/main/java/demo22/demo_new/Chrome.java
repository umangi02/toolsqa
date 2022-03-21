package demo22.demo_new;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
	//	driver.get("https://demoqa.com/upload-download");
		WebElement firstname = driver.findElement(By.id("firstName"));
		
		
		firstname.sendKeys("umangi");
	/*	firstname.clear();
		firstname.sendKeys("ashoka");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("zala");
		lastname.clear();
		lastname.sendKeys("zala1");
		
		WebElement email = driver.findElement(By.id("userEmail"));
	
		email.sendKeys("umangi.n.zala@gmail.com");
		email.clear();
		email.sendKeys("n.zala@gmail.com");
		
		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
		
		Thread.sleep(2000);
		/*WebElement other_gender = driver.findElement(By.id("gender-radio-3"));
		other_gender.click();
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9909268772");
		mobile.clear();
		mobile.sendKeys("9428776203");
		
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByValue("7");
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByValue("2011");
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']/div[@class=\"react-datepicker__month\"]/div/div[contains(.,'15')]")).click();
		
		
		/*WebElement subject = driver.findElement(By.id("subjectsInput"));
		Thread.sleep(2000);
		subject.sendKeys("hindi");
		subject.sendKeys(Keys.DOWN);
		subject.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2000);
		subject.sendKeys("english");
		subject.sendKeys(Keys.DOWN);
		subject.sendKeys(Keys.TAB);*/
		
		
		//Thread.sleep(2000);
        
		
		
		
		/*driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		
		Thread.sleep(2000);
		*/
		
	//	driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();
	
		WebElement upload_file = driver.findElement(By.xpath("//div[@class='form-file']/input"));		
	
		upload_file.sendKeys("‪C:\\Users\\HP\\sampleFile.jpeg");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("‪C:\\Users\\HP\\Downloads\\sampleFile.jpeg‪");
/*
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("d-206, shfgjx,bxhjxxdd");
	   */

		

		
		

		
		
		//driver.quit(); 
		}

}
