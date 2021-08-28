package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookadahotel extends Baseclass {
public Bookadahotel() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement firstname;

@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement billingAddress;
@FindBy(id="cc_num")
private WebElement ccno;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement expirydatemonth;
@FindBy(id="cc_exp_year")
private WebElement expirydateyear;

@FindBy(id="cc_cvv")
private WebElement cvvnumber;
@FindBy(id="book_now")
private WebElement booknowbtn;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getBillingAddress() {
	return billingAddress;
}
public WebElement getCcno() {
	return ccno;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getExpirydatemonth() {
	return expirydatemonth;
}
public WebElement getExpirydateyear() {
	return expirydateyear;
}
public WebElement getCvvnumber() {
	return cvvnumber;
}
public WebElement getBooknowbtn() {
	return booknowbtn;
}




}
