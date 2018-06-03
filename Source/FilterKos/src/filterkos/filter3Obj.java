/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterkos;

import Object.ObjectXcle;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Fadly
 */
public class filter3Obj {
    static List<ObjectXcle> filter = new ArrayList<>();
    
    public List<ObjectXcle> filter3Object(int max, int min, String kec, String tipe) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("D:\\Tugas\\DataProyek.xlsx"));
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell harga = currentRow.getCell(3);
          Cell alamat = currentRow.getCell(14);
          Cell namaKos = currentRow.getCell(1);
          Cell id = currentRow.getCell(0);
          Cell kecam = currentRow.getCell(16);
          Cell type = currentRow.getCell(2);
          Cell roomFas = currentRow.getCell(4);
          Cell bathFas = currentRow.getCell(6);
          Cell umFas = currentRow.getCell(7);
          Cell pakFas = currentRow.getCell(8);
          Cell akSel = currentRow.getCell(9);
          Cell kelur = currentRow.getCell(15);
          Cell univ = currentRow.getCell(19);
          Cell ketLain = currentRow.getCell(10);
          Cell ketBi = currentRow.getCell(11);
          Cell desKet = currentRow.getCell(12);
          Cell desKos = currentRow.getCell(13);
          Cell owner = currentRow.getCell(17);
          
          ObjectXcle str = new ObjectXcle();
          str.setHarga(harga.getCellType());
          str.setKecamatan(kecam.getStringCellValue());
          str.setTipe(type.getStringCellValue());
          if (str.getHarga()>=min && str.getHarga()<=max && str.getKecamatan().equals(kec) && str.getTipe().equals(tipe)){
              str.setAksel(akSel.getStringCellValue());
              str.setUniversity(univ.getStringCellValue());
              str.setAlamat(alamat.getStringCellValue());
              str.setBathfas(bathFas.getStringCellValue());
              str.setId(id.getStringCellValue());
              str.setKelurahan(kelur.getStringCellValue());
              str.setNama(namaKos.getStringCellValue());
              str.setPakfas(pakFas.getStringCellValue());
              str.setRoomfas(roomFas.getStringCellValue());
              str.setUmfas(umFas.getStringCellValue());
              str.setKetLain(ketLain.getStringCellValue());
              str.setKetBi(ketBi.getStringCellValue());
              str.setDesKet(desKet.getStringCellValue());
              str.setDesKos(desKos.getStringCellValue());
              str.setOwner(owner.getStringCellValue());
              filter.add(str);
          }
      }
        
        return filter;
}
}
