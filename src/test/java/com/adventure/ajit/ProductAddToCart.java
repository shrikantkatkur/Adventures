package com.adventure.ajit;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adventures.base.Base;
import com.adventures.pages.ProductDetailsPage;
import com.adventures.utilities.Config;

public class ProductAddToCart extends Base {
	Config conf = new Config();
	ProductDetailsPage page = new ProductDetailsPage();

	@Test
	public void verifyTheNumberOfProductToTheCart() throws InterruptedException {
		String expectedText = "Oops! We only have 10 in stock. We updated your order accordingly";
		int productLimit = 0;
		PageFactory.initElements(driver, page);
		page.clickUserBtn();
		page.enterUserName(conf.getuserName());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		page.enterPass(conf.getpassword());
		page.clickSiginIn();
		page.clickOnSpeaker();
		page.clickOnBluetoothSpeaker();

		for (int i = 1; i <= 11; i++) {
			page.clickOnAddToCart();
			Thread.sleep(3000);
			String actualText = page.outOfStockText();
			System.out.println(actualText);
			if (actualText.equals(expectedText)) {
				System.out.println("Stock limit reached. Only 10 items were added to the cart.");
				break; // Exit loop once limit message is seen
			}
			productLimit++;
		}
		System.out.println("Total products added to cart: " + productLimit);
	}

}
