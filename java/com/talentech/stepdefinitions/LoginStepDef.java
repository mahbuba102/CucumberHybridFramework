package com.talentech.stepdefinitions;

import com.talentech.pageactions.LoginPageActions;
import com.talentech.pages.LoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LoginStepDef {

	
	LoginPageActions loginpageaction = new LoginPageActions();

	@Given("^Customer is on Homepage$")
	public void customer_is_on_Homepage() {

		System.out.println("pass");
	}

	
//	@When("^Customer clicks Register\\SignIn link on the top of hompage$")
//	public void customer_clicks_Register_SignIn_link_on_the_top_of_hompage() {
//		loginpageaction.clickLoginlink();
//	}
//	

	@When("Customer clicks Register\\SignIn link on the top of hompage")
	public void customer_clicks_Register_SignIn_link_on_the_top_of_hompage() throws Throwable {
		
		loginpageaction.clickLoginlink();
	}
	
//	@When("Customer enters username")
//
//	public void customer_enters_username() throws InterruptedException {
//		//System.out.println(username);
//		
//		loginpageaction.sendUserName();
//
//	}
//
//	@When("Customer enters password")
//
//	public void customer_enters_password() throws InterruptedException {
//		
//		//System.out.println(password);
//
//		loginpageaction.sendPassword();
//
//	}
//	
	
	
	@When("Customer enters  {string} and Customer enters {string}")
	public void customer_enters_and_Customer_enters(String username,String password) {
		
		System.out.println("username : " + username + "password : " + password);
		
		loginpageaction.sendUserName(username);
		loginpageaction.sendPassword(password);
	}
	@When("^Customer clicks sign in$")
	public void customer_clicks_sign_in() throws InterruptedException {
		
		loginpageaction.clickSigninBtn();
	}

	@Then("^Homepage should be shown$")
	public void homepage_should_be_shown() {

		System.out.println("Pass");  
	}
	
}
