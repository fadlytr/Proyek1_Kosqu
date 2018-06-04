
import java.io.IOException;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman Al Hafizh
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        CreateChart CC = new CreateChart("Hubungan", "Kita");
        CC.pack();
        CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CC.setVisible(true);
        
    }
}
