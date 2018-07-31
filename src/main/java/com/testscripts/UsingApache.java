package com.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;

public class UsingApache {

	public static void main(String[] args) throws BiffException, IOException {
		String xlpath = "C:\\Users\\praveen\\Desktop\\Data.xlsx";
		//FileInputStream fi = new FileInputStream(xlpath);
		Workbook wb1 = WorkbookFactory.create(new File(xlpath));
		System.out.println("Workbook has " + wb1.getNumberOfSheets() + " Sheets : ");
		
		Iterator<Sheet> sheetIterator = wb1.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }
        
        System.out.println("Retrieving Sheets using for-each loop");
        for(Sheet sheet: workbook)
        {
            System.out.println("=> " + sheet.getSheetName());
        }

        // 3. Or you can use a Java 8 forEach with lambda
        System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
        workbook.forEach(sheet ->
        {
            System.out.println("=> " + sheet.getSheetName());
        });

		
		//step 2: open the sheet
		
		Sheet sh = wb.getSheet("Sheet1");
		
		//step 3: get the cell data
		//System.out.println(sh.getCell(0,1).getContents());
		
		int colCount = sh.getColumns();
		int rowCount = sh.getRows();
		System.out.println("number of columns: "+colCount);
		System.out.println("number of rows: "+rowCount);
		
		for(int i = 0;i<=colCount;i++)
		{
			for(int j = 0;j<=rowCount;j++)
			{
				String cellValue = sh.getCell(i,j).getContents();
				System.out.println("Sheet1:"+cellValue);
			}
		}

	}

}
