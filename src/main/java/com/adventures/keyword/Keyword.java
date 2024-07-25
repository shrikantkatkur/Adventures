package com.adventures.keyword;
import org.openqa.selenium.WebElement;
import com.adventures.base.Base;


public class Keyword extends Base {

	public void clickOnElement(WebElement e) {
		e.click();
	}

	public void enterText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public String getText(WebElement e) {
		return e.getText();
	}

	
}
