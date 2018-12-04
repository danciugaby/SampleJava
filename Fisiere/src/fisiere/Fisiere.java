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
 * @author gabi
 */
public class Fisiere {
    
    HashMap<Punct, Integer>  puncte;

    void Transpose(Punct newp)
    {
         HashMap<Punct, Integer>  puncteaux = new HashMap<>();
        for(Punct  p : puncte.keySet())
        {
            int val = puncte.get(p);
            puncteaux.put( p.transpose(newp), val);
        }
        puncte =  puncteaux;
    }
    /**
     * @param args the command line arguments
     */
    void Citire(String numesifisier) {
        HashMap<Punct, Integer> list = new HashMap<Punct, Integer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(numesifisier)));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] s = line.split(" ");
                Punct p = new Punct(Integer.parseInt(s[0]),
                        Integer.parseInt(s[1]),
                        Integer.parseInt(s[2]));
                
                if (list.containsKey(p))
                {
                    int val = list.get(p);
                    val++;
                    list.put(p,val);
                }
                else
                    list.put(p,1);
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        puncte = list;
    }
    
    void Afiseaza() {
        for (Punct p : puncte.keySet()) {
            System.out.println(p + " \t " + puncte.get(p).intValue());
        }
    }
    
    void Scriere(String numesifisier) {
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(numesifisier)));
            bw.write("\"x\",\"y\",\"z\"\r\n");
            Set s = puncte.keySet();
            for (Punct p : puncte.keySet()) {
                Object o = puncte.get(p);
                bw.write(p.Write() + "\t " + puncte.get(p).intValue() + "\r\n");
            }
            bw.flush();
            bw.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }        
    }
}
