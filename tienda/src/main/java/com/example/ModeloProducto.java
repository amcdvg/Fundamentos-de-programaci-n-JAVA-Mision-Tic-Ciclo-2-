package com.example;

import javax.swing.table.AbstractTableModel;

public class ModeloProducto extends AbstractTableModel {

    Object datos[][];

    public ModeloProducto() {
        addTableModelListener(evt -> {
            for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < datos[0].length; j++) {
                    System.out.print(datos[i][j] + " ");
                }
                System.out.println();
            }
        });
    }

    @Override
    public int getRowCount() {
        return datos.length;
    }

    @Override
    public int getColumnCount() {
        return datos[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datos[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        datos[rowIndex][columnIndex] = aValue;
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

}
