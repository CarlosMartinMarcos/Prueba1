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
public abstract class Abono {
    private Ciudadano elAbonado;
    private Meses mesDeAlta;
    private TipoAbono tipo;

    public Ciudadano getElAbonado() {
        return elAbonado;
    }

    public void setElAbonado(Ciudadano elAbonado) {
        this.elAbonado = elAbonado;
    }

    public Meses getMesDeAlta() {
        return mesDeAlta;
    }

    public void setMesDeAlta(Meses mesDeAlta) {
        this.mesDeAlta = mesDeAlta;
    }

    public TipoAbono getTipo() {
        return tipo;
    }

    public void setTipo(TipoAbono tipo) {
        this.tipo = tipo;
    }
    
    public abstract float costePrimerCuatrimestre();
    
    public abstract float costeSegundoCuatrimestre();
    
    public abstract float costeTercerCuatrimestre();
}
