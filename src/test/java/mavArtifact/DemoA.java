package mavArtifact;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA 
{
	
	@Test
	public void testA() throws MalformedURLException
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
		System.out.println("Hello ");
		//driver.get("http://www.facebook.com");
		
	}

}
