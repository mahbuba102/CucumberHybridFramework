package com.talentech.stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.cigna.reporterutils.ExtentReportListner;
import com.talentech.pageactions.LoginPageActions;
import com.talentech.pages.LoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LoginStepDef extends ExtentReportListner {

	
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
	
	@When("Customer clicks SignIn link on the top of hompage")
	public void customer_clicks_Register_SignIn_link_on_the_top_of_hompage() throws Throwable {
		
		ExtentTest logInfo = null;
		test = extent.createTest(Feature.class,"Login Feature");
		test = test.createNode(Scenario.class,"Successful login with valid username and password");
		
		try{
		logInfo = test.createNode(new GherkinKeyword("When"), "Customer clicks SignIn link on the top of hompage");
		
		loginpageaction.clickLoginlink();
		
		logInfo.pass("User clicked the sign in link ");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Login link click fail");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			testStepHandle("FAIL", Hooks.driver, logInfo, e);
			
		}
	}
	
	
	@When("^Customer enters  \"([^\"]*)\" and Customer enters \"([^\"]*)\"$")
	public void customer_enters_and_Customer_enters(String username, String password)  {
		
		System.out.println("username : " + username + "password : " + password);
		
		loginpageaction.sendUserName(username);
		loginpageaction.sendPassword(password);
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
	
	
//	@When("Customer enters  {string} and Customer enters {string}")
//	public void customer_enters_and_Customer_enters(String username,String password) {
//		
//		System.out.println("username : " + username + "password : " + password);
//		
//		loginpageaction.sendUserName(username);
//		loginpageaction.sendPassword(password);
//	}
	@When("^Customer clicks sign in$")
	public void customer_clicks_sign_in() throws InterruptedException {
		
		loginpageaction.clickSigninBtn();
	}

	@Then("^Homepage should be shown$")
	public void homepage_should_be_shown() {

		System.out.println("Pass");  
	}
	
}
