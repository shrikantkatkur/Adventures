package com.adventures.keyword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.adventures.base.Base;

public class Keyword  {
			
	
	public void clickOnElement(WebElement e) {
		e.click();
	}

	public void enterText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public String getText(WebElement e) {
		return e.getText();
	}
	
	public void moveToElement(WebElement element ) {
		Actions act=new Actions(Base.getDriver());
		act.moveToElement(element);
		act.perform();
	}

}
