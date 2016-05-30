package com.cucumber.MavenCucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^: This is my first step$")
	public void first_step() throws Throwable {
	    System.out.println("Inside first step");
	}

	@When("^: This is my second step$")
	public void second_step() throws Throwable {
		System.out.println("Inside second step");
	}

	@Then("^: This is my third step$")
	public void third_step() throws Throwable {
		System.out.println("Inside third step");
	}

	
}
