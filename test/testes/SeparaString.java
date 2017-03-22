/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.AmostraQuantitativa;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jehym
 */
public class SeparaString {
    public static void main(String[] args) {
        String nomeAmostra = JOptionPane.showInputDialog(null, "Nome da Amostra");
        AmostraQuantitativa nAmostra = new AmostraQuantitativa();
        String valores;
        valores = JOptionPane.showInputDialog(null, "Digite os valores:");
        
        String[] amostra = valores.split(Pattern.quote(";"));
        
        for(int i = 0; i < amostra.length; i++){
            nAmostra.insereAmostra(Double.parseDouble(amostra[i]));
            System.out.println(amostra[i]);
        }
        nAmostra.setNomeAmostra(nomeAmostra);
        
        System.out.println(nAmostra.getNomeAmostra()+" = "+ nAmostra.mostrarAmostra());
        
    }
}
