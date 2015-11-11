/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pessoal
 */
public class Mercadoria extends Arquivo{
    private int codigoMercadoria;
    private String nomeMercadoria;
    private int codigoFornecedor;
    private String descricaoMercadoria;
    private double valorMercadoria;
    private int quantidadeMercadoria;

    public Mercadoria()
    {
        
    }
    
    public Mercadoria(int codigo)
    {
        this.codigoMercadoria = codigo;
    }
    
    public Mercadoria(String nomeMercadoria, int codigoFornecedor, String descricaoMercadoria, double valorMercadoria, int quantidadeMercadoria) {
        //this.codigoMercadoria = codigoMercadoria;
        this.nomeMercadoria = nomeMercadoria;
        this.codigoFornecedor = codigoFornecedor;
        this.descricaoMercadoria = descricaoMercadoria;
        this.valorMercadoria = valorMercadoria;
        this.quantidadeMercadoria = quantidadeMercadoria;
    }
    
    public Mercadoria(String nomeMercadoria, int codigoFornecedor, String descricaoMercadoria, double valorMercadoria, int quantidadeMercadoria, int cod) {
        this.nomeMercadoria = nomeMercadoria;
        this.codigoFornecedor = codigoFornecedor;
        this.descricaoMercadoria = descricaoMercadoria;
        this.valorMercadoria = valorMercadoria;
        this.quantidadeMercadoria = quantidadeMercadoria;
        this.codigoMercadoria = codigoMercadoria;
    }

    
    public int getCodigoMercadoria() {
        return codigoMercadoria;
    }

    public void setCodigoMercadoria(int codigoMercadoria) {
        this.codigoMercadoria = codigoMercadoria;
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getDescricaoMercadoria() {
        return descricaoMercadoria;
    }

    public void setDescricaoMercadoria(String descricaoMercadoria) {
        this.descricaoMercadoria = descricaoMercadoria;
    }

    public double getValorMercadoria() {
        return valorMercadoria;
    }

    public void setValorMercadoria(double valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
    }

    public int getQuantidadeMercadoria() {
        return quantidadeMercadoria;
    }

    public void setQuantidadeMercadoria(int quantidadeMercadoria) {
        this.quantidadeMercadoria = quantidadeMercadoria;
    }

    //Metodos abstratos - Não implementados corretamente
    @Override
    void lerArquivo() {
      /*  Path varPath = Paths.get("C:/Users/Pessoal/Documents/00 IFSP/4 Semestre/LP3/Prova P2/Spa Space/Arquivos/arquivo.txt");
        byte[] retornoArquivo = null; 
        try {
            retornoArquivo = Files.readAllBytes(varPath); //retorna um conjunto de bytes
        } catch (IOException ex) {
            Logger.getLogger(Mercadoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(new String(retornoArquivo)); //converter para String, senao ficará [B8213k&
              
              */
    }

    @Override
    void escreverArquivo() {
        
    }
    
    
    
}
