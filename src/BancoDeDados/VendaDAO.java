/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Modelo.Venda;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class VendaDAO {
    
    private String SQLUpdate()
    {
        return "UPDATE VENDA SET DATAPAGAMENTO=?, STATUS='F' WHERE codigoVenda=?";
    }
    
    public String SQLList() 
    {
        String sql = "SELECT * from VENDA";
        return sql;
    }
    
    public String SQLInsert() 
    {
        String sql = "INSERT INTO venda (observacao, codigocliente, codigoservico, formapagamento, valorservico, datavencimento, datapagamento)"
                +"VALUES (?, ?, ? , ?, ?, ?, ?)";
        return sql;
    }
    
    public void update(String id, String dataPagamento)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));

            // DatabaseUtilit.getPs().setInt(1, cliente.getCodigo()); //Duvida -> se tem codigo na area de update
            DatabaseUtilit.getPs().setString(1, dataPagamento);
            DatabaseUtilit.getPs().setString(2, String.valueOf(id));        
            DatabaseUtilit.getPs().executeUpdate();
            DatabaseUtilit.Desconectar();

            System.out.println("Venda atualizado com sucesso");   
        } 
        catch (SQLException ex)
        {
            System.err.println("Cliente não foi atualizado por @updateCliente\\ClienteDAO \nErro: "+ex);
        }
    }
    
    public void insert(Venda venda)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));
            //observacao, codigocliente, codigoservico, formapagamento, valorservico, datavencimento, datapagamento
            DatabaseUtilit.getPs().setString(1, venda.getObservacao());
            DatabaseUtilit.getPs().setString(2, String.valueOf(venda.getCodigoCliente()));
            DatabaseUtilit.getPs().setString(3, String.valueOf(venda.getCodigoServico()));
            DatabaseUtilit.getPs().setString(4, venda.getFormaPagamento());
            DatabaseUtilit.getPs().setString(5, String.valueOf(venda.getValorsevico()));
            DatabaseUtilit.getPs().setString(6, venda.getDataVencimento());
            DatabaseUtilit.getPs().setString(7, venda.getDataPagamento());        
            DatabaseUtilit.getPs().execute();

            System.out.println("Venda atualizado com sucesso");   
        } 
        catch (SQLException ex)
        {
            System.err.println("Cliente não foi inserido: "+ex);
        }
        finally
        {
            DatabaseUtilit.Desconectar();
        }
    }
}
