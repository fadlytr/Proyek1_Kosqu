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
        List<ObjectXcle> fin = fil2.filterHargKec(200000000 , 2000, "Andir");
        
        for (Iterator<ObjectXcle> i = fin.iterator(); i.hasNext();) {
            ObjectXcle item = i.next();
            System.out.println(item.getNama()+ " " + item.getTipe() + " " + item.getHarga());
        }
    }
    
}