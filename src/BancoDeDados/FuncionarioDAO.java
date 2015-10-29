/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Funcionario; //importanto a classe que sera utilizada, informando o pacote

/**
 *
 * @author Pessoal
 */

//Nao
public class FuncionarioDAO implements OperacoesEmBanco, BuscaEmBanco {

    @Override
    public String SQLInsert() {
       String sql = "";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "";
        return sql;
    }

    @Override
    public String SQLDelete() {
        String sql = "";
        return sql;
    }

    @Override
    public String SQLList() {
       String sql = "";
        return sql;
    }
    
}
