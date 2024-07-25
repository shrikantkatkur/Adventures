package com.adventures.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdvanceUtil {
	@DataProvider(name = "advance")
	public Object[][] getLoginData() throws IOException {
		String filepath = System.getProperty("user.dir") + "/src/main/resources/data.xlsx";
		String sheetName = "ajit1";
		// return ExcelUtilSmita.readExcelSheet(filepath, sheetName);
		return ExcelUtil.getExcelData(filepath, sheetName);
	}

	public static String[][] getExcelData(String filepath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		String[][] loginData = new String[rows][cols];
		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);
				loginData[r - 1][c] = cell + "";
				System.out.println(loginData[r - 1][c]);
			}
		}
		workbook.close();
		return loginData;

	}
	
}
