package com.selenium.browserinteractions.testing;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./Data.xlsx");
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sh = wb.getSheet("demo");
        int rowCount = sh.getLastRowNum(); // for human like reading use getPhysicalNumRows()
        int colCount = sh.getRow(0).getLastCellNum();
        for(int i=0; i<=rowCount; i++) {
            for(int j=0; j<colCount; j++) {
                String cellData = sh.getRow(i).getCell(j).getStringCellValue();
                System.out.println(cellData);
            }
        }
    }
}
