package reader;

import reader.excel.ExcelReaderImpl;

public class TestExcel {

	public static void main (String[] args) {
		
		ExcelReaderImpl xls = new ExcelReaderImpl();
		
		xls.setFileName("C:\\Users\\Hids\\git\\test\\TestGherkin\\src\\data\\bdd-data.xlsx");
		xls.test();
	}
}
