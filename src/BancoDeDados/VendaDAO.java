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
        return "UPDATE VENDA SET DATAPAGAMENTO=?, STATUS='F' WHERE ID=?";
    }
    
    public void updateCliente(Venda venda, String dataPagamento){
    try
    {
        DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));
        
        // DatabaseUtilit.getPs().setInt(1, cliente.getCodigo()); //Duvida -> se tem codigo na area de update
        DatabaseUtilit.getPs().setString(1, dataPagamento);
        DatabaseUtilit.getPs().setString(2, String.valueOf(venda.getId()));        
        DatabaseUtilit.getPs().executeUpdate();
        
        System.out.println("Venda atualizado com sucesso");   
    } 
    catch (SQLException ex)
    {
        System.err.println("Cliente não foi atualizado por @updateCliente\\ClienteDAO \nErro: "+ex);
    }
}
}
