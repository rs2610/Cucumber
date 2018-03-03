package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Search extends WebConnect{

	
	@Given("^I am on Argos Home Page$")
	public void i_am_on_Argos_Home_Page() throws Throwable {
	    driver.get(baseUrl);
	    Thread.sleep(2000);
	}   
	@When("^I enter \"([^\"]*)\" in search field$")
    public void i_enter_in_search_field(String product) throws Throwable {
		driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys(product);
	    Thread.sleep(2000);
}
	@And("^I click on  searchButton$")
	public void i_click_on_searchButton() throws Throwable {
	driver.findElement(By.xpath("//button[@class='argos-header__search-button']")).click();
	 Thread.sleep(3000);     
	 System.out.println("Seeing the results");
	}
		}

	

