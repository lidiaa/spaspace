/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pessoal
 */
public class ClienteModelo extends AbstractTableModel{
    private String[] colunas = {"Cod", "Cpf", "Rg", "Nome", "Telefone", "Genero"};
    private static List<Cliente> linhas;
    
    @Override
    public int getRowCount() {
         return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName (int columnIndex){
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente c = linhas.get(rowIndex);
        //{"Cod", "Cpf", "Rg", "Nome", "Telefone", "Genero"};
        switch(columnIndex) { 
            case 0:
                return c.getCodigo();
            case 1:
                return c.getCPF();
            case 2:
                return c.getRG();
            case 3:
                return c.getNome();
            case 4:
                return c.getTelefone();
            case 5:
                return c.getGenero();
            default:
                throw new IndexOutOfBoundsException("Coluna fora");       
        }
    }
    
    public List<Cliente> fillingRows()
    {
        try{
            ClienteDAO cDAO = new ClienteDAO();
            linhas = new ArrayList();
            linhas = cDAO.listarTodosClientes();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Cliente> fillingRows(String like)
    {
        try{
            ClienteDAO cDAO = new ClienteDAO();
            linhas = new ArrayList();
            linhas = cDAO.listarTodosClientesLike(like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
}
