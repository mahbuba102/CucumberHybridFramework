package com.talentech.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.talentech.pages.LoginPage;
import com.talentech.stepdefinitions.Hooks;

public class LoginPageActions2 {
	
	
	LoginPage loginpage;
	
	public LoginPageActions2(){
		
	    loginpage = new LoginPage ();
		PageFactory.initElements(Hooks.driver, loginpage);
		
	}
	
	
	
	
	public void clickLoginLink (){
		
		loginpage.loginlink.click();
		
	}
	
	
	public void sendUsername(){
		
		loginpage.username.sendKeys("MahbubaNimme2020");
		
	}
	
	
	public void sendPassword(){
		
		//
		
	}
	
	
	public void clickSigninBtn(){
		
		//
	}
	
	
	
	
	
	
}
