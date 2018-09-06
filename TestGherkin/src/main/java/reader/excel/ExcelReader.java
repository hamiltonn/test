package reader.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class ExcelReader {

	protected String fileName;
	protected XSSFWorkbook book;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

    public void open () {
		try {
			FileInputStream excelFile = new FileInputStream(new File(fileName));
			book = new XSSFWorkbook(excelFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
    };
 
    public void close () { 
    	
    	// Closing the workbook
		try {
	    	if (book != null)
	    		book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
