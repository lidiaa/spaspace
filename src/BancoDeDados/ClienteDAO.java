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

public class ClienteDAO implements BuscaEmBanco, OperacoesEmBanco{
    @Override
    public String SQLList() {
        String sql = "select cpfcliente, rgcliente, nomecliente, telefonecliente, generocliente from cliente;";
        return sql;
    }

    @Override
    public String SQLInsert() {
        String sql = "insert into cliente (codigocliente, cpfcliente, rgcliente, "
                + "nomecliente, telefonecliente, generocliente) "
                + "values (?, ?, ?, ?, ?, ?)";
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
