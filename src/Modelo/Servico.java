/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pessoal
 */
public class Servico {
    private int codigoServico;
    private String nomeServico;
    private String descricaoServico;
    private int duracaoMinutosServico;
    private double valorServico;

    public Servico()
    {
        
    }
    
    public Servico(int codigoServico, String nomeServico, String descricaoServico, int duracaoMinutosServico) {
        this.codigoServico = codigoServico;
        this.nomeServico = nomeServico;
        this.descricaoServico = descricaoServico;
        this.duracaoMinutosServico = duracaoMinutosServico;
    }

    
    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public int getDuracaoMinutosServico() {
        return duracaoMinutosServico;
    }

    public void setDuracaoMinutosServico(int duracaoMinutosServico) {
        this.duracaoMinutosServico = duracaoMinutosServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }
    
}
