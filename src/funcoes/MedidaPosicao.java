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
     * @param dados
     * @return moda
     */
    public ArrayList<String> moda(ArrayList<String> dados) {
        int qtd = 0;
        ArrayList<String> modaFinal = new ArrayList<>();
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

        int[] total = new int[dados.size()];
        String olho;
        for (int i = 0; i < dados.size(); i++) {
            qtd++;
            olho = dados.get(i);
            for (int j = 0; j < dados.size(); j++) {
                if (olho.equals(dados.get(j))) {
                    total[j] = total[j] + 1;
                }
            }
        }

        //Verifica Maior valor do vetor
        int maior = 0;
        int tmoda = 0;
        for (int i = 0; i < dados.size(); i++) {
            if (maior < total[i]) {
                maior = total[i];
                tmoda++;
            }
        }

        //Preenche a lista da moda final
        for (int i = 0; i < dados.size(); i++) {
            modaFinal.add(dados.get(i));
        }
        
        //Verifica onde estão os index das possíveis modas.
        ArrayList<Integer> index = new ArrayList<>();
        int[] valores = new int[modaFinal.size()];
        int posi = 0;
        for (int i = 0; i < modaFinal.size(); i++) {
            posi++;
            olho = modaFinal.get(i);
            for (int j = 0; j < modaFinal.size(); j++) {
                if (olho.equals(modaFinal.get(j))) {
                    valores[j] = valores[j] + 1;
                }
            }
            index.add(valores[i]);
        }

        for (int i = 0; i < modaFinal.size(); i++) {
            if (index.get(i) == maior) {
                moda.add(modaFinal.get(i));
            }
        }
        return moda;
    }

    /**
     * Método para cálculo de Média.
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
