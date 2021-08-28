package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	public static Select s;
	
	
	public static void launchUrl(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Baseclass\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static WebElement elementlocatorById(String id) {
		return driver.findElement(By.id(id));
		
		
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static WebElement elementlocatorByXpath(String Xpath) {
		return driver.findElement(By.xpath(Xpath));
		
	}
	
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	
	public static void btnclick(WebElement element) {
		element.click();
}
	
	public static void selectionByIndex(WebElement element, int i) {
		s = new Select(element);
		s.selectByIndex(i);
	}
	
	
	public static String excelRead(String path,String sname,int rownum,int cellnum) throws IOException {
		File f = new File(path);
		FileInputStream str = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(str);
		Sheet sheet = w.getSheet(sname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		String data = null;
		
		if(cellType==1) {
		data = cell.getStringCellValue();
			}

		else if(DateUtil.isCellDateFormatted(cell)){
			Date datecellValue = cell.getDateCellValue();
			SimpleDateFormat fo = new SimpleDateFormat("MMM/dd/yyyy");
			data = fo.format(datecellValue);
		}			
			
		else {
			double numericcellvalue = cell.getNumericCellValue();
			long l = (long)numericcellvalue;
			data = String.valueOf(l); 
		}
		return data;
			
		}
	
	public static void excelWrite(String path,String sname,int rownum,int cellnum,String data) throws IOException {
		File f = new File(path);
		Workbook w = new XSSFWorkbook();
		Sheet createsheet = w.createSheet(sname);
		Row createrow = createsheet.createRow(rownum);
		Cell createcell = createrow.createCell(cellnum);
		createcell.setCellValue(data);
		FileOutputStream str = new FileOutputStream(f);
		w.write(str);
		
}


}
