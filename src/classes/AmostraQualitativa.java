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
public class AmostraQualitativa implements Qualitativa{

    @Override
    public String mostrarAmostra(ArrayList<String> dados) {
        return dados.toString();
    }

    @Override
    public void insereAmostra(String dados) {
        
    }
}
