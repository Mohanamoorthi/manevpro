package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Toreadmultipledata {
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Greens\\FORLOOP.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		int Noofrows = sheet.getPhysicalNumberOfRows();
		
		System.out.println(Noofrows);
		
		
		for (int i = 0; i < Noofrows; i++) {
			
			Row rows = sheet.getRow(i);
			
			for (int j = 0; j < rows.getPhysicalNumberOfCells(); j++) {
				Cell cell = rows.getCell(j);
				
			int celltype = cell.getCellType();
			
			if (celltype == 1) {
				String stringcellvalue = cell.getStringCellValue();
				System.out.println(stringcellvalue);
			}
			else if(DateUtil.isCellDateFormatted(cell)){
				
				Date datecellvalue=cell.getDateCellValue();
				System.out.println(datecellvalue);
			
			}
			else {
				double numericvalue = cell.getNumericCellValue();
				
				long l = (long) numericvalue;
				
				System.out.println(l);
			}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
