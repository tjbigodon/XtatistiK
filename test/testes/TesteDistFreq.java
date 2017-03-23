/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import java.util.ArrayList;

/**
 *
 * @author Tarcisio
 */
public class TesteDistFreq {
    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList();
        int numClasses = 0;
        valores.add(new Double(25.5));
        valores.add(new Double(23));
        valores.add(new Double(19.7));
        valores.add(new Double(23));
        valores.add(new Double(15.8));
        valores.add(new Double(16.9));
        valores.add(new Double(24.6));
        valores.add(new Double(25.5));
        valores.add(new Double(19));
        valores.add(new Double(20.1));
        valores.add(new Double(25));
        valores.add(new Double(19.2));
        valores.add(new Double(25.4));
        valores.add(new Double(23.2));
        valores.add(new Double(21.5));
        valores.add(new Double(18));
        valores.add(new Double(20.9));
        valores.add(new Double(24.3));
        valores.add(new Double(17));
        valores.add(new Double(24.5));
        
        int teste = 26;
        
        if(teste<=25){
            numClasses = 5;
        }else{
            numClasses = (int) Math.sqrt(teste);
        }
        
        System.out.println(numClasses);
    }
}
