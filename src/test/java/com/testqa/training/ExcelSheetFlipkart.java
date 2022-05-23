package com.testqa.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import com.test.global.BrowserHandler;

public class ExcelSheetFlipkart extends BrowserHandler {
	
	public static void main(String[] args) throws Exception {
		
		   File src=new File("E:\\Java\\Automationpractice.xlsx");
		   
		   FileInputStream fil=new FileInputStream(src);
		   
		   Workbook wb=new HSSFWorkbook(fil);
		   
		   Sheet sheet=wb.getSheetAt(0);
		   
		   int Firstrow=sheet.getFirstRowNum();
		   
		   for (int i = 0; i <= Firstrow; i++) {
			Row row=sheet.getRow(i);
			Cell cell=row.createCell(2);
	
		}
		   
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		fos.close();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		  
	}

}
