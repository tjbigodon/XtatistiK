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
public interface Qualitativa {

    /**
     * Método para criação dos dados.
     * @param dados
     * @return
     */
    public String mostrarAmostra(ArrayList<String> dados);
    
    /**
     * Método para criação dos dados.
     * @param dados
     */
    public void insereAmostra(String dados);
    
}