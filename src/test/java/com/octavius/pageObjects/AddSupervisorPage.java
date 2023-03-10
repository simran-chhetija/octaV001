package com.octavius.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddSupervisorPage {
	WebDriver ldriver;

	public AddSupervisorPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/aside/ul/li[2]/a")
	@CacheLookup
	WebElement ManageSupervisor;
	
	@FindBy(how = How.XPATH, using = "/html/body/main/div/div/div/div/div[1]/a")
	@CacheLookup
	WebElement AddSuprvisor;
	
	@FindBy(how = How.ID, using = "Name")
	@CacheLookup
	WebElement SupervisorName;

	@FindBy(how = How.ID, using = "Email")
	@CacheLookup
	WebElement SupervisorEmail;

	@FindBy(how = How.ID, using = "RoleDuty")
	@CacheLookup
	WebElement SupervisorRole;

	@FindBy(how = How.ID, using = "Company")
	@CacheLookup
	WebElement SupervisorCompany;

	@FindBy(how = How.XPATH, using = "//*[@id=\"AddUpdateFrm\"]/div[2]/div/div/button") 
	WebElement ClickOnSaveButton;
	
	@FindBy(how = How.CLASS_NAME, using = "confirm") 
	@CacheLookup
	WebElement ClickonOkayButton;
	
	public void ClickOnManageSupervisor() {
		ManageSupervisor.click();
	}
	
	public void ClickOnAddedSupervisor() {
		AddSuprvisor.click();
	}
	
	public void supName(String svName) {
		SupervisorName.sendKeys(svName);
	}
	
	public void supEmail(String svEmail) {
		SupervisorEmail.sendKeys(svEmail);
	}
	
	public void supRole(String svRole) {
		SupervisorRole.sendKeys(svRole);
	}
	
	public void supCompany(String svCompany) {
		SupervisorCompany.sendKeys(svCompany);
	}
	
	public void supSave() {
		ClickOnSaveButton.click();
	}
	
	public void supOkayPopUp() {
		ClickonOkayButton.click();
	}
	
	/* To convert string to int
	 *public void pinNo(String Pno) {
	 *tctpinNo.sendKeys(String.valueOf(Pno));
	 *}
	 */ 

}
