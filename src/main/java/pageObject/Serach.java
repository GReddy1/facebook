package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Serach {

	public ChromeDriver driver;
	
	private By frogot = By.linkText("Forgotten password?");
	private By user = By.xpath("//input[@type='text']");
	private By submit = By.xpath("//button[@type='submit']");
	
	
	public Serach(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	public WebElement forgotpass() {
return driver.findElement(frogot);
	}

 public WebElement getuser() {
return driver.findElement(user);
}
	
	
	public WebElement getsubmit() {
return driver.findElement(submit);
	}
	
	
	
	
	
	
}
