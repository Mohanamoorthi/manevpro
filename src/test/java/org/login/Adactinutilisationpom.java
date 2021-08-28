package org.login;

import java.io.IOException;

public class Adactinutilisationpom extends Baseclass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		launchUrl("http://adactinhotelapp.com/");
		AdactinLoginpage a = new AdactinLoginpage();
		enterText(a.getUsername(), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 0));
		enterText(a.getPassword(), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 1));
		btnclick(a.getLogin());
		
		Adactinsearch b = new Adactinsearch();
		selectionByIndex(b.getLocation(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 2)));
		selectionByIndex(b.getHotels(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 3)));
		selectionByIndex(b.getRoomtype(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 4)));
		selectionByIndex(b.getNoofrooms(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 5)));
		enterText(b.getCheckindate(),excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 6));
		enterText(b.getCheckoutdate(), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 7));
		selectionByIndex(b.getAdultsperroom(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 8)));
		selectionByIndex(b.getChildrenperroom(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 9)));
		btnclick(b.getSearchbutton());
		
		Selectadactinhotel c = new Selectadactinhotel();
		btnclick(c.getSelectbutton());
		btnclick(c.getContinuebutton());
		
		Bookadahotel d =new Bookadahotel();
		enterText(d.getFirstname(),excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 10));
		enterText(d.getLastname(), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 11));
		enterText(d.getBillingAddress(), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 12));
		enterText(d.getCcno(),excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 13));
		selectionByIndex(d.getCctype(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 14)));
		selectionByIndex(d.getExpirydatemonth(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 15)));
		selectionByIndex(d.getExpirydateyear(), Integer.parseInt(excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 16)));
		enterText(d.getCvvnumber(), excelRead("D:\\Greens\\adatin.xlsx", "Sheet1", 0, 17));
		btnclick(d.getBooknowbtn());
		
		 Thread.sleep(6000);
			
			excelWrite("D:\\Greens\\adatin2.xlsx", "abcd", 0, 0, elementlocatorByXpath("//input[@id='order_no']").getAttribute("value"));
	}

}
