/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofmd;

import java.awt.Component;

/**
 *
 * @author DAM107
 */
public class MiExcepcion extends Exception {

    private Component componente;

    /**
     * Constructs an instance of <code>MiExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     * @param c
     */
    public MiExcepcion(String msg, Component c) {
        super(msg);
        this.componente = c;
        
    }
}
