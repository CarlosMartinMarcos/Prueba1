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
public class AbonoParcial extends Abono{
    
    private Ciudadano ciudadano;
    private Meses mes;

    public AbonoParcial(Ciudadano c, Meses m) {
        this.ciudadano = c;
        this.mes = m;
    }

    @Override
    public float costePrimerCuatrimestre() {
        if(ciudadano.getEmpadronado()){
            return TipoAbono.PY.getCoste() * mes.getMensualidades();
        } else{
            return TipoAbono.PN.getCoste() * mes.getMensualidades();
        }
    }

    @Override
    public float costeSegundoCuatrimestre() {
        if(ciudadano.getEmpadronado()){
            return TipoAbono.PY.getCoste() * mes.getMensualidades();
        } else{
            return TipoAbono.PN.getCoste() * mes.getMensualidades();
        }
    }

    @Override
    public float costeTercerCuatrimestre() {
        if(ciudadano.getEmpadronado()){
            return TipoAbono.PY.getCoste() * mes.getMensualidades();
        } else{
            return TipoAbono.PN.getCoste() * mes.getMensualidades();
        }
    }
    
    
}
