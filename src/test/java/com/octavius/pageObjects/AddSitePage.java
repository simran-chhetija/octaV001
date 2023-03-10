package com.octavius.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddSitePage {
	WebDriver ldriver;

	public AddSitePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/main/div/div/div/div/div[1]/a")  
	@CacheLookup
	WebElement clickAddSiteButton;

	@FindBy(id="Name")
	@CacheLookup
	WebElement siteName;

	@FindBy(id="Postcode")
	@CacheLookup
	WebElement sitePostCode;

	@FindBy(id="ProjectNumber")
	@CacheLookup
	WebElement siteProjectNumber;

//	@FindBy(xpath="//*[@id=\"AddUpdateSiteFrm\"]/div[1]/div[4]/div/span[1]/span[1]/span")
//	@CacheLookup
//	WebElement siteSupervisorDropDown;
	Select drpSupervisor = new Select(ldriver.findElement(By.xpath("//*[@id=\"AddUpdateSiteFrm\"]/div[1]/div[4]/div/span[1]/span[1]/span")));

	@FindBy(id="SiteDescription")
	@CacheLookup
	WebElement siteDescription;

	@FindBy(xpath="//*[@id=\"AddUpdateSiteFrm\"]/div[2]/div/div/button")
	@CacheLookup
	WebElement saveAddSiteButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[7]/div/button")
	@CacheLookup
	WebElement ClickOkayButton;

	public void ClickOnAddSite() {
		clickAddSiteButton.click();
	}

	public void EnterSiteName(String sname) {
		siteName.sendKeys(sname);
	}

	public void EnterSitePostCode(String Pno) {
		sitePostCode.sendKeys(String.valueOf(Pno));
	}

	public void EnterSiteProjectNumber(String projNo) {
		siteProjectNumber.sendKeys(String.valueOf(projNo));
	}

	public void SelectSiteSupervisor() {
		drpSupervisor.selectByVisibleText("Test");
	}
	
	public void siteDescription(String sdesc) {
		siteDescription.sendKeys(sdesc);
	}
	
	public void clickOnsaveSiteButton() {
		saveAddSiteButton.click();
	}
	public void siteOkayPopUp() {
		ClickOkayButton.click();
	}
}
