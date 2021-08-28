package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectadactinhotel extends Baseclass {
	public Selectadactinhotel() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectbutton;
@FindBy(id="continue")
private WebElement continuebutton;
public WebElement getSelectbutton() {
	return selectbutton;
}
public WebElement getContinuebutton() {
	return continuebutton;
}	
}
