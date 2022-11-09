package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {

	public static String ExcelSheet(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream("D:\\eclipse\\SwagLaps\\src\\test\\resources\\TestCase.xlsx");
		String value = WorkbookFactory.create(File).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();	
		return value;
	}
}
