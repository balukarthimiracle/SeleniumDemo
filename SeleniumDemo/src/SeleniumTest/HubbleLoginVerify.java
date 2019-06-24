package SeleniumTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HubbleLoginVerify {

	public static void main(String[] args) {
		// Create a new instance of the Chrome driver
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
					WebDriver driver;
					driver = new ChromeDriver();
					

					// Maximize the Window
					driver.manage().window().maximize();

					//Launch the Miraclesoft Website
					driver.get("https://www.miraclesoft.com/Hubble/general/login.action");
					
					//Sending Input Values to username and Password Box
					driver.findElement(By.id("userId")).sendKeys("kbalu");
					driver.findElement(By.id("password")).sendKeys("2710$Meow");
					
					//Click Login Button
					driver.findElement(By.id("userLoginForm_0")).submit();
					
					//Verify the login is correct by verifying the Name 
				    Boolean nameDisplayed=	driver.findElement(By.xpath("//a[@class='menuBarLogoutLink']")).isDisplayed();
				    Assert.assertTrue(nameDisplayed);
				    
				   // Close the browser
					driver.close();
					
					// Close the driver
					driver.quit();
			 }	
	}