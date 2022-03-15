package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DynamicProperties {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/dynamic-properties");
		Actions action = new Actions(driver);

		Thread.sleep(6);

		WebElement enableButton = driver.findElement(By.id("enableAfter"));

		String bckgclrBefore = driver.findElement(By.id("enableAfter")).getCssValue("background-color");

		System.out.println(bckgclrBefore);

		boolean enable = enableButton.isEnabled();

		if (enableButton.isEnabled()) {
			enableButton.click();
			System.out.println("click");

		}

		String bckgclrAfter = driver.findElement(By.id("enableAfter")).getCssValue("background-color");

		System.out.println(bckgclrAfter);

		String colr = driver.findElement(By.id("colorChange")).getCssValue("color");

		Thread.sleep(6);

		System.out.println(colr);

		Thread.sleep(6);

		WebElement visibleButton = driver.findElement(By.id("visibleAfter"));

		boolean visible = visibleButton.isDisplayed();
		
		Assert.assertFalse(visible);
		
		if (visibleButton.isDisplayed()) {
			visibleButton.click();
			System.out.println("click");
		} 

	}

}
