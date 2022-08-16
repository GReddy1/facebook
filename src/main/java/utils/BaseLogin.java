package utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {

	public ChromeDriver driver;
	
	
	
	@Test
	
	public ChromeDriver webSetup() throws IOException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Properties pp = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\TestFaceBook\\src\\test\\java\\data.properties");
		
		pp.load(fis);
		
		String url = pp.getProperty("url");
		driver.get(url);
		
		
		

		
		
		
		
		
		
		return driver;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
