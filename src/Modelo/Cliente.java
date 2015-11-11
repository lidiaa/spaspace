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
        super.setCodigo(cod);
    }
    
    public Cliente(String cpf, String rg, String nome, String telefone, String genero)
    {
        super.setCPF(cpf);
        super.setRG(rg);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setGenero(genero);
    }
    
    
    public Cliente(int codigo, String cpf, String rg, String nome, String telefone, String genero)
    {
        super.setCodigo(codigo);
        super.setCPF(cpf);
        super.setRG(rg);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setGenero(genero);
    }
    
    
}
