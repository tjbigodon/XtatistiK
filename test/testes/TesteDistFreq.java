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
        double amplitudeClasses = 0;
        
        valores.add(new Double(89));
        valores.add(new Double(85));
        valores.add(new Double(93));
        valores.add(new Double(81));
        valores.add(new Double(77));
        valores.add(new Double(83));
        valores.add(new Double(87));
        valores.add(new Double(81));
        valores.add(new Double(83));
        valores.add(new Double(89));
        valores.add(new Double(81));
        valores.add(new Double(86));
        valores.add(new Double(80));
        valores.add(new Double(84));
        valores.add(new Double(82));
        
        
        if(valores.size()<=25){
            numClasses = 5;
        }else{
            numClasses = (int) Math.sqrt(valores.size());
        }
        
        int []freqAbs = new int[numClasses];
        
        double maior = valores.get(0);
        double menor = valores.get(0);
        
        for(int i = 0; i<valores.size(); i++){
            if(valores.get(i)>maior){
                maior = valores.get(i);
            } else if(valores.get(i)<menor){
                menor = valores.get(i);
            }
        }
        
        amplitudeClasses = ((maior - menor)/numClasses)*1.1;
        
        double []valoresIniciais = new double[numClasses];
        double []valoresFinais = new double[numClasses];
        
        valoresIniciais[0] = formata(menor);
        valoresFinais[0] = formata(menor + amplitudeClasses);
        
        
        for(int i = 1; i<freqAbs.length; i++){
            valoresIniciais[i] = valoresFinais[i-1];
            valoresFinais[i] = formata(valoresIniciais[i] + amplitudeClasses);
        }
        
        for(int i = 0; i<valoresIniciais.length; i++){
            for(int j = 0; j<valores.size(); j++){
                if(valores.get(j)>=valoresIniciais[i]&&valores.get(j)<valoresFinais[i]){
                    freqAbs[i]++;
                }
            }
        }
        
        for(int i = 0; i<valoresIniciais.length; i++){
            System.out.print(valoresIniciais[i]+"|-----"+valoresFinais[i]);
            System.out.print("      "+freqAbs[i]);
            System.out.println("      "+formata(((freqAbs[i]*1.0)/valores.size()*100))+"%");
        }
    }
    
    public static double formata(double item){
        String aux = String.format("%.2f", item);
        char []arrayChar = new char[aux.length()];
        
        arrayChar = aux.toCharArray();
        
        arrayChar[arrayChar.length-3] = '.';
        
        aux = String.valueOf(arrayChar);
        return Double.parseDouble(aux);
    }
}
