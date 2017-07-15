/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.util.ArrayList;

/**
 *
 * @author tarcisio
 */
public class TesteT1 {
    //Teste de Hipotese
    public static int testHipotese(double tTab, double tCalc) {
        double limiteInf = tTab * (-1);
        double limiteSup = tTab;

        if (tCalc <= limiteSup && tCalc >= limiteInf) {
            return 1;
        } else {
            return 0;
        }
    }
    
    //Cálculo da Estatística de Teste
    public static Double xtatistikTest(Double media1, Double media2, Double variancia1, Double variancia2, ArrayList dados1, ArrayList dados2) {
        Double varComb = varianciaComb(variancia1, variancia2, media1, media2, dados1, dados2);
        Double t = (media1-media2)/Math.sqrt(varComb*((1.0/dados1.size())+(1.0/dados2.size())));
        return t;
    }
    
    //Cálculo da variância combinada
    public static double varianciaComb(Double variancia1, Double variancia2, Double media1, Double media2, ArrayList dados1, ArrayList dados2)
    {
        double varComb = 0;
        
        varComb = (variancia1*(dados1.size()-1)+variancia2*(dados2.size()-1))/(dados1.size()+dados2.size()-2);
        
        return varComb;
    }
    //Cálcula desvio padrão
    public static Double desvioPadrao(Double variancia) {
        Double desvPadrao = Math.sqrt(variancia);
        return desvPadrao;
    }

    //Cálcula variancia
    public static Double variancia(Double somaDif, int qtdDados) {
        Double variancia = 0.0;
        variancia = (somaDif / (qtdDados - 1));
        return variancia;
    }

    //Cálculo de diferança de média por dados (x¹-Xµ)²
    public static ArrayList diferencaQuadrada(ArrayList dados, Double media) {
        ArrayList<Double> diferencas = new ArrayList();
        for (int i = 0; i < dados.size(); i++) {
            diferencas.add(Math.pow(Double.parseDouble(String.valueOf(dados.get(i))) - media, 2));
        }
        return diferencas;
    }

    //Cálculo de Média
    public static Double media(ArrayList dados, Double somatoria) {
        Double media = somatoria / dados.size();
        return media;
    }

    //Cálculo da somatória.
    public static Double somatoria(ArrayList dados) {
        Double sum1 = 0.0;

        //Somatória dados 01
        for (int i = 0; i < dados.size(); i++) {
            sum1 = Double.parseDouble(String.valueOf(dados.get(i))) + sum1;
        }

        return sum1;
    }

    /**
     * Cálculo do testeF
     *
     * @param variancia1
     * @param variancia2
     * @return
     */
    public static Double testeF(double variancia1, double variancia2) {
        Double f = 0.0;
        if (variancia1 > variancia2) {
            f = variancia1 / variancia2;
        } else {
            f = variancia2 / variancia1;
        }

        return f;
    }
}
