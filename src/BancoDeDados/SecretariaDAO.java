/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Secretaria; //importanto a classe que sera utilizada, informando o pacote

/**
 *
 * @author Pessoal
 */
public class SecretariaDAO implements OperacoesEmBanco, BuscaEmBanco {

    public void insereSecretaria (Secretaria secretaria)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));

            DatabaseUtilit.getPs().setString(1, secretaria.getCPF());
            DatabaseUtilit.getPs().setString(2, secretaria.getRG());
            DatabaseUtilit.getPs().setString(3, secretaria.getNome());
            DatabaseUtilit.getPs().setString(4, secretaria.getTelefone());
            DatabaseUtilit.getPs().setString(5, secretaria.getGenero());
            DatabaseUtilit.getPs().setString(6, secretaria.getCep());
            DatabaseUtilit.getPs().setString(7, secretaria.getNumeroCasa());
            DatabaseUtilit.getPs().setString(8, secretaria.getCargo());
            
            
            DatabaseUtilit.getPs().execute();
            System.out.println("Funcionario de Secretaria cadastrado com sucesso");

        } catch (SQLException ex)
        {
            System.err.println("Funcionario Secretaria não foi cadastrado "
                    + "por @insertSecretaria\\SecretariaDAO \nErro: "+ex);
        } 
    }
    
    public void updateSecretaria (Secretaria secretaria)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));
            
            DatabaseUtilit.getPs().setString(1, secretaria.getCPF());
            DatabaseUtilit.getPs().setString(2, secretaria.getRG());
            DatabaseUtilit.getPs().setString(3, secretaria.getNome());
            DatabaseUtilit.getPs().setString(4, secretaria.getTelefone());
            DatabaseUtilit.getPs().setString(5, secretaria.getGenero());
            DatabaseUtilit.getPs().setString(6, secretaria.getCep());
            DatabaseUtilit.getPs().setString(7, secretaria.getNumeroCasa());
            DatabaseUtilit.getPs().setString(8, secretaria.getCargo());
            DatabaseUtilit.getPs().setInt(9, secretaria.getCodigo()); 
           
            DatabaseUtilit.getPs().executeUpdate();

            System.out.println("Secretaria atualizado com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Secretaria não foi atualizado por @updateSecretaria\\SecretariaDAO \nErro: "+ex);
        }
    }
    
    public void deleteSecretaria (Secretaria secretaria)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLDelete()));

            DatabaseUtilit.getPs().setInt(1, secretaria.getCodigo()); 

            DatabaseUtilit.getPs().executeUpdate();
            System.out.println("Secretaria removido com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Secretaria não foi removido por @deleteSecretaria\\SecretariaDAO \nErro: "+ex);
        }
    }
    
    public List<Secretaria> listarTodasSecretarias ()
    {
        List<Secretaria> listaSecretaria = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLList()));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    
                    Secretaria tempSecretaria = new Secretaria();
                    tempSecretaria.setCodigo(rs.getInt(1));
                    tempSecretaria.setCPF(rs.getString(2));
                    tempSecretaria.setRG(rs.getString(3));
                    tempSecretaria.setNome(rs.getString(4));
                    tempSecretaria.setTelefone(rs.getString(5));
                    tempSecretaria.setGenero(rs.getString(6));
                    tempSecretaria.setCep(rs.getString(7));
                    tempSecretaria.setNumeroCasa(rs.getString(8));
                    tempSecretaria.setCargo(rs.getString(9));
                    
                    listaSecretaria.add(tempSecretaria);
                    
                }
                return listaSecretaria;
            }
        } catch(SQLException ex)
        {
            System.err.println("Secretaria não foi consultado \nErro: "+ex);
        }
        
        return null;
    }
    
    public List<Secretaria> listarTodasSecretariasLike (String Like) //polimorfismo
    {
        List<Secretaria> listaSecretaria = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    Secretaria tempSecretaria = new Secretaria();
                    tempSecretaria.setCodigo(rs.getInt(1));
                    tempSecretaria.setCPF(rs.getString(2));
                    tempSecretaria.setRG(rs.getString(3));
                    tempSecretaria.setNome(rs.getString(4));
                    tempSecretaria.setTelefone(rs.getString(5));
                    tempSecretaria.setGenero(rs.getString(6));
                    tempSecretaria.setCep(rs.getString(7));
                    tempSecretaria.setNumeroCasa(rs.getString(8));
                    tempSecretaria.setCargo(rs.getString(9));
                    
                    listaSecretaria.add(tempSecretaria);
                    
                }
                return listaSecretaria;
            }
        } catch(SQLException ex)
        {
            System.err.println("Secretaria não foi consultado \nErro: "+ex);
        }
        
        return null;
    }
    
        public List<Secretaria> listarTodasSecretariasLike (int Like) //polimorfismo
    {
        List<Secretaria> listaSecretaria = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    
                    Secretaria tempSecretaria = new Secretaria();
                    tempSecretaria.setCodigo(rs.getInt(1));
                    tempSecretaria.setCPF(rs.getString(2));
                    tempSecretaria.setRG(rs.getString(3));
                    tempSecretaria.setNome(rs.getString(4));
                    tempSecretaria.setTelefone(rs.getString(5));
                    tempSecretaria.setGenero(rs.getString(6));
                    tempSecretaria.setCep(rs.getString(7));
                    tempSecretaria.setNumeroCasa(rs.getString(8));
                    tempSecretaria.setCargo(rs.getString(9));
                    
                    listaSecretaria.add(tempSecretaria);
                    
                }
                return listaSecretaria;
            }
        } catch(SQLException ex)
        {
            System.err.println("Secretaria não foi consultado \nErro: "+ex);
        }
        
        return null;
    }

    
    @Override
    public String SQLInsert() {
        String sql = "insert into secretaria (cpfsecretaria, rgsecretaria,"
                + " nomesecretaria, telefonesecretaria, generosecretaria, cepsecretaria, "
                + "numerocasasecretaria, cargosecretaria) values (?, ?, ?, ?, ?, ?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update secretaria set cpfsecretaria = ?, rgsecretaria = ?, nomesecretaria = ?, "
                + "telefonesecretaria = ?, generosecretaria = ?, cepsecretaria = ?, numerocasasecretaria = ?, "
                + "cargosecretaria = ? where codigosecretaria = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
        String sql = "delete from secretaria where codigosecretaria = ?";
        return sql;
    }

    @Override
    public String SQLList() {
        String sql = "select * from secretaria";
        /* 
            select cpfsecretaria, rgsecretaria, nomesecretaria, telefonesecretaria, "
                + "generosecretaria, cepsecretaria, numerocasasecretaria, cargosecretaria "
                + "from secretaria
        */
        return sql;
    }

    @Override
    public String SQLListLike(String Like) { //polimorfismo
        String sql = "select * from secretaria where nomesecretaria like "+Like+" ";
        return sql;
    }

    @Override
    public String SQLListLike(int Like) { //polimorfismo
        String sql = "select * from secretaria where codigosecretaria = "+Like+" ";
        return sql;
    }
    
}
