/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisiere;

import java.io.*;
import java.util.*;

/**
 *
 * @author z003w68c
 */
public class Fisiere {
    
    Set<Punct> puncte;

    /**
     * @param args the command line arguments
     */
    void Citire(String numesifisier) {
        Set<Punct> list = new TreeSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(numesifisier)));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] s = line.split(" ");
                list.add(new Punct(Integer.parseInt(s[0]),
                        Integer.parseInt(s[1]),
                        Integer.parseInt(s[2])));
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        puncte = list;
    }
    
    void Afiseaza() {
        for (Punct p : puncte) {
            System.out.println(p);
        }
    }
    
    void Scriere(String numesifisier) {
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(numesifisier)));
            bw.write("\"x\",\"y\",\"z\"\r\n");
            for (Punct p : puncte) {
                bw.write(p.Write() + "\r\n");
            }
            bw.flush();
            bw.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }        
    }
}
