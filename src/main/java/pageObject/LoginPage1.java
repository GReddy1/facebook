package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1 {

	
	public ChromeDriver driver;
	
	private By username = By.id("email");
	
	
	private  By password = By.name("pass");
	
	private By login = By.xpath("//*[text()='Log In']");
	
	
	
	
	public LoginPage1(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	
	
	public WebElement getuserName() {

		return driver.findElement(username);
		
	}
		
		
		
		
public WebElement getpassword() {
return driver.findElement(password);
}
	
	
public WebElement loginclick() {
return driver.findElement(login);
}
	
	
	
	
	
	
	
	
	
	
}
