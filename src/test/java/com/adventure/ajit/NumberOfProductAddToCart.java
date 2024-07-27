package com.adventure.ajit;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adventures.base.Base;
import com.adventures.pages.ProductDetailsPage;
import com.adventures.utilities.Config;

public class NumberOfProductAddToCart extends Base {
	Config conf = new Config();
	ProductDetailsPage page = new ProductDetailsPage();

	@Test
	public void verifyTheNumberOfProductToTheCart() throws InterruptedException {
		String expectedText = "Oops! We only have 10 in stock. We updated your order accordingly";
		int ProductLimt = 0;
		PageFactory.initElements(driver, page);
		page.clickUserBtn();
		page.enterUserName(conf.getuserName());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		page.enterPass(conf.getpassword());
		page.clickSiginIn();
		page.clickOnSpeaker();
		page.clickOnBluetoothSpeaker();
		
		for (int i = 1; i < 12; i++) {
			String textt = page.outOfStockText();
			if (expectedText != textt) {
				page.clickOnAddToCart();
				Thread.sleep(1000);
				ProductLimt++;
			} else {
				System.out.println("Add only 10 ");
			}
		}
		System.out.println(ProductLimt);
	}
}
