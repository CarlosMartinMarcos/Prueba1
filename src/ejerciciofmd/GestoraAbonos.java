/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofmd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author DAM107
 */
public class GestoraAbonos extends ArrayList<Abono>{

    public GestoraAbonos() {
    }
    
    private void cargarDatosIniciales(){
        
    }
    
    public boolean agregarAbono(Abono a){
        return this.add(a);
    }
    
    public Abono[] devolverAbonosPorDNI(){
//        Abono[] array=this.toArray(new Abono[this.size()]);
//        Arrays.sort(array, new ComparadoraDNI());
        Collections.sort(this, new ComparadoraDNI());
        Abono[] array=this.toArray(new Abono[this.size()]);
        return array;
    }
    
    public Abono[] devolverAbonosPorNombre(){
        Collections.sort(this, new ComparadoraNombre());
        Abono[] array = this.toArray(new Abono[this.size()]);
        return array;
    }
    
    public Abono devuelveAbono(String dni){
        for (Abono aThi : this) {
            if(aThi.getElAbonado().getDni().equals(dni)){
                return aThi;
            }
        }
        return this.get(0);
    }
    
    public String[] devuelveDNIsOrdenados(){
        String[] devolver = new String[this.size()];
        for(int n = 0; n < this.size(); n++){
            devolver[n] = this.get(n).getElAbonado().getDni();
        }
        Arrays.sort(devolver);
        return devolver;
    }
    
    public boolean existeDNI(String dni){
        return this.stream().anyMatch((aThi) -> (aThi.getElAbonado().getDni().equals(dni)));
    }
}
