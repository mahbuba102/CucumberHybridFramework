package com.talentech.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.talentech.pages.LoginPage;
import com.talentech.stepdefinitions.Hooks;

public class LoginPageActions {
	
	
	LoginPage loginpage;
	
	
	public LoginPageActions(){
		
		loginpage = new LoginPage();
		PageFactory.initElements(Hooks.driver, loginpage);
	}
	
	
	
	public void clickLoginlink(){

		loginpage.loginlink.click();
	}

	

	public void sendUserName(String user) {

		loginpage.username.sendKeys(user);

	}
	
	public void sendPassword(String password) {

		loginpage.passwd.sendKeys(password);

	}

	
	public void clickSigninBtn() {

		loginpage.signIn.click();

	}


}
