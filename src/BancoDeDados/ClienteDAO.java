/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

/*Fazer os imports:*/
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Cliente; //importanto a classe que sera utilizada, informando o pacote
import javax.swing.JOptionPane;

public class ClienteDAO implements BuscaEmBanco, OperacoesEmBanco{
    
    public void insertCliente(Cliente cliente)
    {   
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));

            //DatabaseUtilit.getPs().setInt(1, cliente.getCodigo());  - pensar sobre esse codigo autoincremet
            DatabaseUtilit.getPs().setString(1, cliente.getCPF());
            DatabaseUtilit.getPs().setString(2, cliente.getRG());
            DatabaseUtilit.getPs().setString(3, cliente.getNome());
            DatabaseUtilit.getPs().setString(4, cliente.getTelefone());
            DatabaseUtilit.getPs().setString(5, cliente.getGenero());

            DatabaseUtilit.getPs().execute();
            System.out.println("Cliente cadastrado com sucesso");

        } catch (SQLException ex)
        {
            System.err.println("Cliente não foi cadastrado por @insertCliente\\ClienteDAO \nErro: "+ex);
        }
}
   
 
    public void updateCliente(Cliente cliente){
    try
    {
        DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));
        
        // DatabaseUtilit.getPs().setInt(1, cliente.getCodigo()); //Duvida -> se tem codigo na area de update
        DatabaseUtilit.getPs().setString(1, cliente.getCPF());
        DatabaseUtilit.getPs().setString(2, cliente.getRG());
        DatabaseUtilit.getPs().setString(3, cliente.getNome());
        DatabaseUtilit.getPs().setString(4, cliente.getTelefone());
        DatabaseUtilit.getPs().setString(5, cliente.getGenero());
        
        DatabaseUtilit.getPs().executeUpdate();
        
        System.out.println("Cliente atualizado com sucesso");   
    } catch (SQLException ex)
    {
        System.err.println("Cliente não foi atualizado por @updateCliente\\ClienteDAO \nErro: "+ex);
    }
}
    
    public void deleteCliente(Cliente cliente){
    try
    {
        DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLDelete()));
        
        DatabaseUtilit.getPs().setInt(1, cliente.getCodigo());
        
        DatabaseUtilit.getPs().executeUpdate();
        System.out.println("Cliente removido com sucesso");   
    } catch (SQLException ex)
    {
        System.err.println("Cliente não foi removido por @deleteCliente\\ClienteDAO \nErro: "+ex);
    }
}
    
    public List<Cliente> listarTodosClientes(){
    List<Cliente> listaCliente = new ArrayList<>();
    try
    {
        DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLList()));
        
        ResultSet rs = DatabaseUtilit.getPs().executeQuery();
        
        if(rs != null){
            while(rs.next())
            {
                //cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente
                Cliente tempCliente = new Cliente();
                tempCliente.setCodigo(Integer.valueOf(rs.getString(1)));
                tempCliente.setCPF(rs.getString(2));
                tempCliente.setRG(rs.getString(3));
                tempCliente.setNome(rs.getString(4));
                tempCliente.setTelefone(rs.getString(5));
                tempCliente.setGenero(rs.getString(6));
                listaCliente.add(tempCliente);
            }
            return listaCliente;
        }
    } catch(SQLException ex)
    {
        System.err.println("Cliente não foi consultado \nErro: "+ex);
    }
    return null;
}

    public List<Cliente> listarTodosClientesLike(String Like){ //polimorfismo
        List<Cliente> listaCliente = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    //cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente
                    Cliente tempCliente = new Cliente();
                    tempCliente.setCodigo(Integer.valueOf(rs.getString(1)));
                    tempCliente.setCPF(rs.getString(2));
                    tempCliente.setRG(rs.getString(3));
                    tempCliente.setNome(rs.getString(4));
                    tempCliente.setTelefone(rs.getString(5));
                    tempCliente.setGenero(rs.getString(6));
                    listaCliente.add(tempCliente);
                }
                return listaCliente;
            }
            } catch(SQLException ex){
                System.err.println("Cliente não foi consultado \nErro: "+ex);
            }
        return null;
    }
    
    public List<Cliente> listarTodosClientesLike(int Like){ //polimorfismo
        List<Cliente> listaCliente = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    //cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente
                    Cliente tempCliente = new Cliente();
                    tempCliente.setCodigo(Integer.valueOf(rs.getString(1)));
                    tempCliente.setCPF(rs.getString(2));
                    tempCliente.setRG(rs.getString(3));
                    tempCliente.setNome(rs.getString(4));
                    tempCliente.setTelefone(rs.getString(5));
                    tempCliente.setGenero(rs.getString(6));
                    listaCliente.add(tempCliente);
                }
                return listaCliente;
            }
            } catch(SQLException ex){
                System.err.println("Cliente não foi consultado \nErro: "+ex);
            }
        return null;
    }
    
    
    
    @Override
    public String SQLList() {
        String sql = "select codigocliente, cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente";
        //select cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente
        return sql;
    }
    
    @Override
    public String SQLListLike(String busca) { //polimorfismo
       String sql = "select codigocliente, cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente where nomecliente like "+busca+" ";
        return sql;
     }
    
    @Override
    public String SQLListLike(int busca) { //polimorfismo
       String sql = "select codigocliente, cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente where codigocliente = "+busca+" ";
       System.out.println("Seu SQL codigo está como: "+sql);
        return sql;
     }
    
    
    @Override
    public String SQLInsert() {
        String sql = "insert into cliente (cpfcliente, rgcliente, "
                + "nomecliente, telefonecliente, generocliente) "
                + "values (?, ?, ?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update cliente set cpfcliente = ?, rgcliente = ?, "
                + "nomecliente = ?, telefonecliente = ?, generocliente = ? "
                + "where codigocliente = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
        String sql = "delete from cliente where codigocliente = ?";
        return sql;
    }
 
}
