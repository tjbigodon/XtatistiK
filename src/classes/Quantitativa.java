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
public interface Quantitativa {
    
    /**
     * Método para criação dos dados.
     * @param dados
     * @return 
     */
    public String mostrarAmostra();    
    
    /**
     * Método para criação dos dados.
     * @param dados
     */
    public void insereAmostra(Double dados);
    
    /**
     * Método para criação da Amostra.
     * @param nome
     */
    public void setNomeAmostra(String nome);
    
    /**
     * Método para mostrar o nome da Amostra.
     * @param nome
     * @return
     */
    public String getNomeAmostra();
    
}
