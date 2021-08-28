package org.login;

import java.io.IOException;

public class Adactionutilisation extends Baseclass{
	public static void main(String[] args) throws Exception {
		launchUrl("http://adactinhotelapp.com/");
		enterText(elementlocatorById("username"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 0));
	
		enterText(elementlocatorById("password"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 1));
		
		btnclick(elementlocatorById("login"));
		selectionByIndex(elementlocatorById("location"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 2)));
	selectionByIndex(elementlocatorById("hotels"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 3)));
		
	selectionByIndex(elementlocatorById("room_type"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 4)));
		
	selectionByIndex(elementlocatorById("room_nos"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 5)));
	enterText(elementlocatorById("datepick_in"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 6));
	enterText(elementlocatorById("datepick_out"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 7));
	selectionByIndex(elementlocatorById("adult_room"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 8)));	
	selectionByIndex(elementlocatorById("child_room"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 9)));	
		
		btnclick(elementlocatorById("Submit"));
		btnclick(elementlocatorById("radiobutton_0"));
		btnclick(elementlocatorById("continue"));
		
		enterText(elementlocatorById("first_name"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 10));	
		
		enterText(elementlocatorById("last_name"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 11));
		
		enterText(elementlocatorById("address"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 12));
		enterText(elementlocatorById("cc_num"), excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 13));
		selectionByIndex(elementlocatorById("cc_type"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 14)));
		selectionByIndex(elementlocatorById("cc_exp_month"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 15)));
		selectionByIndex(elementlocatorById("cc_exp_year"), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", 	"Sheet1", 0, 16)));
		enterText(elementlocatorById("cc_cvv"), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 17));
		btnclick(elementlocatorById("book_now"));
	 Thread.sleep(6000);
	
		excelWrite("D:\\Greens\\adatin2.xlsx", "abcd", 0, 0, elementlocatorByXpath("//input[@id='order_no']").getAttribute("value"));
	
	}

}
