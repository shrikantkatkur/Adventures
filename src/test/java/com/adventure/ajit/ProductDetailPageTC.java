package com.adventure.ajit;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adventures.base.Base;
import com.adventures.keyword.Keyword;
import com.adventures.pages.LandingPage;
import com.adventures.pages.ProductDetailsPage;
import com.adventures.utilities.Config;

public class ProductDetailPageTC extends Base {

	@Test
	public void verifyNunberOfProduct() throws InterruptedException {
		ProductDetailsPage Page = new ProductDetailsPage();
		Config conf = new Config();
		PageFactory.initElements(driver, Page);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Page.clickUserBtn();
		Page.enterUserName(conf.getuserName());
		Page.enterPass(conf.getpassword());
		Page.clickSiginIn();

	}

}
