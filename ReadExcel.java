package ReadData;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("C://Users/srujith/Downloads/EXcelDATa/TestData1.xls");
		System.out.println("Excel Located");
		
		Workbook wb=Workbook.getWorkbook(src);
		System.out.println("WorkBook Loaded");
		String data00=wb.getSheet(0).getCell(0,0).getContents();
		System.out.println("Data is"+data00);
		String data01=wb.getSheet(0).getCell(0,1).getContents();
		System.out.println("Data is"+data01);
		String data11=wb.getSheet(0).getCell(1,1).getContents();
		System.out.println("Data is"+data11);
		String data10=wb.getSheet(0).getCell(1,0).getContents();
		System.out.println("Data is"+data10);
		String data02=wb.getSheet(0).getCell(0,2).getContents();
		System.out.println("Data is"+data02);
		String data12=wb.getSheet(0).getCell(1,2).getContents();
		System.out.println("Data is"+data12);
		
		
	}

}
