/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import BancoDeDados.VendaDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class ThreadResultadoArquivo extends Thread 
{
    private Recipient stack;
    private int total;
    
    public ThreadResultadoArquivo(Recipient rec, int total)
    {
        this.stack = rec;
        this.total = total;
    }
   
    @Override
    public void run()
    {
        for(int i =0;i<total;i++)
        {
            stack.get();
            System.out.println("Gravado");
        }       
    }
}
