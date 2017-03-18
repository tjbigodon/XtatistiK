/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import funcoes.MedidaPosicao;
import java.util.ArrayList;

/**
 *
 * @author livre
 */
public class testesModa {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int qtd = 0;
        ArrayList<String> dados = new ArrayList<>();
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
        
        MedidaPosicao modaFuncao = new MedidaPosicao();
        moda = modaFuncao.moda(dados);
        
        System.out.println(moda.toString());
        
    }
}