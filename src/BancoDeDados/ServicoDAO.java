/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Servico; //importanto a classe que sera utilizada, informando o pacote
/**
 *
 * @author Pessoal
 */
public class ServicoDAO implements OperacoesEmBanco, BuscaEmBanco {

    @Override
    public String SQLInsert() {
        String sql = "insert into servico (codigoservico, descricaoservico, duracaoservico) values (?, ?, ?)";
        return sql;
    }

    @Override
    public String SQLUpdate() {
        String sql = "update servico set descricaoservico = ?, duracaoservico = ? where codigoservico = ?";
        return sql;
    }

    @Override
    public String SQLDelete() {
       String sql = "delete from servico where codigoservico = ?";
        return sql;
    }

    @Override
    public String SQLList() {
        String sql = "select descricaoservico, duracaoservico from servico";
        return sql;
    }
    
}
