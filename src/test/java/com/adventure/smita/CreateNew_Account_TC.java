package com.adventure.smita;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.adventures.base.Base;
import com.adventures.keyword.Locators;
import com.adventures.pages.CreateNewAccountPage;
import com.adventures.utilities.Config;

public class CreateNew_Account_TC extends Base {
	Config con = new Config();

	@Test
	public void verifyCreate_New_Account() throws InterruptedException {
		CreateNewAccountPage newAccPage = new CreateNewAccountPage();
		PageFactory.initElements(driver, newAccPage);

		newAccPage.clickUserIconBtn();
		newAccPage.clickCreateNewAccountLink();
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
