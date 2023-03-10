package com.octavius.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.octavius.pageObjects.AddSupervisorPage;
import com.octavius.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddSupervisorTest_003 extends BaseClass {

	@Test
	public void AddNewSupervisor() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setEmailAddress(emailAddress);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddSupervisorPage addsup = new AddSupervisorPage(driver);
		
		addsup.ClickOnManageSupervisor();
		addsup.ClickOnAddedSupervisor();
		
		addsup.supName("Simran Chhetija");
		
		String emailAddress = randomstring()+"@yopmail.com";
		addsup.supEmail(emailAddress);
		
		addsup.supRole("Supervisor");
		addsup.supCompany("DS Technologies");
		Thread.sleep(3000);
		addsup.supSave();
		System.out.println("c");
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Supervisor added successfully!");
		if(res == true)
		{
			Assert.assertTrue(true);
			System.out.println("d");
		}
		else
		{
			System.out.println("e");
			captureScreen(driver, "AddNewSupervisor");
			Assert.assertTrue(false);
			
		}
		System.out.println("f");
		addsup.supOkayPopUp();
	}
	public String randomstring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
//	GenerateRandomNumbers
//	public String randomNum()
//	{
//		String generatedString2 = RandomStringUtils.randomNumeric(10);
//		return(generatedString2);
//	}
}
