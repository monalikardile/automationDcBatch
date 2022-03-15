package configurations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testProject.Configurations;

public class PathConfig {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement btn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	
	btn.click();

	Alert alt = driver.switchTo().alert();
	alt.getText();  //get text on popup
	alt.accept();  //Click on OK
;	}

}
