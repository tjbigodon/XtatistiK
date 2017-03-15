/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author livre
 */
public class testesModa {

    public static void main(String[] args) {
        int qtd = 0;
        String[] moda;
        ArrayList<String> dados = new ArrayList<>();
        dados.add("a");
        dados.add("h");
        dados.add("b");
        dados.add("c");
        dados.add("d");
        dados.add("d");
        dados.add("i");
        dados.add("h");
        dados.add("j");

        int[] total = new int[dados.size()];
        String olho;

        System.out.println(dados.toString());

        for (int i = 0; i < dados.size(); i++) {
            qtd++;
            System.out.println(qtd + " = " + dados.get(i));

            olho = dados.get(i);
            for (int j = 0; j < dados.size(); j++) {
                if (olho.equals(dados.get(j))) {
                    total[j] = total[j] + 1;
                }
            }

        }

        System.out.println("Valores possíveis de Moda");
        for (int i = 0; i < dados.size(); i++) {
            System.out.println(dados.get(i) + " = " + total[i]);
        }

        //Verifica Maior valor do vetor
        int maior = 0;
        int pos = 0;
        int tmoda = 0;
        for (int i = 0; i < dados.size(); i++) {
            if (maior < total[i]) {
                maior = total[i];
                pos = i;
                tmoda++;
            }
        }

        int nModa = 0;
        for (int i = 0; i < dados.size(); i++) {
            if (maior == total[i]) {
                nModa++;
            }
        }
        //System.out.println("N = "+ nModa);

        moda = new String[nModa];
        int a = 0;
        for (int i = 0; i < dados.size(); i++) {
            for (int j = 0; j < dados.size(); j++) {
                olho = dados.get(i);
                if (olho.equals(dados.get(j)) && j != i) {
                    moda[a] = dados.get(j);
                    a++;
                }
            }
        }

        for (int i = 0; i < moda.length; i++) {
            olho = moda[i];
            if (olho.equals(moda[i+1]) && i != 0) {
            } else {
                System.out.println("Moda = " + moda[i]);
            }
        }

        //System.out.println("");
        //System.out.println("Moda = "+ dados.get(pos)); //-> para único elemento é fácil
    }
}
