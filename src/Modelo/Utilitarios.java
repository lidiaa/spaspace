/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Finalizar edicao
    Git -> Adicionar
    Git > fazer Commit
    Git > Expandir para Upstream
    Ou no git bash (dentro da pasta do spaspace3) – git push (origin master)

 * 
 *
 * @author Pessoal
 */
public class Utilitarios {
    //Métodos que podem ser chamados de todas as classes
    
    //Problemas:
    //Telas fecham ao dar enter na opção de nao sair (NAO), ao clicar se mantem normal.
    
    
    //Metodo para limpeza de todos os Campos dentro de um painel (panel)
    public static void limparCampos(Container container) {  
        Component components[] = container.getComponents();  
        for (Component component : components) {  
            if (component instanceof JFormattedTextField) {   //JFormatedTextFields - formatados
                JFormattedTextField field = (JFormattedTextField) component;  
                field.setValue(null);  
            } else if (component instanceof JTextField) {   //JTextField comum
                JTextField field = (JTextField) component;  
                field.setText("");  
            } else if (component instanceof JTextArea) {   //JTextArea
                JTextArea area = (JTextArea) component;  
                area.setText("");  
            } 
            else if (component instanceof JCheckBox) //JCheckBox
            {
                JCheckBox box = (JCheckBox) component;
                box.setSelected(false);
            }
        }  
    }  
    
    //Método que permite que o JTextField aceite apenas números
    public void apenasNumeros(KeyEvent evt)
    {
        String caracteres="0987654321"; //unicos caracteres permitidos
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }
    
    //Configuração do botão Sair em cada Tela JFrame, com confirmação
    public void fecharJanela(JFrame tela)
    {
        if(JOptionPane.showConfirmDialog(null,"Deseja Fechar?","ATENÇÃO ",javax.swing.JOptionPane.YES_NO_OPTION)==0)
        {
            tela.dispose(); //fecha 
        }
    }
    
    
}
