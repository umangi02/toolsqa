package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/selectable");

		driver.findElement(By.id("demo-tab-list"));

		driver.findElement(By.xpath("//li[contains(.,'Cras justo odio')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Dapibus ac facilisis in')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Morbi leo risus')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Porta ac consectetur ac')]")).click();

		driver.findElement(By.id("demo-tab-grid"));

		driver.findElement(By.xpath("//li[contains(.,'One')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Two')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Three')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Four')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Five')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Six')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Seven')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Eight')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Nine')]")).click();

	}
}