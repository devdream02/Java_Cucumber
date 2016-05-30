package cucumber.features;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	WebDriver driver = null;
	
	@Before
	public void setup() 
	{
		driver = new FirefoxDriver();
	}
	
	@After
	public void close(){
		driver.close();		
	}

	@Given("^: I am on google homepage$")
	public void homepage() throws Throwable {
		driver.navigate().to("https://www.google.com");	   
	}

	@When("^: I enter the data to be searched$")
	public void dataToBeSearched(DataTable table) throws Throwable {
		
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		
		driver.findElement(By.className("gsfi")).sendKeys("cucumber");
	}

	@When("^: I click on the search button$")
	public void searchButton() throws Throwable {
		driver.findElement(By.name("btnG")).click();
	}

	@Then("^: I should see the result$")
	public void searchResult() throws Throwable {
		Thread.sleep(4000);
	    Assert.assertTrue("Not the desired result", driver.findElement(By.xpath("//div[@id='resultStats']")).isDisplayed());
	}
	
}
