/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofmd;

/**
 *
 * @author DAM107
 */
public class AbonoAnual extends Abono{
    
    private Ciudadano ciudadano;
    
    public AbonoAnual(Ciudadano c) {
        this.ciudadano = c;
    }

    @Override
    public float costePrimerCuatrimestre() {
        if(ciudadano.getEmpadronado()){
            return TipoAbono.AY.getCoste() / 3f;
        } else{
            return TipoAbono.AN.getCoste() / 3f;
        }
    }

    @Override
    public float costeSegundoCuatrimestre() {
        if(ciudadano.getEmpadronado()){
            return TipoAbono.AY.getCoste() / 3f;
        } else{
            return TipoAbono.AN.getCoste() / 3f;
        }
    }

    @Override
    public float costeTercerCuatrimestre() {
        if(ciudadano.getEmpadronado()){
            return TipoAbono.AY.getCoste() / 3f;
        } else{
            return TipoAbono.AN.getCoste() / 3f;
        }
    }
    
    
}
