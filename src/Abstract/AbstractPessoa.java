/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Jonathan
 */
public abstract class AbstractPessoa {
    
    //este método deve concatenar as informarções da Pessoa(Funcionario, Cliente etc)
    // e mostrar ao usuário em um JOptionPanel;
    public abstract String details();
    
    //deverá ser criada a propriedade dataNascimento, e a partir dessa data, retornar a idade 
    //para usar na função acima;
    public abstract String getIdade();  
}
