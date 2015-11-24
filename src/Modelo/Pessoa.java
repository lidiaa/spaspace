/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Abstract.AbstractPessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Pessoal
 */
public class Pessoa extends AbstractPessoa {
    private int codigo;
    private String CPF;
    private String RG;
    private String telefone;
    private String nome;
    private String genero;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void details()
    {
        JOptionPane.showMessageDialog(null, 
            "Nome: " + this.nome + "\n"
            + "Sexo: " + this.genero + "\n"
            + "Telefone: " + this.telefone + "\n"
            + "CPF: " + this.CPF + "\n"
            + "RG: " + this.RG + "\n");
    }
            
    
    
}
