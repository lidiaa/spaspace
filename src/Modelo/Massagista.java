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
public class Massagista extends Funcionario{
    private String formacao;
    private int anosExperiencia;
    private String especialidade;

    public Massagista() {
    }
    
    public Massagista(String cpf, String rg, String nome, String telefone, String genero, String cep, String nro, String formacao, int anos, String especialidade)        
    {
        cpf = super.getCPF();
        rg = super.getRG();
        nome = super.getNome();
        telefone = super.getTelefone();
        genero = super.getGenero();
        cep = super.getCep();
        nro = super.getNumeroCasa();
        formacao = this.formacao;
        anos = this.anosExperiencia;
        especialidade = this.especialidade;       
    }
    
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
