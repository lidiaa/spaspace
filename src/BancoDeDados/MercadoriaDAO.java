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

    @Override
    public String SQLInsert() {
        String sql = "select from mercadoria (codigomercadoria, nomemercadoria, "
                + "codigofornecedor, descricaomercadoria, valormercadoria, quantidademercadoria) "
                + "values (?, ?, ?, ?, ?, ?)";
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
       String sql = "select select nomemercadoria, codigofornecedor, descricaomercadoria, "
               + "valormercadoria, quantidademercadoria from mercadoria";
        return sql;
    }
    
}
