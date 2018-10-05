package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String abc(String file,String sheet,int row,int cell){
		String s= "";
		try
		{
			FileInputStream f = new FileInputStream("D:/Selenium/Project/Data/Book1.xlsx");
			Workbook wb = WorkbookFactory.create(f);
			s = wb.getSheet("Sheet1").getRow(row).getCell(cell).toString();
		}
		catch(Exception e)
		{
			
		}
		return s;
	}

}
