/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Fornecedor; //importanto a classe que sera utilizada, informando o pacote

/**
 *
 * @author Pessoal
 */
public class FornecedorDAO implements OperacoesEmBanco, BuscaEmBanco {

    public void insereFornecedor (Fornecedor fornecedor)
    {
        try
        {
           DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));

           DatabaseUtilit.getPs().setString(1, fornecedor.getCNPJ()); 
           DatabaseUtilit.getPs().setString(2, fornecedor.getNome()); 
           DatabaseUtilit.getPs().setString(3, fornecedor.getNomeFantasia()); 
           DatabaseUtilit.getPs().setString(4, fornecedor.getEmail()); 
           DatabaseUtilit.getPs().setString(5, fornecedor.getNomeResponsavel()); 
           DatabaseUtilit.getPs().setString(6, fornecedor.getTelefone()); 
           

           DatabaseUtilit.getPs().execute();
           System.out.println("Fornecedor cadastrado com sucesso");
           DatabaseUtilit.Desconectar();

       } catch (SQLException ex)
       {
           System.err.println("Fornecedor não foi cadastrado por @insertFornecedor\\FornecedorDAO \nErro: "+ex);
       }
    }
    
    public void updateFornecedor (Fornecedor fornecedor)
    {
        try
        {
           DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));
           
           DatabaseUtilit.getPs().setString(1, fornecedor.getCNPJ()); 
           DatabaseUtilit.getPs().setString(2, fornecedor.getNome()); 
           DatabaseUtilit.getPs().setString(3, fornecedor.getNomeFantasia()); 
           DatabaseUtilit.getPs().setString(4, fornecedor.getEmail()); 
           DatabaseUtilit.getPs().setString(5, fornecedor.getNomeResponsavel()); 
           DatabaseUtilit.getPs().setString(6, fornecedor.getTelefone()); 
           DatabaseUtilit.getPs().setInt(7, fornecedor.getCodigo()); 

            DatabaseUtilit.getPs().executeUpdate();
            System.out.println("Fornecedor atualizado com sucesso");   
            DatabaseUtilit.Desconectar();
            
        } catch (SQLException ex)
        {
            System.err.println("Fornecedor não foi atualizado por @updateFornecedor\\FornecedorDAO \nErro: "+ex);
        }
    }
    
    public void deleteFornecedor(Fornecedor fornecedor)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLDelete()));

            DatabaseUtilit.getPs().setInt(1, fornecedor.getCodigo()); 

            DatabaseUtilit.getPs().executeUpdate();
            System.out.println("Fornecedor removido com sucesso");   
            DatabaseUtilit.Desconectar();
        } catch (SQLException ex)
        {
            System.err.println("Fornecedor não foi removido por @deleteFornecedor\\FornecedorDAO \nErro: "+ex);
        }
    }
    
    public List<Fornecedor> listarTodosFornecedores()
    {
        List<Fornecedor> listaFornecedor = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLList()));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    Fornecedor tempFornecedor = new Fornecedor();
                    tempFornecedor.setCodigo(rs.getInt(1));
                    tempFornecedor.setCNPJ(rs.getString(2));
                    tempFornecedor.setNome(rs.getString(3));
                    tempFornecedor.setNomeFantasia(rs.getString(4));
                    tempFornecedor.setEmail(rs.getString(5));
                    tempFornecedor.setNomeResponsavel(rs.getString(6));
                    tempFornecedor.setTelefone(rs.getString(7));
                    listaFornecedor.add(tempFornecedor);
                }
                return listaFornecedor;
            }
        } catch(SQLException ex)
        {
            System.err.println("Fornecedor não foi consultado \nErro: "+ex);
        }    
        DatabaseUtilit.Desconectar();
        return null;
    }
    
    public List<Fornecedor> listarTodosFornecedoresLike(String Like) //polimorfismo
    {
        List<Fornecedor> listaFornecedor = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    Fornecedor tempFornecedor = new Fornecedor();
                    tempFornecedor.setCodigo(rs.getInt(1));
                    tempFornecedor.setCNPJ(rs.getString(2));
                    tempFornecedor.setNome(rs.getString(3));
                    tempFornecedor.setNomeFantasia(rs.getString(4));
                    tempFornecedor.setEmail(rs.getString(5));
                    tempFornecedor.setNomeResponsavel(rs.getString(6));
                    tempFornecedor.setTelefone(rs.getString(7));
                    listaFornecedor.add(tempFornecedor);
                }
                return listaFornecedor;
            }
        } catch(SQLException ex)
        {
            System.err.println("Fornecedor não foi consultado \nErro: "+ex);
        }    
        DatabaseUtilit.Desconectar();
        return null;
    }
    
    public List<Fornecedor> listarTodosFornecedoresLike(int Like) //polimorfismo
    {
        List<Fornecedor> listaFornecedor = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    Fornecedor tempFornecedor = new Fornecedor();
                    tempFornecedor.setCodigo(rs.getInt(1));
                    tempFornecedor.setCNPJ(rs.getString(2));
                    tempFornecedor.setNome(rs.getString(3));
                    tempFornecedor.setNomeFantasia(rs.getString(4));
                    tempFornecedor.setEmail(rs.getString(5));
                    tempFornecedor.setNomeResponsavel(rs.getString(6));
                    tempFornecedor.setTelefone(rs.getString(7));
                    listaFornecedor.add(tempFornecedor);
                }
                return listaFornecedor;
            }
        } catch(SQLException ex)
        {
            System.err.println("Fornecedor não foi consultado \nErro: "+ex);
        }    
        DatabaseUtilit.Desconectar();
        return null;
    }
    
    @Override
    public String SQLInsert() {
        String sql = "insert into fornecedor (cnpj, nome, nomefantasia, "
                + "email, nomeresponsavel, telefone) values (?, ?, ?, ?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update fornecedor set CNPJ = ?, nome = ?, nomefantasia = ?, "
                + "email = ?, nomeresponsavel = ?, telefone = ? where codigofornecedor = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
        String sql = "delete from fornecedor where codigofornecedor = ?";
        return sql;
    }

    @Override
    public String SQLList() {
        String sql = "select * from fornecedor";
        //select codigofornecedor, CNPJ, nome, nomefantasia, email, nomeresponsavel,telefone from fornecedor
        return sql;
    }

    @Override
    public String SQLListLike(String Like) {
        String sql = "select * from fornecedor where nomefantasia like "+Like+" ";
        return sql;
    }

    @Override
    public String SQLListLike(int Like) {
        String sql = "select * from fornecedor where codigofornecedor = "+Like+" ";
        return sql;
    }
    
}
