package com.adventures.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class AdvantageExcelUtil {

	@DataProvider(name = "SignData")
	public Object[][] getLoginData() throws IOException {
		String filepath = System.getProperty("user.dir") + "/src/test/resources/LoginData.xlsx";
		String sheetName = "Sheet1";
		return AdvantageExcelUtil.getExcelData(filepath, sheetName);
	}

	public static String[][] getExcelData(String filepath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		String[][] loginData = new String[rows][cols];
		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);
				loginData[r - 1][c] = cell + "";
			}
		}
		workbook.close();
		return loginData;

	}
}
