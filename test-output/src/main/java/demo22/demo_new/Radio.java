package demo22.demo_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Radio {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//label[@for=\"yesRadio\"]")).click();
     	WebElement imp = driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]"));
		boolean selectState = imp.isSelected();
	//	if (selectState == true) {
		if(imp.isSelected()) {
			imp.clear();
		}
		else {
			imp.click();
		}
		WebElement t = driver.findElement(By.className("text-success"));
		String j = t.getText();
		System.out.println(j);
		WebElement no = driver.findElement(By.id("noRadio"));
		boolean selectState1 = no.isEnabled();
		if (selectState1== true) {
			no.clear();
		}
		else {
			no.click();
		}
	driver.close();
		
	}

}
