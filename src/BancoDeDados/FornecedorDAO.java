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

    @Override
    public String SQLInsert() {
        String sql = "insert into fornecedor (codigofornecedor, CNPJ, nome, nomefantasia, "
                + "email, nomeresponsavel, telefone) values (?, ?, ?, ?, ?, ?, ?)";
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
        String sql = "select codigofornecedor, CNPJ, nome, nomefantasia, email, nomeresponsavel,telefone from fornecedor";
        return sql;
    }
    
}
