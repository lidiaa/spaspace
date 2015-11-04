/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Servico; //importanto a classe que sera utilizada, informando o pacote
/**
 *
 * @author Pessoal
 */
public class ServicoDAO implements OperacoesEmBanco, BuscaEmBanco {

    public void insereServico (Servico servico)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));

            //DatabaseUtilit.getPs().setInt(1, servico.getCodigoServico()); 
            DatabaseUtilit.getPs().setString(1, servico.getNomeServico());
            DatabaseUtilit.getPs().setString(2, servico.getDescricaoServico());
            DatabaseUtilit.getPs().setInt(3, servico.getDuracaoMinutosServico());
            
            DatabaseUtilit.getPs().execute();
            System.out.println("Servico cadastrado com sucesso");

        } catch (SQLException ex)
        {
            System.err.println("Servico não foi cadastrado por @insertServico\\ServicoDAO \nErro: "+ex);
        }
    }
    
    public void updateServico (Servico servico)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));

            //DatabaseUtilit.getPs().setInt(1, servico.getCodigoServico()); 
            DatabaseUtilit.getPs().setString(1, servico.getNomeServico());
            DatabaseUtilit.getPs().setString(2, servico.getDescricaoServico());
            DatabaseUtilit.getPs().setInt(3, servico.getDuracaoMinutosServico());

            DatabaseUtilit.getPs().executeUpdate();

            System.out.println("Servico atualizado com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Servico não foi atualizado por @updateServico\\ServicoDAO \nErro: "+ex);
        }
    }
    
    public void deleteServico (Servico servico)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLDelete()));

            DatabaseUtilit.getPs().setInt(1, servico.getCodigoServico()); 

            DatabaseUtilit.getPs().executeUpdate();
            System.out.println("Servico removido com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Servico não foi removido por @deleteServico\\ServicoDAO \nErro: "+ex);
        }
    }
    
    public List<Servico> listarTodosServicos ()
    {
        List<Servico> listaServico = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLList()));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    Servico tempServico = new Servico();
                    tempServico.setCodigoServico(rs.getInt(1));
                    tempServico.setNomeServico(rs.getString(2));
                    tempServico.setDescricaoServico(rs.getString(3));
                    tempServico.setDuracaoMinutosServico(rs.getInt(4));
                    
                    listaServico.add(tempServico);
                }
                return listaServico;
            }
        } catch(SQLException ex)
        {
            System.err.println("Servico não foi consultado \nErro: "+ex);
        }
        return null;
    }
    
    public List<Servico> listarTodosServicosLike (String Like)
    {
        return null;
    }
    
    @Override
    public String SQLInsert() {
        String sql = "insert into servico (nomeservico, descricaoservico, duracaoservico) values (?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update servico set descricaoservico = ?, duracaoservico = ? where codigoservico = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
       String sql = "delete from servico where codigoservico = ?";
        return sql;
    }

    @Override
    public String SQLList() {
        String sql = "select * from servico";
        //select descricaoservico, duracaoservico from servico
        return sql;
    }
    
}
