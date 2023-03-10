package com.octavius.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.octavius.pageObjects.AddSitePage;
import com.octavius.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddSiteTest_004 extends BaseClass{
	
	@Test
	public void AddNewSite() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setEmailAddress(emailAddress);
		lp.setPassword(password);
		lp.clickSubmit();
		System.out.println("a");
		
		Thread.sleep(2000);
		
		AddSitePage addsite1 = new AddSitePage(driver);
		System.out.println("b");
		Thread.sleep(2000);
		addsite1.ClickOnAddSite();
		
		
		addsite1.EnterSiteName("DS Villas");
		addsite1.EnterSitePostCode("123456");
		String projNo = randomNum();
		addsite1.EnterSiteProjectNumber(projNo);
		addsite1.SelectSiteSupervisor();
		addsite1.siteDescription("This is a testing description");
		
		Thread.sleep(3000);
		addsite1.clickOnsaveSiteButton();
		boolean res = driver.getPageSource().contains("Site added successfully!");
		if(res == true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver, "AddNewSite");
			Assert.assertTrue(false);
		}
		addsite1.siteOkayPopUp();
	}
	
	public String randomNum()
	{
		String generatedString2 = RandomStringUtils.randomNumeric(6);
		return(generatedString2);
	}
}

