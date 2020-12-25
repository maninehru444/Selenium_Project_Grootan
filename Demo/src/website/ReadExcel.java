package website;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("D:\\Grootan\\Demo\\ExcelData\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(0).setCellValue("Junior Engineer");
		sheet1.getRow(1).createCell(0).setCellValue("Karan Kumar");
		sheet1.getRow(2).createCell(0).setCellValue("Sangeetha");
		sheet1.getRow(3).createCell(0).setCellValue("SarathKumar");
		sheet1.getRow(4).createCell(0).setCellValue("Arjun");
		sheet1.getRow(5).createCell(0).setCellValue("SriPrasanaBalaji");
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total Row is "+rowcount);
		for(int i=1;i<=rowcount;i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Junior Engineer name is"+data0);
		}
		System.out.println("Check Junior Engineer names in Excel too");
wb.close();
	}

}
