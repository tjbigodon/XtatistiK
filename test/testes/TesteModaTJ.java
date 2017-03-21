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
        ArrayList<String> aux = new ArrayList(); //arraylist com itens diferentes. Pode ajudar, por exemplo, na criação da tabela de frequências, se ela existir.
        int moda = 0;
        int classifModa = 0;
        boolean amodal = true;
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
      
        aux.add(valor.get(0)); //adiciona o primeiro item ao arraylist dos diferentes
        
        for(int i = 0; i<valor.size(); i++){ //laço que adiciona somente os valores únicos ao aux
            for(int j = 0; j<valor.size() ; j++){
                if(!valor.get(i).equals(valor.get(j))){
                    if(!verifExistencia(aux,valor.get(j))){
                        aux.add(valor.get(j));
                    }
                }
            }
            break;
        }
        
        int freqAcum[] = new int[aux.size()]; //vetor que pega a frequência acumulada
        
        for(int i = 0; i<aux.size(); i++){ 
            for(int j = 0; j<valor.size() ; j++){
                if(aux.get(i).equals(valor.get(j))){
                    freqAcum[i]++;
                }
            }
        }
        
        //laço que atribui qual frequência absoluta será a moda
        for(int j = 0; j<aux.size() ; j++){
            if(moda<freqAcum[j]){
                moda = freqAcum[j];
            }
        }
        
        String resultado = new String("Moda: ["); //string que apresentará o resultado final
        
        for(int j = 0; j<aux.size() ; j++){
            if(moda==freqAcum[j]){
                resultado = (resultado+aux.get(j));
                classifModa++;
                if(!(j+1==aux.size())){
                    resultado = (resultado+" / ");
                }
            }
        }
        //condicional que deleta o final do resultado, pra ficar mais bonito
        if(resultado.endsWith("/ ")){
            char[] resultadoChar = new char[resultado.length()-3];
            resultado.getChars(0, resultado.length()-3, resultadoChar,0);
            
            resultado = String.valueOf(resultadoChar);
        }
        
        resultado = (resultado+"].\n");
        
        for(int i = 0; i<aux.size(); i++){
            if(freqAcum[i]==1){
                amodal = true;
            }else{
                amodal = false;
                break;
            }
        }
        
        System.out.println(amodal);
        
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
                if(amodal==true){
                    resultado = (resultado + "Amodal!");
                }else{
                    resultado = (resultado+"Multimodal!");
                }
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
