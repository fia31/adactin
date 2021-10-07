package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Methods{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement select;
	
	@FindBy(id="continue")
	private WebElement conti;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getConti() {
		return conti;
	}
	
	
}
