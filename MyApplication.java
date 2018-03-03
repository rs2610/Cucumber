package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class MyApplication extends WebConnect  {
	WebDriver driver;
	
	@Given("^I am on Argos Home page$")
	public void i_am_on_Argos_Home_page() throws Throwable {
	    driver = new ChromeDriver();
	//	System.setProperty("webdriver.chrome.driver", "../CucumberSelf/src/test/resources/driverFiles/chromedriver.exe");
		//driver.get("https://www.argos.co.uk");
		driver.get(baseUrl);
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String link) throws Throwable {
	driver.findElement(By.linkText(link)).click();
	System.out.println("Happy - it worked");
	}
	
		@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String title) throws Throwable {
    // assertTrue(driver.getTitle().contains(title));
	Assert.assertEquals(title, driver.getTitle());
		System.out.println("successful finally222 ");
		Thread.sleep(2000);

	}


	}


