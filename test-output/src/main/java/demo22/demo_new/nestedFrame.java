package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/nestedframes");

		int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames on a Page:" + countIframesInPage);

		WebElement frame1 = driver.findElement(By.id("frame1"));

		driver.switchTo().frame(frame1);

		WebElement frame1Element = driver.findElement(By.tagName("body"));

		String frame1Text = frame1Element.getText();
		System.out.println("Frame1 is :" + frame1Text);

		int countIframesInFrame1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);

		driver.switchTo().frame(0);

		int countIframesInFrame2 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);

		driver.close();
	}
}
