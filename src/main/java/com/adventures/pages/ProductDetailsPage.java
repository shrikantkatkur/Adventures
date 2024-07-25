package com.adventures.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.adventures.base.Base;

public class ProductDetailsPage extends Base {

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement userName;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	@FindBy(xpath = "//button[@id=\"sign_in_btn\"]")
	WebElement signIn;
	@FindBy(xpath = "//div[@class=\"cell categoryRight\"]/descendant::a[@class=\"productName ng-binding\"]")
	WebElement listOfProducts;
	@FindBy(xpath = "//a[@id=\"menuUserLink\"]")
	WebElement userBtn;

	public void enterUserName(String user) {
		userName.sendKeys(user);
	}

	public void enterPass(String pass) {
		password.sendKeys(pass);
	}

	public void clickSiginIn() {
		signIn.click();
	}

	public String getListOfProduct() {
		return listOfProducts.getText();
	}

	public void clickUserBtn() {
		userBtn.click();
	}

}
