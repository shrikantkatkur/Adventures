package com.adventure.ajit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adventures.base.Base;
import com.adventures.pages.ProductDetailsPage;
import com.adventures.utilities.Config;

public class NumberOfProductsDetailsTC extends Base {
	Config conf = new Config();
	int expected = 7;

	@Test
	public void verifyNumberOfProducts() throws InterruptedException {
		ProductDetailsPage pdPage = new ProductDetailsPage();
		PageFactory.initElements(driver, pdPage);
		pdPage.clickUserBtn();
		pdPage.enterUserName(conf.getuserName());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		pdPage.enterPass(conf.getpassword());
		pdPage.clickSiginIn();
		Thread.sleep(6000);
		pdPage.clickOnSpeaker();

		List<WebElement> list = pdPage.getListOfProduct();

		int actual = list.size();
		for (WebElement listOfProduct : list) {
			String productList = listOfProduct.getText();
			System.out.println(productList);

		}
		Assert.assertEquals(expected, actual);

	}

}
