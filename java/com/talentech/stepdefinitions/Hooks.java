package com.talentech.stepdefinitions;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
////
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;


	@Before
	public void setUp() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "Driver2/chromedriver.exe");	
		

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		driver.navigate().to("https://www.usps.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();


	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
