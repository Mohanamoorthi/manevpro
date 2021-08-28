package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filewrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\sample.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createsheet = w.createSheet("abcd");
		Row Createrow = createsheet.createRow(0);
		Cell createcell = Createrow.createCell(0);
		createcell.setCellValue("ragaav");
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
	}

}
