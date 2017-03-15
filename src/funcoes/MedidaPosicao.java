/**
 * Classe responsável pela execução das funções aritmeticas relativas a
 * dados estatísticos.
 */
package funcoes;

import classes.Valor;
import java.util.ArrayList;

/**
 *
 * @author Jehymison Gil Alves Oliveira
 */
public class MedidaPosicao {
    //Moda
    //Média
    //Mediana
    String tipo;

    /**
     * Construtor da Classe para definição de utilização dos métodos.
     * @param tipoVariaveis 
     */
    public MedidaPosicao(String tipoVariaveis) {
        if (tipoVariaveis.equalsIgnoreCase("Qualitativa")) {
            ArrayList<String> dados = new ArrayList<>();
            this.tipo = tipoVariaveis;
        } else if (tipoVariaveis.equalsIgnoreCase("Quantitativa")) {
            ArrayList<Float> dados = new ArrayList<>();
            this.tipo = tipoVariaveis;
        }
    }

    public MedidaPosicao() {
    }

    /**
     * Método para cálculo de Moda.
     *
     * @param dados
     * @return valorModa
     */
    public int moda(ArrayList<Valor> dados) {
        String variavel;
        
        int valorModa = 0;
        return valorModa;
    }

    /**
     * Método para cálculo de Média.
     *
     * @return valorMedia
     */
    public float media() {
        float valorMedia = 0;
        return valorMedia;
    }

    /**
     * Método para cálculo de Mediana.
     *
     * @return valorMediana
     */
    public float mediana() {
        float valorMediana = 0;
        return valorMediana;
    }

}
