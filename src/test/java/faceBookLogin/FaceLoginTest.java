package faceBookLogin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.LoginPage1;
import pageObject.Serach;
import utils.BaseLogin;

public class FaceLoginTest {

	ChromeDriver driver;
	
	
	
	
	@Test(priority=1)
	public void userDetails() throws IOException, InterruptedException {

		
		
		
		
        Properties pp = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\TestFaceBook\\src\\test\\java\\data.properties");
		
		pp.load(fis);
		
		String user = pp.getProperty("username");
		String pass = pp.getProperty("password");
		
	
		
		BaseLogin bb = new BaseLogin();
		
		driver = bb.webSetup();
		
		LoginPage1 lp = new LoginPage1(driver);
		lp.getuserName().sendKeys(user);
		lp.getpassword().sendKeys(pass);
		lp.loginclick().click();
		
		Thread.sleep(5000);
		}
	
	
	@Test(priority=2)
	public void forgot() throws InterruptedException {

		Serach sc = new Serach(driver);
		sc.forgotpass().click();
		Thread.sleep(5000);
	}

	
	@Test(priority=3)
public void submit() {
		Serach sc = new Serach(driver);
		sc.getuser().sendKeys("gasatyasantosh@gmail.com");
		sc.getsubmit().click();
		
	}
	
	
	
	
	
	
	
}
