/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.VendaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonathan
 */
public class VendaModelo extends AbstractTableModel {
    
    private String colunas[] = {"CÓDIGO", "NOME", "TELEFONE"};
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
                return venda.getCodigoVenda();
            case 1:
                return venda.getCodigoCliente();
            case 2:
                return venda.getCodigoServico();
            default:
                throw new IndexOutOfBoundsException("Column out of bounds");
        }
    }
    
    public List<Venda> fillingRows() throws Exception
    {
        try
        {
            VendaDAO vendaDAO = new VendaDAO();
            linhas = new ArrayList();
            //linhas = vendaDAO.ListarTodos();
        }
        catch(Exception ex)
        {
            throw new Exception("Erro ao preencher tabela:" + ex.getMessage());
        }
        return linhas;
    }
    
    public List<Venda> fillingRows(String like) throws Exception
    {
        try
        {
            VendaDAO vendaDAO = new VendaDAO();
            linhas = new ArrayList();
            //linhas = vendaDAO.ListarLike(like);
        }
        catch(Exception ex)
        {
            throw new Exception("Erro ao preencher tabela:" + ex.getMessage());
        }
        return linhas;
    }
    
}
