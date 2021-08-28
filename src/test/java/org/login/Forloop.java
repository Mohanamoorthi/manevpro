package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Forloop {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Greens\\FORLOOP.xlsx");
		
		FileInputStream s = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(s);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		int noofrows = sheet.getPhysicalNumberOfRows();
		
		System.out.println(noofrows);
		
		for (int i = 0; i < noofrows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String stringcellvalue = cell.getStringCellValue();
				System.out.println(stringcellvalue);
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
