package com.adventure.smita;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import com.adventures.base.Base;
import com.adventures.keyword.Locators;
import com.adventures.pages.CreateNewAccountPage;
import com.adventures.utilities.Config;

public class CreateNew_Account_TC extends Base {
	Config con = new Config();

	@Test
	public void verifyCreate_New_Account() throws InterruptedException {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		CreateNewAccountPage newAccPage = new CreateNewAccountPage();
		PageFactory.initElements(driver, newAccPage);
		
		newAccPage.clickUserIconBtn();
        Thread.sleep(6000);
		//wait.until(ExpectedConditions.elementToBeClickable(newAccPage.clickCreateNewAccountLink())).click();
		newAccPage.clickCreateNewAccountLink().click();
		Thread.sleep(6000);
		newAccPage.enterUserName(con.getUserId());
		newAccPage.enterEmail(con.getUserEmail());
		newAccPage.enterConfirmPass(con.getUserPass());
		newAccPage.enterFName(Locators.FNAME);
		newAccPage.enterLName(Locators.LNAME);
		newAccPage.enterPhone(Locators.PHONE);
		newAccPage.enterCountry(Locators.COUNTRY);
		newAccPage.enterCity(Locators.CITY);
		newAccPage.enterAddress(Locators.ADDRESS);
		newAccPage.enterState(Locators.STATE);
		newAccPage.enterPincode(Locators.PINCODE);
		newAccPage.clickCheckbox();
		newAccPage.clickReg_Btn();

	}

}
