package com.adventure.ajit;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.adventures.base.Base;
import com.adventures.pages.ProductDetailsPage;
import com.adventures.utilities.AdvantageExcelUtil;




public class ProductDetailPageTC extends Base {
	@Test(dataProvider = "SignData", dataProviderClass = AdvantageExcelUtil.class)
	public void verifySignIn_TC(String id, String pass) throws InterruptedException {
		ProductDetailsPage Page = new ProductDetailsPage();
		PageFactory.initElements(driver, Page);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Page.clickUserBtn();
		Page.enterUserName(id);
		Page.enterPass(pass);
		Page.clickSiginIn();

	}

}
