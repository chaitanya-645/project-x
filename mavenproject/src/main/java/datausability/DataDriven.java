package datausability;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
public String dataDriven(String shname,int row,int cell) throws Throwable
{
	DataFormatter df = new DataFormatter();
	FileInputStream fis = new FileInputStream("C:\\Users\\CHAITANYA\\eclipse-workspace\\mavenproject\\src\\test\\resources\\excel\\Book1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(shname);
	String data= df.formatCellValue(sh.getRow(row).getCell(cell));
	return data;
	
	
	


}
}
