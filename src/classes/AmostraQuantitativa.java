/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author jehym
 */
public class AmostraQuantitativa implements Quantitativa{
    private String nome;
    private ArrayList<Double> amostra = new ArrayList<>(); 

    public AmostraQuantitativa(String nome) {
        this.nome = nome;
    }

    public AmostraQuantitativa() {
    }
    
    @Override
    public String mostrarAmostra() {
        return amostra.toString();
    }

    @Override
    public void insereAmostra(Double dados) {
        amostra.add(dados);
    }
    
    @Override
    public void setNomeAmostra(String nome){
        this.nome = nome;
    }

    @Override
    public String getNomeAmostra() {
        return this.nome;
    }
    
    
    
    
}
