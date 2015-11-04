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

    @Override
    public String SQLInsert() {
        String sql = "insert into secretaria (codigosecretaria, cpfsecretaria, rgsecretaria,"
                + " nomesecretaria, telefonesecretaria, generosecretaria, cepsecretaria, "
                + "numerocasasecretaria, cargosecretaria) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        String sql = "select cpfsecretaria, rgsecretaria, nomesecretaria, telefonesecretaria, "
                + "generosecretaria, cepsecretaria, numerocasasecretaria, cargosecretaria "
                + "from secretaria";
        return sql;
    }
    
}
