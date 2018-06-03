/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterkos;

import Object.ObjectXcle;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Fadly
 */
public class FilterKos {
   
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        filter2Obj fil2 = new filter2Obj();
        List<ObjectXcle> fin = fil2.filterHargKec(2000000,2000, "Andir");
        String macam;
        String[] part;
        int i;
        
        for (ObjectXcle item : fin) {
            System.out.println(item.getNama()+ "\n tipe: " + item.getTipe() + "\n harga: " + item.getHarga()+ "\n aksel: " + item.getAksel()+ "\n alamt: " +item.getAlamt()+ "\n bathfas " +item.getBathfas()+ "\n desket: " +item.getDesKet()+ "\n deskos " +item.getDesKos()+ "\n id: " +item.getId());
        }
    }
}