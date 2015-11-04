/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Visao.TelaInicial;
import javax.swing.JFrame;

/**
 *
 * @author Pessoal
 */
public class Principal {
    public static void main(String[] args)
    {
        Visao.TelaInicial tl = new TelaInicial();
        tl.setVisible(true);
        tl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
