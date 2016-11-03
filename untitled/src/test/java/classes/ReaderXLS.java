package classes;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Витал on 31.10.2016.
 */

public class ReaderXLS {
    private InputStream input;
    private HSSFWorkbook workBook;

    public ReaderXLS() {
        try {
            input = new FileInputStream("src\\test\\resources\\Data.xls");
            workBook = new HSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object[][] parse(String nameSheet, boolean isLong) {
        Sheet sheet = workBook.getSheet(nameSheet);
        int rows = sheet.getPhysicalNumberOfRows();
        int column = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] result = new Object[rows][column];
        if (isLong) {

            for (int i = 0; i < rows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < column; j++) {
                    Cell cell = row.getCell(j);
                    result[i][j] = (long) cell.getNumericCellValue();
                }
            }

            return result;
        } else {
            for (int i = 0; i < rows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < column; j++) {
                    Cell cell = row.getCell(j);
                    result[i][j] = (double) cell.getNumericCellValue();
                }
            }
            return result;
        }
    }
}

