package com.talentech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.talentech.stepdefinitions.Hooks;

public class LoginPage {



	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Register / Sign In')]")
	public WebElement loginlink;

	
	@FindBy(how=How.XPATH,using="//input[@name='username']")
	public WebElement username;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	public WebElement passwd;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Sign In')]")
	public WebElement signIn;


//	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Search or Track Packages')]")
//	public WebElement text;

}
