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
    
    public Massagista(int cod)
    {
        super.setCodigo(cod);
    }
    
    public Massagista(String cpf, String rg, String nome, String telefone, String genero, String cep, String nro, String formacao, int anos, String especialidade)        
    {
        super.setCPF(cpf);
        super.setRG(rg);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setGenero(genero);
        super.setCep(cep);
        super.setNumeroCasa(nro);
        this.formacao = formacao;
        this.anosExperiencia = anos;
        this.especialidade = especialidade;
    }
    
    public Massagista(int cod, String cpf, String rg, String nome, String telefone, String genero, String cep, String nro, String formacao, int anos, String especialidade)        
    {
        super.setCodigo(cod);
        super.setCPF(cpf);
        super.setRG(rg);
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setGenero(genero);
        super.setCep(cep);
        super.setNumeroCasa(nro);
        this.formacao = formacao;
        this.anosExperiencia = anos;
        this.especialidade = especialidade;
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
