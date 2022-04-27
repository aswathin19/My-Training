package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream file;
	static XSSFWorkbook w;
	static XSSFSheet sheet;
	public static String readStringData(int row,int column) throws IOException
	{
		file =new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Book1.xlsx");
		w=new  XSSFWorkbook(file);
		sheet =w.getSheet("Sheet1");
		Row r=sheet.getRow(row);
		Cell c=r.getCell(column);
		return c.getStringCellValue();
		
		
	}
	public static int integerData(int r,int c)
	{
		return c;
		
	}
	

}
