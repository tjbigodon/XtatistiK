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

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int qtd = 0;
        ArrayList<String> dados = new ArrayList<>();
        ArrayList<String> modaFinal = new ArrayList<>();
        ArrayList<String> moda = new ArrayList<>();
        dados.add("a");
        dados.add("b");
        dados.add("a");
        dados.add("c");
        dados.add("d");
        dados.add("e");
        dados.add("f");
        dados.add("f");
        dados.add("f");
        dados.add("g");
        dados.add("h");
        dados.add("i");
        dados.add("j");
        dados.add("j");

        int[] total = new int[dados.size()];
        String olho;

        System.out.println(dados.toString());

        for (int i = 0; i < dados.size(); i++) {
            qtd++;
            olho = dados.get(i);
            for (int j = 0; j < dados.size(); j++) {
                if (olho.equals(dados.get(j))) {
                    total[j] = total[j] + 1;
                }
            }
        }

        //Verifica Maior valor do vetor
        int maior = 0;
        int tmoda = 0;
        for (int i = 0; i < dados.size(); i++) {
            if (maior < total[i]) {
                maior = total[i];
                tmoda++;
            }
        }

        //Preenche a lista da moda final
        for (int i = 0; i < dados.size(); i++) {
            modaFinal.add(dados.get(i));
        }
        
        //Verifica onde estão os index das possíveis modas.
        ArrayList<Integer> index = new ArrayList<>();
        int[] valores = new int[modaFinal.size()];
        int posi = 0;
        for (int i = 0; i < modaFinal.size(); i++) {
            posi++;
            olho = modaFinal.get(i);
            for (int j = 0; j < modaFinal.size(); j++) {
                if (olho.equals(modaFinal.get(j))) {
                    valores[j] = valores[j] + 1;
                }
            }
            index.add(valores[i]);
        }

        for (int i = 0; i < modaFinal.size(); i++) {
            if (index.get(i) == maior) {
                moda.add(modaFinal.get(i));
            }
        }
        System.out.println("Moda = " + moda.toString());
    }
}