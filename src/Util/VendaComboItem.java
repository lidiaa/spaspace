/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Jonathan
 */
public class VendaComboItem
{
    private String key;
    private String value;
    private String valor;

    public VendaComboItem(String key, String value, String valor)
    {
        this.key = key;
        this.value = value;
        this.valor = valor;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
    
    public String getValor()
    {
        return valor;
    }
}
