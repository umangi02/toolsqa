package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {
	/*
	 * public static void main (String[] args) throws InterruptedException {
	 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.navigate().to("https://demoqa.com/upload-download"); WebElement
	 * download = driver.findElement(By.id("downloadButton")); download.click();
	 * WebElement upload_file =
	 * driver.findElement(By.xpath("//input[@type=\"file\"]"));
	 * 
	 * upload_file.sendKeys("‪C:\\Users\\HP\\sampleFile.jpeg"); Thread.sleep(2000);
	 * 
	 * }
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/image_upload/");

		WebElement upload_file = driver.findElement(By.xpath("//input[@id=\"photoimg\"]"));
		upload_file.click();
		System.out.println("Click on Choosen File");
		upload_file.sendKeys("‪C:\\Users\\HP\\sampleFile.jpeg");
		Thread.sleep(2000);

	}
}