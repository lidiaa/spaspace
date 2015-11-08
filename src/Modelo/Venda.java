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
    
    private int codigoVenda;
    private String Observacao;
    private int codigoCliente;
    private int codigoServico;
    private String FormaPagamento;
    private double valorsevico;
    private String DataVencimento;
    private String DataPagamento;

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public double getValorsevico() {
        return valorsevico;
    }

    public void setValorsevico(double valorsevico) {
        this.valorsevico = valorsevico;
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

    public Venda(int codigoVenda, String Observacao, int codigoCliente, int codigoServico, String FormaPagamento, double valorsevico, String DataVencimento, String DataPagamento) {
        this.codigoVenda = codigoVenda;
        this.Observacao = Observacao;
        this.codigoCliente = codigoCliente;
        this.codigoServico = codigoServico;
        this.FormaPagamento = FormaPagamento;
        this.valorsevico = valorsevico;
        this.DataVencimento = DataVencimento;
        this.DataPagamento = DataPagamento;
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
