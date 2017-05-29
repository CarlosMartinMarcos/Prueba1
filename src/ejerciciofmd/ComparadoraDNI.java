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
public class ComparadoraDNI implements Comparator<Abono>{

    @Override
    public int compare(Abono o1, Abono o2) {
        int[] criteriosOrdenacion = {o1.getElAbonado().getDni().compareTo(o2.getElAbonado().getDni()),
        o.calculaGoles().compareTo(this.calculaGoles())};
        for (int unCriterio : criteriosOrdenacion) {
            if (unCriterio != 0) {
                return unCriterio;
            }
        }
        return 0;
    }
    
}
