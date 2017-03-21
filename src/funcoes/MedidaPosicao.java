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
     *
     * @param tipoVariaveis
     */
    public MedidaPosicao(String tipoVariaveis) {
        if (tipoVariaveis.equalsIgnoreCase("Qualitativa")) {
            ArrayList<String> dados = new ArrayList<>();
            this.tipo = tipoVariaveis;
        } else if (tipoVariaveis.equalsIgnoreCase("Quantitativa")) {
            ArrayList<Double> dados = new ArrayList<>();
            this.tipo = tipoVariaveis;
        }
    }

    public MedidaPosicao() {
    }

    /**
     * Método para cálculo de Moda.
     *
     * @param dados
     * @return moda
     */
    public String moda(ArrayList<String> dados) {
        int qtd = 0;
        String tipo = null;
        ArrayList<String> modaFinal = new ArrayList<>();
        ArrayList<String> moda = new ArrayList<>();

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
            //System.out.println(total[i] + " = " + dados.get(i));
        }

        //Verifica Maior valor do vetor
        int maior = 0;
        for (int i = 0; i < dados.size(); i++) {
            if (maior < total[i]) {
                maior = total[i];
            }
        }
        //System.out.println("Maior = "+ maior);

        //Preenche a lista da moda final
        for (int i = 0; i < dados.size(); i++) {
            modaFinal.add(dados.get(i));
        }
        //System.out.println(modaFinal.toString());

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
            //System.out.println(valores[i] + " = " + index.get(i));
        }

        for (int i = 0; i < modaFinal.size(); i++) {
            if (index.get(i) == maior) {
                moda.add(modaFinal.get(i));
            }
        }

        qtd = 0;
        for (int i = 0; i < moda.size(); i++) {
            qtd++;
        }

        double resp = 0;
        int count = 0;
        for (int i = 0; i < valores.length; i++) {
            resp = resp + valores[i];
            count++;
        }

        resp = resp / count;

        if (qtd != 0 && resp == 1.0) {
            tipo = "Amodal";
        }
        if (qtd == 1 && resp > 1.0) {
            tipo = "Unimodal -> "+moda.toString();
        }
        if (qtd == 2 && resp > 1.0) {
            tipo = "Bimodal -> "+moda.toString();
        }
        if (qtd > 2 && resp > 1.0) {
            tipo = "Multimodal -> "+moda.toString();
        }

        return tipo;
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
