/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Massagista; //importanto a classe que sera utilizada, informando o pacote

/**
 *
 * @author Pessoal
 */
public class MassagistaDAO implements OperacoesEmBanco, BuscaEmBanco{

    public void insereMassagista (Massagista massagista)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLInsert()));

            //DatabaseUtilit.getPs().setInt(1, massagista.getCodigo()); 
            DatabaseUtilit.getPs().setString(1, massagista.getCPF());
            DatabaseUtilit.getPs().setString(2, massagista.getRG());
            DatabaseUtilit.getPs().setString(3, massagista.getNome());
            DatabaseUtilit.getPs().setString(4, massagista.getTelefone());
            DatabaseUtilit.getPs().setString(5, massagista.getGenero());
            DatabaseUtilit.getPs().setString(6, massagista.getCep());
            DatabaseUtilit.getPs().setString(7, massagista.getNumeroCasa());
            DatabaseUtilit.getPs().setString(8, massagista.getFormacao());
            DatabaseUtilit.getPs().setInt(9, massagista.getAnosExperiencia());
            DatabaseUtilit.getPs().setString(10, massagista.getEspecialidade());
            
            DatabaseUtilit.getPs().execute();
            System.out.println("Funcionario cadastrado com sucesso");

        } catch (SQLException ex)
        {
            System.err.println("Funcionario não foi cadastrado por @insertMassagista\\MassagistaeDAO \nErro: "+ex);
        }
    }
    
    public void updateMassagista (Massagista massagista)
    {
        try
        {
           DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLUpdate()));
           
            DatabaseUtilit.getPs().setString(1, massagista.getCPF());
            DatabaseUtilit.getPs().setString(2, massagista.getRG());
            DatabaseUtilit.getPs().setString(3, massagista.getNome());
            DatabaseUtilit.getPs().setString(4, massagista.getTelefone());
            DatabaseUtilit.getPs().setString(5, massagista.getGenero());
            DatabaseUtilit.getPs().setString(6, massagista.getCep());
            DatabaseUtilit.getPs().setString(7, massagista.getNumeroCasa());
            DatabaseUtilit.getPs().setString(8, massagista.getFormacao());
            DatabaseUtilit.getPs().setInt(9, massagista.getAnosExperiencia());
            DatabaseUtilit.getPs().setString(10, massagista.getEspecialidade());
            DatabaseUtilit.getPs().setInt(11, massagista.getCodigo()); 
        
           DatabaseUtilit.getPs().executeUpdate();

           System.out.println("Funcionario Massagista atualizado com sucesso");   
       } catch (SQLException ex)
       {
           System.err.println("Massagista não foi atualizado por @updateMassagista\\MassagistaDAO \nErro: "+ex);
       }   
    }
    
    public void deleteMassagista (Massagista massagista)
    {
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLDelete()));

            DatabaseUtilit.getPs().setInt(1, massagista.getCodigo()); 
            
            DatabaseUtilit.getPs().executeUpdate();
            System.out.println("Massagista removido com sucesso");   
        } catch (SQLException ex)
        {
            System.err.println("Massagista não foi removido por @deleteMassagista\\MassagistaDAO \nErro: "+ex);
        }
    }
    
    
    public List<Massagista> listarTodosMassagistas ()
    {
        List<Massagista> listaMassagista = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLList()));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    
                    Massagista tempMassagista = new Massagista();
                    tempMassagista.setCodigo(rs.getInt(1));
                    tempMassagista.setCPF(rs.getString(2));
                    tempMassagista.setRG(rs.getString(3));
                    tempMassagista.setNome(rs.getString(4));
                    tempMassagista.setTelefone(rs.getString(5));
                    tempMassagista.setGenero(rs.getString(6));
                    tempMassagista.setCep(rs.getString(7));
                    tempMassagista.setNumeroCasa(rs.getString(8));
                    tempMassagista.setFormacao(rs.getString(9));
                    tempMassagista.setAnosExperiencia(rs.getInt(10));
                    tempMassagista.setEspecialidade(rs.getString(11));
                    
                    listaMassagista.add(tempMassagista);
                    
                }
                return listaMassagista;
            }
        } catch(SQLException ex)
        {
            System.err.println("Massagista não foi consultado \nErro: "+ex);
        }
        return null;
    }
    
    public List<Massagista> listarTodosMassagistasLike (String Like)
    {
        List<Massagista> listaMassagista = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    
                    Massagista tempMassagista = new Massagista();
                    tempMassagista.setCodigo(rs.getInt(1));
                    tempMassagista.setCPF(rs.getString(2));
                    tempMassagista.setRG(rs.getString(3));
                    tempMassagista.setNome(rs.getString(4));
                    tempMassagista.setTelefone(rs.getString(5));
                    tempMassagista.setGenero(rs.getString(6));
                    tempMassagista.setCep(rs.getString(7));
                    tempMassagista.setNumeroCasa(rs.getString(8));
                    tempMassagista.setFormacao(rs.getString(9));
                    tempMassagista.setAnosExperiencia(rs.getInt(10));
                    tempMassagista.setEspecialidade(rs.getString(11));
                    
                    listaMassagista.add(tempMassagista);
                    
                }
                return listaMassagista;
            }
        } catch(SQLException ex)
        {
            System.err.println("Massagista não foi consultado \nErro: "+ex);
        }
        return null;
    }
    
    public List<Massagista> listarTodosMassagistasLike (int Like) //polimorfismo
    {
        List<Massagista> listaMassagista = new ArrayList<>();
        try
        {
            DatabaseUtilit.setPs(DatabaseUtilit.getCon().prepareStatement(SQLListLike(Like)));

            ResultSet rs = DatabaseUtilit.getPs().executeQuery();

            if(rs != null){
                while(rs.next())
                {
                    
                    Massagista tempMassagista = new Massagista();
                    tempMassagista.setCodigo(rs.getInt(1));
                    tempMassagista.setCPF(rs.getString(2));
                    tempMassagista.setRG(rs.getString(3));
                    tempMassagista.setNome(rs.getString(4));
                    tempMassagista.setTelefone(rs.getString(5));
                    tempMassagista.setGenero(rs.getString(6));
                    tempMassagista.setCep(rs.getString(7));
                    tempMassagista.setNumeroCasa(rs.getString(8));
                    tempMassagista.setFormacao(rs.getString(9));
                    tempMassagista.setAnosExperiencia(rs.getInt(10));
                    tempMassagista.setEspecialidade(rs.getString(11));
                    
                    listaMassagista.add(tempMassagista);
                    
                }
                return listaMassagista;
            }
        } catch(SQLException ex)
        {
            System.err.println("Massagista não foi consultado \nErro: "+ex);
        }
        return null;
    }
    
    
    @Override
    public String SQLInsert() {
       String sql = "insert into massagista (cpfmassagista, rgmassagista, "
               + "nomemassagista, telefonemassagista, generomassagista, cepmassagista, "
               + "numerocasamassagista, formacaomassagista, anosexperienciamassagista, "
               + "especialidademassagista) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update massagista set cpfmassagista = ?, rgmassagista = ?, nomemassagista = ?, "
                + "telefonemassagista = ?, generomassagista = ?, cepmassagista = ?, "
                + "numerocasamassagista = ?, formacaomassagista = ?, anosexperienciamassagista = ?, "
                + "especialidademassagista = ? where codigomassagista = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
        String sql = "delete from massagista where codigomassagista = ?";
        return sql;
    }

    @Override
    public String SQLList() {
       String sql = "select * from massagista";
       /* 
                select codigomassagista, cpfmassagista, rgmassagista, nomemassagista, "
               + "telefonemassagista, generomassagista, cepmassagista, numerocasamassagista, "
               + "formacaomassagista, anosexperienciamassagista, especialidademassagista from massagista
       */
        return sql;
    }

    @Override
    public String SQLListLike(String Like) { //polimorfismo
        String sql = "select * from massagista where nomemassagista like "+Like+" ";
        return sql;
    }

    @Override
    public String SQLListLike(int Like) { //polimorfismo
        String sql = "select * from massagista where codigomassagista like "+Like+" ";
        return sql;
    }
    
}
