package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinsearch extends Baseclass {
	
	public Adactinsearch() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")	
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement noofrooms;
@FindBy(id="datepick_in")
private WebElement checkindate;
@FindBy(id="datepick_out")
private WebElement checkoutdate;
@FindBy(id="adult_room")
private WebElement adultsperroom;
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
@FindBy(id="child_room")
private WebElement childrenperroom;
@FindBy(id="Submit")
private WebElement searchbutton;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNoofrooms() {
	return noofrooms;
}
public WebElement getAdultsperroom() {
	return adultsperroom;
}
public WebElement getChildrenperroom() {
	return childrenperroom;
}
public WebElement getSearchbutton() {
	return searchbutton;
}


}
