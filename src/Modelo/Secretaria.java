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
    
    public Secretaria(int codigo, String cpf, String rg, String nome, String telefone, String cep, String nro, String cargo)
    {
        codigo = super.getCodigo();
        cpf = super.getCPF();
        rg = super.getRG();
        nome = super.getNome();
        telefone = super.getTelefone();
        cep = super.getCep();
        nro = super.getNumeroCasa();
        cargo = this.cargo;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
