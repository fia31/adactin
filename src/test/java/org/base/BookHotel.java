package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Methods{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement ccty;
	
	@FindBy(id="cc_exp_month")
	private WebElement mon;
	
	@FindBy(id="cc_exp_year")
	private WebElement cey;
	
	@FindBy(id="cc_cvv")
	private WebElement cv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	public WebElement getBook() {
		return book;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCcty() {
		return ccty;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getCey() {
		return cey;
	}

	public WebElement getCv() {
		return cv;
	}
	
	
}
