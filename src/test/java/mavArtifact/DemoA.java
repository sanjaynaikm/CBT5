package mavArtifact;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA 
{
	
	@Test
	public void testA() throws MalformedURLException, InterruptedException
	{
		/*
		URL r = new URL("http://loclahost:4444/wd/hub");
		DesiredCapabilities d = new DesiredCapabilities();
		d.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(r,d);
		driver.quit();
		*/
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flagroot.com");
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(5000);
		System.out.println("Hello");
		System.out.println("I am adding a new line");
		//driver.get("http://www.facebook.com");
		
	}

}
