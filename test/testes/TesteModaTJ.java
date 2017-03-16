/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import classes.Valor;
import java.util.ArrayList;
/**
 *
 * @author livre
 */
public class TesteModaTJ {
    public static void main(String[] args) {
        ArrayList<String> valor = new ArrayList(); //arraylist capturado
        ArrayList<String> aux = new ArrayList(); //arraylist com itens diferentes
        
        valor.add("a");
        valor.add("b");
        valor.add("a");
        valor.add("c");
        valor.add("d");
        valor.add("e");
        valor.add("f");
        valor.add("f");
        valor.add("f");
        valor.add("g");
        valor.add("h");
        valor.add("i");
        valor.add("j");
        valor.add("j");
        
        for(int j = 0; j<valor.size() ; j++){
            aux.add(valor.get(j));
        }
        
        int z = 0; //index do aux
        
        for(int i = 0; i<valor.size(); i++){ //laço que deleta os valores repetidos de aux;
            for(int j = 0; j<aux.size() ; j++){
                
            }
        }
        
        
        System.out.println(aux.size());
        
    }
}
