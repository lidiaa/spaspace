/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class Recipient {
    
    //private List<String> linhas;
    private Map<String, Integer> linhas;
    private int counter;    
    private int processadas;
    private boolean disponivel;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getProcessadas() {
        return processadas;
    }

    public void setProcessadas(int processadas) {
        this.processadas = processadas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public synchronized void set(String linha, int result)
    {
        while(disponivel)
        {
            try
            {
                System.out.println("Aguardando...");
                wait();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        linhas.put(linha, result);
        System.out.println("Inserido no MAP...");
        disponivel = true;
        notifyAll(); 
    }
    
    public synchronized void get()
    {
        while(!disponivel)
        {
            try
            {
                System.out.println("Aguardando get...");
                wait();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        String linhaGravar;
        //chamar função de gravar em arquivo
        for (Map.Entry<String, Integer> entry : linhas.entrySet())
        {
            if(entry.getValue() == 1)
            {
                linhaGravar = "Processado - Código:" + entry.getKey();
                saveToFile(linhaGravar);
            }            
            else
            {
                linhaGravar = "Não Processado - Código:" + entry.getKey();
                saveToFile(linhaGravar);
            }
            linhas.remove(entry.getKey());
        }
        
        if(linhas.isEmpty())
        {
            disponivel = false;
            notifyAll();
        }
    }
    
    public Recipient()
    {
        disponivel = false;
        linhas = new HashMap<>();
    }
    
    private int saveToFile(String linha)
    {
        
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("SAIDA.txt", true)))) 
        {
            out.println(linha);
            out.close();
        }
        catch (IOException e) 
        {
            
        }
        finally
        {
            
        }
        return 1;
    }
    
}
