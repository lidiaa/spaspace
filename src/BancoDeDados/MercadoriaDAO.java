/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Mercadoria; //importanto a classe que sera utilizada, informando o pacote

/**
 *
 * @author Pessoal
 */
public class MercadoriaDAO implements OperacoesEmBanco, BuscaEmBanco{
    
    
    public void insereMercadoria (Mercadoria mercadoria)
    {
        try
        {
           DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));

           //DatabaseUtilit.getPs().setInt(1, mercadoria.getCodigoMercadoria()); 
           DatabaseUtilit.getPs().setString(1, mercadoria.getNomeMercadoria()); 
           DatabaseUtilit.getPs().setInt(2, mercadoria.getCodigoFornecedor()); 
           DatabaseUtilit.getPs().setString(3, mercadoria.getDescricaoMercadoria()); 
           DatabaseUtilit.getPs().setDouble(4, mercadoria.getValorMercadoria()); 
           DatabaseUtilit.getPs().setInt(5, mercadoria.getQuantidadeMercadoria()); 

           DatabaseUtilit.getPs().execute();
           System.out.println("Mercadoria cadastrado com sucesso");

       } catch (SQLException ex)
       {
           System.err.println("Mercadoria não foi cadastrado por @insertMercadoria\\MercadoriaDAO \nErro: "+ex);
       }
    }
    
    public void updateMercadoria (Mercadoria mercadoria)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));
            
           //DatabaseUtilit.getPs().setInt(1, mercadoria.getCodigoMercadoria()); 
           DatabaseUtilit.getPs().setString(1, mercadoria.getNomeMercadoria()); 
           DatabaseUtilit.getPs().setInt(2, mercadoria.getCodigoFornecedor()); 
           DatabaseUtilit.getPs().setString(3, mercadoria.getDescricaoMercadoria()); 
           DatabaseUtilit.getPs().setDouble(4, mercadoria.getValorMercadoria()); 
           DatabaseUtilit.getPs().setInt(5, mercadoria.getQuantidadeMercadoria()); 

            DatabaseUtilit.getPs().executeUpdate();

            System.out.println("Mercadoria atualizado com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Mercadoria não foi atualizado por @updateMercadoria\\MercadoriaDAO \nErro: "+ex);
        }
    }
    
    public void deleteMercadoria (Mercadoria mercadoria)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLDelete()));

            DatabaseUtilit.getPs().setInt(1, mercadoria.getCodigoMercadoria()); 

            DatabaseUtilit.getPs().executeUpdate();
            System.out.println("Mercadoria removido com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Mercadoria não foi removido por @deleteMercadoria\\MercadoriaDAO \nErro: "+ex);
        }
    }
    
    public List<Mercadoria> listarTodasMercadorias ()
    {
        List<Mercadoria> listaMercadoria = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLList()));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    Mercadoria tempMercadoria = new Mercadoria();
                    tempMercadoria.setCodigoMercadoria(rs.getInt(1));
                    tempMercadoria.setNomeMercadoria(rs.getString(2));
                    tempMercadoria.setCodigoFornecedor(rs.getInt(3));
                    tempMercadoria.setDescricaoMercadoria(rs.getString(4));
                    tempMercadoria.setValorMercadoria(rs.getDouble(5));
                    tempMercadoria.setQuantidadeMercadoria(rs.getInt(6));
                    
                    listaMercadoria.add(tempMercadoria);
                }
                return listaMercadoria;
            }
        } catch(SQLException ex)
        {
            System.err.println("Mercadoria não foi consultado \nErro: "+ex);
        }
        
        return null;
    }
    
    public List<Mercadoria> listarTodasMercadoriasLike (String Like)
    {
        return null;
    }
    

    @Override
    public String SQLInsert() {
        String sql = "select from mercadoria (nomemercadoria, "
                + "codigofornecedor, descricaomercadoria, valormercadoria, quantidademercadoria) "
                + "values (?, ?, ?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update mercadoria set nomemercadoria = ?, codigofornecedor = ?, "
                + "descricaomercadoria = ?, valormercadoria = ?, quantidademercadoria = ? "
                + "where codigomercadoria = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
        String sql = "delete from mercadoria where codigomercadoria = ?";
        return sql;
    }

    @Override
    public String SQLList() {
       String sql = "select * from mercadoria";
       /* 
       select select nomemercadoria, codigofornecedor, descricaomercadoria, "
               + "valormercadoria, quantidademercadoria from mercadoria
       */
        return sql;
    }
    
}
