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
public class Cliente extends Pessoa { 

    public Cliente() {
    }
    
    public Cliente(int cod) {
        cod = super.getCodigo();
    }
    
    public Cliente(String cpf, String rg, String nome, String telefone, String genero)
    {
        cpf = super.getCPF();
        rg = super.getRG();
        nome = super.getNome();
        telefone = super.getTelefone();
        genero = super.getGenero();
    }
    
    
    public Cliente(int codigo, String cpf, String rg, String nome, String telefone, String genero)
    {
        codigo = super.getCodigo();
        cpf = super.getCPF();
        rg = super.getRG();
        nome = super.getNome();
        telefone = super.getTelefone();
        genero = super.getGenero();
    }
    
    
}
