package utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtilsRead {

        private static XSSFSheet ExcelWSheet;

        private static XSSFWorkbook ExcelWBook;

        private static XSSFCell Cell;

        private static XSSFRow Row;


        public static void setExcelFile(String Path,String SheetName) throws Exception {

            try {

                FileInputStream ExcelFile = new FileInputStream(Path);

                ExcelWBook = new XSSFWorkbook(ExcelFile);
                ExcelWSheet = ExcelWBook.getSheet(SheetName);


            } catch (Exception e){

                throw (e);

            }

        }


        public static String getCellData(int RowNum, int ColNum) throws Exception{

            try{

                String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
                ExcelWSheet.getSheetName();
                System.out.print(CellData);
                return CellData;

            }
            catch (Exception e){

                return "error";

            }

        }

        
}
