/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import java.sql.*;

/**
 *
 * @author Pessoal
 */
public class DatabaseUtilit {
            
    private static Connection con; //conexao
    private static PreparedStatement ps; //envio de comandos ao banco
    private static String url = "jdbc:mysql://127.0.0.1/spaspace"; //caminho ao banco
    private static String user = "root"; //usuario do banco de dados dono do banco a ser usado no programa
    private static String psw = "jonathan159"; //senha do usuario do banco de dados
                                //jonathan159
    
    public static void Conectar()
    {
        try {
            if(con == null)
            {
                con = DriverManager.getConnection(getUrl(),user,psw);
                System.out.println("Conexão ao Banco de Dados aberta!");
            }else{
                System.out.println("Conexão ao Banco de Dados já estava aberta!");
            }
        } catch (SQLException ex) {
            System.out.println("Não se conectou ao Banco de Dados \n Erro: "+ex);
        }
    }
    
    public static void Desconectar()
    {
        try{
            con.close();
            System.out.println("Conexão ao Banco de Dados fechada!");
        }catch (SQLException ex)
        {
            System.out.println("Não conectou ao Banco de Dados \n Erro: "+ex);
        }
    }
    
    public static Connection getCon()
    {
        Conectar();
        return con;
    }

    public static String getUrl() {
      return url;
    }
    
    public static PreparedStatement getPs()
    {
        return ps;
    }
    
    public static void setPs (PreparedStatement ps)
    {
        DatabaseUtilit.ps = ps;
    }
    
    
    
    
    
    
}
