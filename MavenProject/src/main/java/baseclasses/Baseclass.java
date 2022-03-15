package baseclasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import testProject.Configurations;

public class Baseclass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",Configurations.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configurations.appURL);
		driver.manage().window().maximize();
		
	     //sourcefile
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f = new File ("D:\\software testing\\automation\\screenshot\\image.jpg");
		FileHandler.copy(source, f);
}
