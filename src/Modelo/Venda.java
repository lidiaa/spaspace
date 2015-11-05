/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class Venda {
    
    private int Id;
    private double Valor;
    private String DataVencimento;
    private String DataPagamento;
    private String FormaPagamento;
    private Cliente Cliente;
    private Servico Servico;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    public String getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(String DataPagamento) {
        this.DataPagamento = DataPagamento;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Servico getServico() {
        return Servico;
    }

    public void setServico(Servico Servico) {
        this.Servico = Servico;
    }

    public Venda(int Id, double Valor, String DataVencimento, String DataPagamento, String FormaPagamento, Cliente Cliente, Servico Servico) {
        this.Id = Id;
        this.Valor = Valor;
        this.DataVencimento = DataVencimento;
        this.DataPagamento = DataPagamento;
        this.FormaPagamento = FormaPagamento;
        this.Cliente = Cliente;
        this.Servico = Servico;
    }
    
    public Venda()
    {
        
    }
    
}
