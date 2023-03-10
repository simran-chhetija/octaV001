package com.octavius.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmailAddress;

	@FindBy(id="PasswordHash")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//*[@id=\"LoginFrm\"]/div/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(id="navbarDropdown")
	@CacheLookup
	WebElement navBarclick;
	
	@FindBy(xpath="/html/body/header/div/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setEmailAddress(String emailAddress)
	{
		txtEmailAddress.sendKeys(emailAddress);
	}
	public void clearEmail() 
	{
		txtEmailAddress.clear();
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		//txtPassword.clear();
	}
	
	public void clearPassword() 
	{
		txtPassword.clear();
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void navBar()
	{
		navBarclick.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
