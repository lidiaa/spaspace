/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BancoDeDados.VendaDAO;

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
    private int codigoCliente;
    private int codigoServico;

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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public Venda(int Id, double Valor, String DataVencimento, String DataPagamento, String FormaPagamento, int codigoCliente, int codigoServico) {
        this.Id = Id;
        this.Valor = Valor;
        this.DataVencimento = DataVencimento;
        this.DataPagamento = DataPagamento;
        this.FormaPagamento = FormaPagamento;
        this.codigoCliente = codigoCliente;
        this.codigoServico = codigoServico;
    }
        
    public boolean inserir() throws Exception
    {
        VendaDAO vendaDAO = new VendaDAO();
        try
        {
            //vendaDAO.
            return true;
        }
        catch(Exception ex)
        {
            throw new Exception("Erro ao inserir:" + ex.getMessage());
        }
    }
    
    public Venda()
    {
        
    }
    
}
