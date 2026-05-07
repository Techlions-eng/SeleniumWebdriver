package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");
		
	}

}
