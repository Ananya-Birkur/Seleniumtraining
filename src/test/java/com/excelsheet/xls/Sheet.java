package com.excelsheet.xls;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sheet {
	public static void main(String[] args) throws Exception {
		  XSSFWorkbook wb=new XSSFWorkbook();
		  XSSFSheet sheet=wb.getSheetAt(0);
		  sheet.createRow(0);
		  sheet.getRow(0).createCell(0).setCellValue("ananya");
		  sheet.getRow(0).createCell(1).setCellValue("ananya1");
		  sheet.createRow(1);
		  sheet.getRow(1).createCell(0).setCellValue("birkur");
		  sheet.getRow(1).createCell(1).setCellValue("birkur1");
		  sheet.createRow(2);
		  sheet.getRow(2).createCell(0).setCellValue("ab");
		  sheet.getRow(2).createCell(1).setCellValue("ab1");
		  sheet.createRow(3);
		  sheet.getRow(3).createCell(0).setCellValue("abb");
		  sheet.getRow(3).createCell(1).setCellValue("abb1");
		  
		  File src=new File("E:\\Java\\Automationpractice.xlsx");
		  FileOutputStream fos=new FileOutputStream(src);
		  wb.write(fos);
		  wb.close();
		  
		  
	}
}
