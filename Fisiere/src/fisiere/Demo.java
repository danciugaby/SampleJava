/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisiere;

/**
 *
 * @author z003w68c
 */
public class Demo {
    public static void main(String[] args) {         
        
        Fisiere f = new Fisiere();
        f.Citire("Puncte.txt");
        f.Afiseaza();
        f.Scriere("Out.csv");
    }
}
