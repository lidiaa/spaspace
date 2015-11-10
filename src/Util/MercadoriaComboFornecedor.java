/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Pessoal
 */
public class MercadoriaComboFornecedor {
    private String key;
    private String value;

    public MercadoriaComboFornecedor(String key, String value)
    {
        this.key = key; //nome
        this.value = value; //valor do codigo
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
    
}
