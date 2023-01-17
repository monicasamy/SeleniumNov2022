package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readdata(String filename) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+ filename +".xlsx");//setting up path and opening the workbook
		XSSFSheet ws = wb.getSheetAt(0); // getting sheet
		int rowcount = ws.getLastRowNum();//getting no.of rows with data
		short columncount = ws.getRow(0).getLastCellNum();//getting no.of columns with data//we are going to 0th row because for negative scenarios we may have blank row.

		String [][] data = new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
			XSSFRow row = ws.getRow(i); // getting row
			XSSFCell cell = row.getCell(j);//getting column
			String value = cell.getStringCellValue();
			data[i-1][j] = value;
		}
		wb.close();		

	}
		return data;
	}
}

