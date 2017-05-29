/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofmd;

import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAM107
 */
public class ModeloTablaListado extends DefaultTableModel{

    private GestoraAbonos gestora;
    
    @Override
    public Object getValueAt(int row, int column) {
        
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        String[] nombres = {"DNI", "NOMBRE", "EDAD", "EMPADRONADO", "ABONO", "MES DE ALTA", "CUATRIMESTRE1", "CUATRIMESTRE2", "CUATRIMESTRES3"};
        return nombres[column];
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public int getRowCount() {
        return gestora == null ? 0 : gestora.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class[] clases = {Integer.class, String.class, Date.class, Boolean.class, String.class, String.class, Float.class, Float.class, Float.class};
        return clases[columnIndex];
    }
    
    
}
