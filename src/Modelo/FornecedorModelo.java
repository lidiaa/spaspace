/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.FornecedorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pessoal
 */
public class FornecedorModelo extends AbstractTableModel{
    
    private String[] colunas = {"Cod", "Cnpj", "Nome", "Nome Fantasia", "Email", "Responsável", "Telefone"};
    private static List<Fornecedor> linhas;
    
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
        Fornecedor f = linhas.get(rowIndex);
        switch(columnIndex) { 
        //{"Cod", "Cnpj", "Nome", "Nome Fantasia", "Email", "Responsável", "Telefone"};
            case 0:
                return f.getCodigo();
            case 1:
                return f.getCNPJ();
            case 2:
                return f.getNome();
            case 3:
                return f.getNomeFantasia();
            case 4:
                return f.getEmail();
            case 5:
                return f.getNomeResponsavel();
            case 6:
                return f.getTelefone();
            default:
                throw new IndexOutOfBoundsException("Coluna fora");       
        }
    }
    
    public List<Fornecedor> fillingRows()
    {
        try{
            FornecedorDAO fDAO = new FornecedorDAO();
            linhas = new ArrayList();
            linhas = fDAO.listarTodosFornecedores();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Fornecedor> fillingRows(String Like) //polimorfismo
    {
        try{
            FornecedorDAO fDAO = new FornecedorDAO();
            linhas = new ArrayList();
            linhas = fDAO.listarTodosFornecedoresLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
     public List<Fornecedor> fillingRows(int Like) //polimorfismo
    {
        try{
            FornecedorDAO fDAO = new FornecedorDAO();
            linhas = new ArrayList();
            linhas = fDAO.listarTodosFornecedoresLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
}
