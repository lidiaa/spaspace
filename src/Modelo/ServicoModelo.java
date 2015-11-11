/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.ServicoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pessoal
 */
public class ServicoModelo extends AbstractTableModel{
    private String[] colunas = {"Cod", "Nome", "Descrição", "Duração", "Valor"};
    private static List<Servico> linhas;
    
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
        Servico s = linhas.get(rowIndex);
        switch(columnIndex) { 
        //{"Cod", "Nome", "Descricao", "Duracao"};
            case 0:
                return s.getCodigoServico();
            case 1:
                return s.getNomeServico();
            case 2:
                return s.getDescricaoServico();
            case 3:
                return s.getDuracaoMinutosServico();
            case 4:
                return s.getValorServico();    
                
            default:
                throw new IndexOutOfBoundsException("Coluna fora");       
        }
    }
    
    public List<Servico> fillingRows()
    {
        try{
            ServicoDAO sDAO = new ServicoDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodosServicos();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Servico> fillingRows(String Like) //polimorfismo
    {
        try{
            ServicoDAO sDAO = new ServicoDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodosServicosLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Servico> fillingRows(int Like) //polimorfismo
    {
        try{
            ServicoDAO sDAO = new ServicoDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodosServicosLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
}
