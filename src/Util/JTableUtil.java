/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Modelo.VendaModelo;
import Visao.FrmVisualizarVenda;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Jonathan
 */
public class JTableUtil 
{
    //Encontrar uma forma de fazer esta função genérica
    /*
    public void ConfiguraTabela(Class model)
    {
        model = new VendaModelo();
        try 
        {
            model.fillingRows();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(FrmVisualizarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtVenda.setModel(model);
    }
    */
    
    public static void ConfiguraTabelaColunas(JTable jt)
    {
        jt.getColumnModel().getColumn(0).setPreferredWidth(52);
        jt.getColumnModel().getColumn(1).setPreferredWidth(118);
        jt.getColumnModel().getColumn(2).setPreferredWidth(118);    
    }
}
