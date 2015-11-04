/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.MercadoriaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pessoal
 */
public class MercadoriaModelo extends AbstractTableModel{
    
    private String[] colunas = {"Cod", "Nome", "Cod Fornecedor", "Descrição", "Valor", "Quant"};
    private static List<Mercadoria> linhas;
    
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
        Mercadoria m = linhas.get(rowIndex);
        switch(columnIndex) { 
        //{"Cod", "Nome", "Cod Fornecedor", "Descrição", "Valor", "Quant"};
            case 0:
                return m.getCodigoMercadoria();
            case 1:
                return m.getNomeMercadoria();
            case 2:
                return m.getCodigoFornecedor();
            case 3:
                return m.getDescricaoMercadoria();
            case 4:
                return m.getValorMercadoria();
            case 5:
                return m.getQuantidadeMercadoria();
            default:
                throw new IndexOutOfBoundsException("Coluna fora");       
        }
    }
    
    public List<Mercadoria> fillingRows()
    {
        try{
            MercadoriaDAO sDAO = new MercadoriaDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodasMercadorias();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    public List<Mercadoria> fillingRows(String Like)
    {
        try{
            MercadoriaDAO sDAO = new MercadoriaDAO();
            linhas = new ArrayList();
            linhas = sDAO.listarTodasMercadoriasLike(Like);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encher tabela "+e);
        }
        return linhas;
    }
    
    
}
