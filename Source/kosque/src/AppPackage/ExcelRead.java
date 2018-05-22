/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Description      : 
 * Date             :
 * @author Ahmad_Aji_Naufal_Ali
 */
public class ExcelRead {
    public static void main(String[] args) throws FileNotFoundException, IOException, InvalidFormatException {
        
        String username = "test";
        
        FileInputStream fis = new FileInputStream("src/data/UserData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");
        int noOfRow = sh.getLastRowNum();
        System.out.println(noOfRow);
        
        Row row = sh.createRow(1);
        Cell cell = row.createCell(0);
        cell.setCellValue(username);
        System.out.println(cell.getStringCellValue());
        
        FileOutputStream fos = new FileOutputStream("src/data/UserData.xlsx");
        wb.write(fos);
        fos.flush();
        fos.close();
        System.out.println("Done");
        
    }
}
