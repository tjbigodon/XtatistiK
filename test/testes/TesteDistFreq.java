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
        ArrayList<Double> valores = new ArrayList(); //arraylist com todos os valores da amostra
        int numClasses = 0; //conterá o número de classes a aparecer na tabela
        double amplitudeClasses = 0; //conterá o valor do cálculo da amplitude de classes
        
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
        
        //condicional que calcula o número de classes
        if(valores.size()<=25){
            numClasses = 5;
        }else{
            numClasses = (int) Math.sqrt(valores.size());
        }
        
        int []freqAbs = new int[numClasses];//guardará as frequências absolutas.
        
        double maior = valores.get(0);//maior valor da amostra
        double menor = valores.get(0);//menor valor da amostra
        
        //laço que verifica qual o maior e menor valores da amostra
        for(int i = 0; i<valores.size(); i++){
            if(valores.get(i)>maior){
                maior = valores.get(i);
            } else if(valores.get(i)<menor){
                menor = valores.get(i);
            }
        }
        
        
        amplitudeClasses = ((maior - menor)/numClasses)*1.1; //cálculo da amplitude
        
        
        double []valoresIniciais = new double[numClasses];//conterá os valores iniciais das classes
        double []valoresFinais = new double[numClasses];//conterá os valores finais das classes
        
        valoresIniciais[0] = formata(menor); //valor inicial da primeira classe é o menor valor do grupo
        valoresFinais[0] = formata(menor + amplitudeClasses);
        
        //laço que preenche os valores da tabela
        for(int i = 1; i<freqAbs.length; i++){
            valoresIniciais[i] = valoresFinais[i-1];
            valoresFinais[i] = formata(valoresIniciais[i] + amplitudeClasses);
        }
        
        //calcula a frequência absoluta para colocar na tabela
        for(int i = 0; i<valoresIniciais.length; i++){
            for(int j = 0; j<valores.size(); j++){
                if(valores.get(j)>=valoresIniciais[i]&&valores.get(j)<valoresFinais[i]){
                    freqAbs[i]++;
                }
            }
        }
        
        //imprime a tabela formatada
        for(int i = 0; i<valoresIniciais.length; i++){
            System.out.print(valoresIniciais[i]+"|-----"+valoresFinais[i]);
            System.out.print("      "+freqAbs[i]);
            System.out.println("      "+formata(((freqAbs[i]*1.0)/valores.size()*100))+"%");
        }
    }
    
    //formata um double com duas casas decimais
    public static double formata(double item){
        String aux = String.format("%.2f", item); //"String.format" retorna um float, então, a função retorna um double.
        char []arrayChar = new char[aux.length()];
        
        arrayChar = aux.toCharArray();
        
        arrayChar[arrayChar.length-3] = '.';
        
        aux = String.valueOf(arrayChar);
        return Double.parseDouble(aux);
    }
}
