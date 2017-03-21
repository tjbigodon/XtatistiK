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
        String resultado;
        ArrayList<String> dados = new ArrayList<>();
        dados.add("a");
        dados.add("b");
        dados.add("c");
        
        
        MedidaPosicao modaFuncao = new MedidaPosicao();
        resultado = modaFuncao.moda(dados);
        
        System.out.println(resultado);
               
    }
}