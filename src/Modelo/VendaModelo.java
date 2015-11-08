/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonathan
 */
public class VendaModelo extends AbstractTableModel {
    
    private String colunas[] = {"ID", "NOME", "TELEFONE"};
    private static List<Venda> linhas;
    
    @Override
    public int getRowCount()
    {
        return linhas.size();
    }
            
    @Override
    public int getColumnCount()
    {
        return colunas.length;
    }
    
    public String getColumnName(int columnIndex)
    {
        return colunas[columnIndex];
    }
    
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Venda venda = linhas.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        
        return venda;
    }
    
}
