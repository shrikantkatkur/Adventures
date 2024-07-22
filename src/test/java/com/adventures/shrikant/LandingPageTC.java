package com.adventures.shrikant;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adventures.base.Base;
import com.adventures.keyword.Keyword;
import com.adventures.pages.LandingPage;

public class LandingPageTC extends Base {
	Keyword keyword=new Keyword();
	LandingPage landingPage=new LandingPage();
	@Test
	public void verifyLogoOnLandingPage() throws InterruptedException {
		//landingPage.clickSearchBtn();
		//landingPage.enterInInputBox();
	
	//	String s= Base.driver.findElement(By.xpath("//div[@class=\"logo\"]")).getText();
	//	System.out.println(s);
		String act=landingPage.getTextOfLogo();
		System.out.println(act);
	}

}
