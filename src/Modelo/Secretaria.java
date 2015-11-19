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
public class Secretaria extends Funcionario{
    private String cargo;
    
    public Secretaria(){
    }
    
    public Secretaria (int cod)
    {
        super.setCodigo(cod);
    }
    
    public Secretaria(String cpf, String rg, String nome, String telefone, String genero, String cep, String nro, String cargo)
    {
        super.setCPF(cpf);
        super.setRG(rg);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setGenero(genero);
        super.setCep(cep);
        super.setNumeroCasa(nro);
        this.cargo = cargo;
    }
    
    public Secretaria(int codigo, String cpf, String rg, String nome, String telefone, String genero, String cep, String nro, String cargo)
    {
        super.setCodigo(codigo);
        super.setCPF(cpf);
        super.setRG(rg);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setGenero(genero);
        super.setCep(cep);
        super.setNumeroCasa(nro);
        this.cargo = cargo; 
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
