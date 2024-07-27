package com.adventures.pages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.adventures.base.Base;

public class ProductDetailsPage extends Base {
	@FindBy(xpath = "//div[@class=\"SpeakersImg categoryCell\"]")
	WebElement speaker;
	@FindBy(xpath = "//img[@class=\"imgProduct\"][1]")
	WebElement bluetoothSpeaker;
	@FindBy(xpath = "//button[@name=\"save_to_cart\"]")
	WebElement addToCart;
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement userName;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	@FindBy(xpath = "//button[@id=\"sign_in_btn\"]")
	WebElement signIn;
	@FindBy(xpath = "//div[@class=\"cell categoryRight\"]/descendant::a[@class=\"productName ng-binding\"]")
	List<WebElement> listOfProducts;
	@FindBy(xpath = "//a[@id=\"menuUserLink\"]")
	WebElement userBtn;
	@FindBy(xpath = "//label[@class=\"roboto-light ng-scope\"][1]")
	WebElement cartText;
	@FindBy(xpath = "//li[@data-ng-mouseenter=\"enterCart()\"]")
	WebElement enterCartBtn;
	@FindBy(xpath = "//*[@id=\"productProperties\"]/label")
	WebElement text;

	public void enterUserName(String user) {
		userName.sendKeys(user);
	}

	public void enterPass(String pass) {
		password.sendKeys(pass);
	}

	public void clickSiginIn() {
		signIn.click();
	}

	public List<WebElement> getListOfProduct() {
		return listOfProducts;

	}

	public void clickUserBtn() {
		userBtn.click();
	}

	public void clickOnSpeaker() {
		speaker.click();
	}

	public void clickOnBluetoothSpeaker() {
		bluetoothSpeaker.click();

	}

	public void clickOnAddToCart() {

		
		addToCart.click();
	}

	public String getAddToCartText() {
		return cartText.getText();
	}

	public void clickOnEntercartBtn() {
		enterCartBtn.click();
	}

	public String outOfStockText() {

		return text.getText();
	}
}
