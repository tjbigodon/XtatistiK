/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.util.ArrayList;

/**
 *
 * @author Tarcisio
 */
public class AnovaOneWay {

    public static void main(String[] args) {
        String amostrasConcat = "11,20,18 1,6,4 21,13,13 14,5,7 ";

        AnovaOneWay aow = new AnovaOneWay();
        System.out.println(aow.calculaF(amostrasConcat));
    }

    /**
     * Calcula o valor de F, para posteriormente comparar com o F tabelado.
     *
     * @param amostraConcat tratamentos concatenados em uma String;
     * @return o valor de F calculado
     */
    public double calculaF(String amostraConcat) {
        double glTotal = 0;
        double glTrat = 0;
        double glRes = 0;
        double sqTotal = 0;
        double sqTrat = 0;
        double sqRes = 0;
        double qmTrat = 0;
        double qmRes = 0;
        double fCalc = 0;

        int numAmostras = 1;
        for (int i = 0; i < amostraConcat.length(); i++) {
            if (amostraConcat.charAt(i) == ' ' && i!=amostraConcat.length()-1) {
                numAmostras++;
            }
        }
        
        int[] numDadosPorAmostra = new int[numAmostras];
        
        int numDados=0;
        int idAmostra = 0;
        
        for (int i = 0; i < amostraConcat.length(); i++) {
            if (amostraConcat.charAt(i) == ',') {
                numDados++;
            } else if(amostraConcat.charAt(i) == ' '){
                numDadosPorAmostra[idAmostra++] = numDados+1;
                numDados = 0;
            }
        }
        
        glTrat = numAmostras - 1;

        //Separa todas as amostras, uma a uma
        String[] amostra = amostraConcat.split(" ");

        //Cria uma String auxiliar, para a separação dos números
        String amostraConcatR = amostraConcat.replace(" ", ",");

        //Separa todos os números (Strings)
        String[] numerosS = amostraConcatR.split(",");

        double[] numeros = new double[numerosS.length];
        
        double mediaTotal = 0;
        for (int i = 0; i < numerosS.length; i++) {
            //Separa todos os números (double) e calcula a média total
             numeros[i] = Double.parseDouble(numerosS[i]);
             mediaTotal += numeros[i];
        }
        mediaTotal /= numeros.length;
        
        glTotal = numeros.length - 1;
        glRes = glTotal - glTrat;
        
        double[] amostraMedias = new double[numAmostras];
        
        sqTotal = this.calculaSqTotal(numeros, mediaTotal);
        
        int indexAux = 0;
        int contAux = 1;
        
        for(int i = 0; i<numeros.length; i++){
            //calcula a média de cada um dos tratamentos, e guarda esse valor num vetor que posteriormente será passado como argumento para a função que calcula a Soma de Quadrados.
            amostraMedias[indexAux] += numeros[i];
            contAux++;
            if(contAux > numDadosPorAmostra[indexAux]){
                amostraMedias[indexAux] /= numDadosPorAmostra[indexAux];
                indexAux++;
                contAux=1;
            }
        }
        sqTrat = calculaSq(amostraMedias, mediaTotal, numDadosPorAmostra);
        
        sqRes = sqTotal - sqTrat;
        
        qmTrat = sqTrat / glTrat;
        qmRes = sqRes / glRes;
        
        fCalc = qmTrat/qmRes;
        
        return fCalc;
    }
    
    /**
     * Calcula a Soma de Quadrados total da amostra apresentada.
     * @param dados todos os dados da amostra.
     * @param mediaTotal a média desses dados.
     * @return 
     */
    public double calculaSqTotal(double []dados, double mediaTotal){
        double sq = 0;
        
        for(int i = 0; i<dados.length; i++){
            sq += Math.pow((dados[i] - mediaTotal),2);
        }
        
        return sq;
    }
    
    public double calculaSq(double []dados, double mediaTotal, int[] reps){
        double sq = 0;
        
        for(int i = 0; i<dados.length; i++){
            sq += Math.pow((dados[i] - mediaTotal),2) * reps[i];
        }
        
        return sq;
    }
}
