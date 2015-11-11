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
            String codigo = linha.substring(0, 1);
            String dataPagamento = linha.substring(1, 1);
            
            venda.update(codigo, dataPagamento);
            
            if(counter == 10)
            {
                try 
                {
                    Thread.sleep(10);
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(ThreadArquivo.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }

        }        
    }
    
}
