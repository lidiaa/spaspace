/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import BancoDeDados.VendaDAO;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ThreadArquivo extends Thread {
    
    VendaDAO venda;
    List<String> linhas; 
    @Override
    public void run()
    {
        venda = new VendaDAO();
        int counter = 0;
        for(String linha : linhas)
        {
            counter++;
            if(linha.charAt(0) == '1')
            {
                String codigo = linha.substring(70, 83);
                String dataPagamento = linha.substring(110, 117);
                String dataPagamentoFinal = String.format("%s%s/%s%s/%s%s", dataPagamento.charAt(0),
                    dataPagamento.charAt(1),
                    dataPagamento.charAt(2),
                    dataPagamento.charAt(3),
                    dataPagamento.charAt(4),
                    dataPagamento.charAt(5));


                venda.update(codigo, dataPagamentoFinal);

                if(counter == 10)
                {
                    try 
                    {
                        Thread.sleep(10);
                        System.out.println("Sleeping...");
                        counter = 0;
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(ThreadArquivo.class.getName()).log(Level.SEVERE, null, ex);
                    }               
                }   
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Processamento de arquivo concluído. \n Foram processados " + linhas.size() + " registros.");
    }
    
    public void setLinhas(List<String> linhas)
    {
        this.linhas = linhas;
    }
    
}
