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
public class Fornecedor {
    private int codigo;
    private String CNPJ;
    private String nome;
    private String nomeFantasia;
    private String email;
    private String nomeResponsavel;
    private String telefone;

    public Fornecedor(String CNPJ, String nome, String nomeFantasia, String email, String nomeResponsavel, String telefone) {
        //this.codigo = codigo;
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
    }
    
    public Fornecedor(int cod)
    {
        this.codigo = cod;
    }
    
    public Fornecedor(int codigo, String CNPJ, String nome, String nomeFantasia, String email, String nomeResponsavel, String telefone) {
        this.codigo = codigo;
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
    }
    
    public Fornecedor()
    {
        
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
