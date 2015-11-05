/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorio;


import BancoDeDados.DatabaseUtilit;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Pessoal
 */
public class GerarRelatorio {
    
    public void gerandoRelatorio(String caminhoDoRelatorio){
        JasperPrint rel=null; //variável do tipo jasperprint iniciada como null para não dar erro.

        try{
            DatabaseUtilit.Conectar();//conexao do banco de dados - para atualização
            HashMap map = new HashMap(); //mapeador para passar valor para o parâmetro criado no select do ireport
            //nome do arquivo de relatorio
            String arquivoJasper = caminhoDoRelatorio ; //nome do arquivo que voce tenha criado. - recebido por parametro

            rel=JasperFillManager.fillReport(arquivoJasper,map,DatabaseUtilit.getCon());//coloque o nome das variaveis que voce denominou acima – arquivo.jasper/mapeador/conexao
            new JasperViewer(rel).setVisible(true);  //visualiza o relatório

        } catch (JRException e){ //ao dar erro
              e.printStackTrace();
        }
    }
    
}
