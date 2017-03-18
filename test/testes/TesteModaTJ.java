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
        int moda = 0;
        int classifModa = 0;
        valor.add("a");
        valor.add("b");
        valor.add("a");
        valor.add("c");
        valor.add("d");
        valor.add("e");
        valor.add("e");
        valor.add("e");
        valor.add("f");
        valor.add("f");
        valor.add("f");
        valor.add("g");
        valor.add("h");
        valor.add("i");
        valor.add("j");
        valor.add("j");
        valor.add("j");
      
        aux.add(valor.get(0));
        
        for(int i = 0; i<valor.size(); i++){ //laço que deleta os valores repetidos de aux;
            for(int j = 0; j<valor.size() ; j++){
                if(!valor.get(i).equals(valor.get(j))){
                    if(!verifExistencia(aux,valor.get(j))){
                        aux.add(valor.get(j));
                    }
                }
            }
            break;
        }
        
        int freqAcum[] = new int[aux.size()];
        
        for(int i = 0; i<aux.size(); i++){ //laço que deleta os valores repetidos de aux;
            for(int j = 0; j<valor.size() ; j++){
                if(aux.get(i).equals(valor.get(j))){
                    freqAcum[i]++;
                }
            }
        }
        
        for(int j = 0; j<aux.size() ; j++){
            if(moda<freqAcum[j]){
                moda = freqAcum[j];
            }
        }
        String resultado = new String("Moda: [");
        
        for(int j = 0; j<aux.size() ; j++){
            if(moda==freqAcum[j]){
                resultado = (resultado+aux.get(j));
                classifModa++;
                if(!(j+1==aux.size())){
                    resultado = (resultado+" / ");
                }
            }
        }
        
        if(resultado.endsWith("/ ")){
            char[] resultadoChar = new char[resultado.length()-3];
            resultado.getChars(0, resultado.length()-3, resultadoChar,0);
            
            resultado = String.valueOf(resultadoChar);
        }
        
        resultado = (resultado+"].\n");
        
        
        switch(classifModa){
            case 0:
                resultado = (resultado + "Amodal!");
                break;
            case 1:
                resultado = (resultado + "Unimodal!");
                break;
            case 2:
                resultado = (resultado+"Bimodal!");
                break;
            default:
                resultado = (resultado+"Multimodal!");
                break;
        }
        System.out.println(resultado);
    }
    
    public static boolean verifExistencia(ArrayList<String> arrayNomes,String nome){
        for(int i = 0; i<arrayNomes.size(); i++){
            if(arrayNomes.get(i).equals(nome)){
                return true;
            }
        }
        return false;
    }
}
