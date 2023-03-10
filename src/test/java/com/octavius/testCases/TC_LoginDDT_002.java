package com.octavius.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.octavius.pageObjects.LoginPage;
import com.octavius.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider="LoginData")
	public void loginDDT(String email,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmailAddress(email);
		logger.info("Email address provided");
		lp.setPassword(pwd);
		logger.info("Password provided");
		lp.clickSubmit();
		System.out.println("Test6");


		Thread.sleep(3000);
		lp.navBar();
		Thread.sleep(3000);
		lp.clickLogout();
//
//		if(isValidCredential == false){
//			lp.setEmailAddress(email);
//			logger.info("Email address provided");
//			lp.setPassword(pwd);
//			logger.info("Password provided");
//			lp.clickSubmit();
//			System.out.println("Test16");
//
//			Thread.sleep(3000);
//			lp.navBar();
//			Thread.sleep(3000);
//			lp.clickLogout();
//		} else {
//			lp.clearEmail();
//			lp.clearPassword();
//			lp.setEmailAddress(email);
//			logger.info("Email address provided");
//			lp.setPassword(pwd);
//			logger.info("Password provided");
//			lp.clickSubmit();
//			System.out.println("Test10");
//
//		}
//	}
}

@DataProvider(name="LoginData")
String [][] getData() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/test/java/com/octavius/testData/LoginData.xlsx";

	int rownum=XLUtils.getRowCount(path, "Sheet1");
	int colcount=XLUtils.getCellCount(path,"Sheet1",1);

	String logindata[][]=new String[rownum][colcount];

	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
		}
	}
	System.out.println("Test8");
	return logindata;
}
}
