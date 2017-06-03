/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofmd;

import java.util.Comparator;

/**
 *
 * @author DAM107
 */
public class ComparadoraNombre implements Comparator<Abono>{

    @Override
    public int compare(Abono o1, Abono o2) {
        int criterioOrdenacion = o1.getElAbonado().getNombre().compareTo(o2.getElAbonado().getNombre());
            if (criterioOrdenacion < 0) {
                return 1;
        }
        return 2;
    }
    
}
