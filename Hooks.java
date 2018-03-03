package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends WebConnect{

	@Before
	public void openBrowser()throws Exception {

	    	if (browserType.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "../CucumberSelf/src/test/resources/driverFiles/chromedriver.exe");
				driver = new ChromeDriver();			
		}else if (browserType.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "../CucumberSelf/src/test/resources/driverFiles/geckodriver.exe");
			driver = new FirefoxDriver();		
		}
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	     @After
	    public void closeBrowser() {
		driver.close();
	}
	
	
	
}
