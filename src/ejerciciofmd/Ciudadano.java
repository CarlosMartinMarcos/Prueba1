/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofmd;

import java.util.Date;

/**
 *
 * @author DAM107
 */
public class Ciudadano {
    private String nombre;
    private String dni;
    private Date fechaNacimiento;
    private Boolean empadronado;

    public Ciudadano(String n, String dni, Date f, Boolean em) {
        this.nombre = n;
        this.dni = dni;
        this.fechaNacimiento = f;
        this.empadronado = em;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getEmpadronado() {
        return empadronado;
    }

    public void setEmpadronado(Boolean empadronado) {
        this.empadronado = empadronado;
    }
    
    
}
