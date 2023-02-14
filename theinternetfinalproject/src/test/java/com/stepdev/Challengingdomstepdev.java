package com.stepdev;

import org.openqa.selenium.WebDriver;

import action.Theinternetaction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Challengingdomstepdev   {
	WebDriver driver;
	Theinternetaction ovj = new Theinternetaction();
	
	@Given("user able to open the internet homepage")
	public void user_able_to_open_the_internet_homepage() {
	    ovj.getinternet();
	}

	@When("user able to  click challenging dom")
	public void user_able_to_click_challenging_dom() {
		ovj.challengingdom();
	    
	}

	@Then("able click green button")
	public void able_click_green_button() {
		ovj.challengingdom();
	    
	}
	
	

}
