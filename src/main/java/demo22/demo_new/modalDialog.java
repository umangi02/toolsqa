package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class modalDialog {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/modal-dialogs");
		
		driver.findElement(By.id("showSmallModal")).click();

		WebElement textSmallModal = driver.findElement(By.id("example-modal-sizes-title-sm"));

		Assert.assertTrue(textSmallModal.isDisplayed(), "Small Modal text not displayed");

		driver.findElement(By.className("close-fixedban")).click();

		driver.findElement(By.id("showLargeModal")).click();

		WebElement textLargeModal = driver.findElement(By.id("example-modal-sizes-title-lg"));

		Assert.assertTrue(textLargeModal.isDisplayed(), "Large Modal text not displayed");

		driver.findElement(By.xpath("//span[contains(.,'Close')]")).click();

	}
}
