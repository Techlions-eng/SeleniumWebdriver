package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\productData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noOfRows = sheet.getLastRowNum();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		for(int r=0; r<=noOfRows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0; c<=noOfColumns;c++) {
				System.out.println(currentRow.getCell(c).toString());
			}
		}
		workbook.close();
		file.close();
	}

}
