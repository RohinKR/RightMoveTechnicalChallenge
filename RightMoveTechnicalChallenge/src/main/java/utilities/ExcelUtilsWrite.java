package utilities;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtilsWrite {

    public void writeTestDataInExcel(String filePath,String sheetName,String[] dataToWrite) throws IOException
    {
        File file = new File(filePath);

        FileInputStream inputStream = new FileInputStream(file);

        Workbook Workbook = null;

        String fileExtensionName = filePath.substring(filePath.indexOf("."));

        if(fileExtensionName.equals(".xlsx")){
            Workbook = new XSSFWorkbook(inputStream);
        }

        else if(fileExtensionName.equals(".xls")){
            Workbook = new HSSFWorkbook(inputStream);
        }
        Sheet sheet = Workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        Row row = sheet.getRow(0);

        Row newRow = sheet.createRow(rowCount+1);

        for(int j = 0; j < row.getLastCellNum(); j++){

            Cell cell = newRow.createCell(j);

            cell.setCellValue(dataToWrite[j]);

        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);

        Workbook.write(outputStream);

        outputStream.close();

    }


}
