/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.MassagistaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pessoal
 */
public class MassagistaModelo extends AbstractTableModel{
    private String[] colunas = {"Cod", "Cpf", "Rg", "Nome", "Telefone", "Genero", "Cep", "Nro Casa", "Formação", "Anos Exp", "Especialidade"};
    private static List<Massagista> linhas;
    
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
        Massagista m = linhas.get(rowIndex);
        switch(columnIndex) { 
        //{"Cod", "Cpf", "Rg", "Nome", "Telefone", "Genero", "Cep", "Nro Casa", "Formação", "Anos Exp", "Especialidade"};
            case 0:
                return m.getCodigo();
            case 1:
                return m.getCPF();
            case 2:
                return m.getRG();
            case 3:
                return m.getNome();
            case 4:
                return m.getTelefone();
            case 5:
                return m.getGenero();
            case 6:
                return m.getCep();
            case 7:
                return m.getNumeroCasa();
            case 8:
                return m.getFormacao();
            case 9:
                return m.getAnosExperiencia();
            case 10:
                return m.getEspecialidade();
            default:
                throw new IndexOutOfBoundsException("Coluna fora");       
        }
    }
    
    public List<Massagista> fillingRows()
    {
        try{
            MassagistaDAO fDAO = new MassagistaDAO();
            linhas = new ArrayList();
            linhas = fDAO.listarTodosMassagistas();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Massagista> fillingRows(String Like)
    {
        try{
            MassagistaDAO fDAO = new MassagistaDAO();
            linhas = new ArrayList();
            linhas = fDAO.listarTodosMassagistasLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
}
