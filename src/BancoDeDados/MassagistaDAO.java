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

    @Override
    public String SQLInsert() {
       String sql = "insert into massagista (codigomassagista, cpfmassagista, rgmassagista, "
               + "nomemassagista, telefonemassagista, generomassagista, cepmassagista, "
               + "numerocasamassagista, formacaomassagista, anosexperienciamassagista, "
               + "especialidademassagista) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
       String sql = "select codigomassagista, cpfmassagista, rgmassagista, nomemassagista, "
               + "telefonemassagista, generomassagista, cepmassagista, numerocasamassagista, "
               + "formacaomassagista, anosexperienciamassagista, especialidademassagista from massagista";
        return sql;
    }
    
}
