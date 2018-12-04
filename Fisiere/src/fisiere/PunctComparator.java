/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisiere;
import java.util.*;
/**
 *
 * @author gabi
 */
public class PunctComparator implements Comparator<Punct> {

    @Override
    public int compare(Punct o1, Punct o2) {
        if (((Integer)o1.x).compareTo((Integer)o2.x) ==0)
        {
            if (((Integer)o1.y).compareTo((Integer)o2.y) ==0)
            {
                return ((Integer)o1.z).compareTo((Integer)o2.z);
            }
            else
                return ((Integer)o1.y).compareTo((Integer)o2.y);
        }
        else
            return ((Integer)o1.x).compareTo((Integer)o2.x);
    }
    
}
