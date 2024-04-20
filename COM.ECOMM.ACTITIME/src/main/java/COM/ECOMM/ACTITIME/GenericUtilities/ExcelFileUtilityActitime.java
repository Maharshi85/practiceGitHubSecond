package COM.ECOMM.ACTITIME.GenericUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtilityActitime {
	public String excelFileUtility(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstantactitime.excelpath);
		Workbook w=WorkbookFactory.create(f);
		String name=w.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return name;
	}	
}
