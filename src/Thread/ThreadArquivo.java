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
    Recipient stack = new Recipient();
    int result=0;
    
    public ThreadArquivo(Recipient rec, List<String> linhas)
    {
        this.stack = rec;
        this.linhas = linhas;
    }
    
    @Override
    public void run()
    {
        venda = new VendaDAO();
        int counter = 0;
        for(String linha : linhas)
        {   
            stack.setCounter(linhas.size());
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
                
                result = venda.update(codigo, dataPagamentoFinal);
                stack.set(codigo +" "+dataPagamento, result);
                System.out.println("Inserido");
            }
            
            
        }
        
        JOptionPane.showMessageDialog(null, "Processamento de arquivo concluído. \n Foram processados " + linhas.size() + " registros.");
    }
    
    public void setLinhas(List<String> linhas)
    {
        this.linhas = linhas;
    }
}
