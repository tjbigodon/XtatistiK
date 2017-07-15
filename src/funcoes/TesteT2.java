/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.util.ArrayList;

/**
 *
 * @author Jehymeson Gil
 */
public class TesteT2 {

    public static void main(String[] args) {

        ArrayList<Double> dados1 = new ArrayList();
        ArrayList<Double> dados2 = new ArrayList();

        dados1.add(12.0);
        dados1.add(14.0);
        dados1.add(12.0);
        dados1.add(9.0);
        dados1.add(14.0);
        dados1.add(14.0);
        dados1.add(9.0);

        dados2.add(1.0);
        dados2.add(0.0);
        dados2.add(0.0);
        dados2.add(1.0);
        dados2.add(0.5);
        dados2.add(1.5);
        dados2.add(0.0);

        //Somatoria dos valores
        Double sum1 = somatoria(dados1);
        Double sum2 = somatoria(dados2);

        //Cálculo de Média
        Double media1 = media(dados1, sum1);
        Double media2 = media(dados2, sum2);

        //Cálculo das diferenças ao quadrado.
        ArrayList<Double> dif1 = diferencaQuadrada(dados1, media1);
        ArrayList<Double> dif2 = diferencaQuadrada(dados2, media2);

        Double somDif1 = somatoria(dif1);
        Double somDif2 = somatoria(dif2);

        Double variancia1 = variancia(somDif1, dados1.size());
        Double variancia2 = variancia(somDif2, dados2.size());

        //System.out.println(variancia1);
        //System.out.println(variancia2);
        Double f = testeF(variancia1, variancia2);
        //System.out.println(f);

        Double t = xtatistikTest(12.0, 0.5, 5.0, 0.25, dados1, dados2);
        //System.out.println(t);

        double nAsterisk = nAsterisk(12.0, 0.5, 5.0, 0.25, dados1, dados2);
        System.out.println(nAsterisk);

        System.out.println(valorN(nAsterisk));
        
        double tTab = 2.36;
        System.out.println(testHipotese(tTab, t));

    }

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

    //Cálculo do N*
    public static double nAsterisk(Double media1, Double media2, Double variancia1, Double variancia2, ArrayList dados1, ArrayList dados2) {
        Double p1 = 0.0;
        Double p2 = 0.0;
        p1 = Math.pow(((variancia1 / dados1.size()) + (variancia2 / dados2.size())), 2);
        //System.out.println(p1);
        p2 = (Math.pow((variancia1 / dados1.size()), 2) / (dados1.size() - 1)) + (Math.pow((variancia2 / dados2.size()), 2) / (dados2.size() - 1));
        //System.out.println(p2);

        Double nAsterisk = p1 / p2;

        return nAsterisk;
    }

    //Cálculo da Estatística de Teste
    public static Double xtatistikTest(Double media1, Double media2, Double variancia1, Double variancia2, ArrayList dados1, ArrayList dados2) {
        Double t = (((media1 - media2) / (Math.sqrt((variancia1 / dados1.size()) + (variancia2 / dados2.size())))));
        return t;
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

    //Retorno de N*
    public static double valorN(double nAsterisk) {
        double decimal = nAsterisk - (int) nAsterisk;
        double valN = (int) nAsterisk;
        if (decimal > 0.5) {
            return valN + 1;
        } else {
            return valN;
        }
    }
}
