package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Shopping extends WebConnect {

	@When("^I should click on \"([^\"]*)\"$")
	public void i_should_click_on(String link) throws Throwable {
		driver.findElement(By.linkText(link)).click();

	}

	@Then("^I will click on \"([^\"]*)\"$")
	public void i_will_click_on(String arg1) throws Throwable {
		driver.findElement(By.className(arg1)).click();
	}

	@Then("^I should be able to see \"([^\"]*)\"$")
	public void i_should_be_able_to_see(String title) throws Throwable {
		Assert.assertEquals(title, driver.getTitle());
		System.out.print("DONE");
	}

	@When("^I Key \"([^\"]*)\" in search field$")
	public void i_Key_in_search_field(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("Tom Ford Perfume");
		Thread.sleep(2000);
	}

	@And("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
		driver.findElement(By.xpath("//button[@class='argos-header__search-button']")).click();
		Thread.sleep(3000);
		System.out.println("Seeing the results");
	}

	@Then("^I will select \"([^\"]*)\"$")
	public void i_will_select(String arg1) throws Throwable {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll (0,400) ");
		driver.findElement(By.xpath("//*[@href='/product/8100737']")).click();

	}

	@Then("^I put in  my postcode \"([^\"]*)\" in \"([^\"]*)\"$")
	public void i_put_in_my_postcode_in(String postcode, String box) throws Throwable {
		driver.findElement(By.xpath("//input[@class ='form-control form-group__input fulfilment-search']"))
				.sendKeys("HA1 1BD");
		Thread.sleep(2000);
	}

	@Then("^click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[text()='Check']")).click();
		Thread.sleep(2000);
	}

	@Then("^I go and select \"([^\"]*)\"$")
	public void i_go_and_select(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@class ='xs-row fulfilment-action-row collection']/button")).click();
		Thread.sleep(2000);
	}

	@Then("^I go and click on \"([^\"]*)\" on the pop up screen$")
	public void i_go_and_click_on_on_the_pop_up_screen(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
		Thread.sleep(2000);

	}

	@Then("^click on the top header link of \"([^\"]*)\"$")
	public void click_on_the_top_header_link_of(String arg1) throws Throwable {
		driver.findElement(By.className("argos-header__link-label")).click();
		Thread.sleep(2000);
	}

	@Then("^I decide to go and select \"([^\"]*)\" from the Trolley page$")
	public void i_decide_to_go_and_select_from_the_Trolley_page(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value ='Remove']")).click();
		Thread.sleep(2000);
	}

}