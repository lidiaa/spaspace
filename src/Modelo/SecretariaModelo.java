/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.SecretariaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pessoal
 */
public class SecretariaModelo extends AbstractTableModel{
    private String[] colunas = {"Cod", "Cpf", "Rg", "Nome", "Telefone", "Genero", "Cep", "Nro Casa", "Cargo"};
    private static List<Secretaria> linhas;
    
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
        Secretaria s = linhas.get(rowIndex);
        switch(columnIndex) { 
        //{"Cod", "Cpf", "Rg", "Nome", "Telefone", "Genero", "Cep", "Nro Casa", "Cargo"};
            case 0:
                return s.getCodigo();
            case 1:
                return s.getCPF();
            case 2:
                return s.getRG();
            case 3:
                return s.getNome();
            case 4:
                return s.getTelefone();
            case 5:
                return s.getGenero();
            case 6:
                return s.getCep();
            case 7:
                return s.getNumeroCasa();
            case 8:
                return s.getCargo();    
                
            default:
                throw new IndexOutOfBoundsException("Coluna fora");       
        }
    }
    
    public List<Secretaria> fillingRows()
    {
        try{
            SecretariaDAO sDAO = new SecretariaDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodasSecretarias();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Secretaria> fillingRows(String Like)
    {
        try{
            SecretariaDAO sDAO = new SecretariaDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodasSecretariasLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Secretaria> fillingRows(int Like)
    {
        try{
            SecretariaDAO sDAO = new SecretariaDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodasSecretariasLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
}
