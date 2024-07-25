package com.adventures.shrikant;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.adventures.base.Base;
import com.adventures.pages.LandingPage;

public class LandingPageTC extends Base {

	@Test
	public void verifyLogoOnLandingPage() throws InterruptedException {
		LandingPage landingPage = new LandingPage();
		PageFactory.initElements(driver, landingPage);
		Thread.sleep(6000);
		landingPage.clickSearchBtn();
		landingPage.enterInInputBox();

	}

}
