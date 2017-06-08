package funcoes;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tarcisio
 */
public class BoxPlot {

    public static void main(String[] args) {
        ArrayList<Double> amostra = new ArrayList<>();
        amostra.add(55.7);
        amostra.add(58.4);
        amostra.add(60.8);
        amostra.add(65.1);
        amostra.add(68.2);
        amostra.add(74.9);
        amostra.add(84.2);
        amostra.add(88.2);
        amostra.add(89.7);
        amostra.add(92.5);
        amostra.add(94.8);
        amostra.add(179.0);

        amostra = amostraEmRol(amostra);

        ArrayList<Double> outLiers = retornaOutliers(amostra);
        
        if(outLiers == null){
            System.out.println("Não há outliers!");
        }else{
            for(int i = 0; i<outLiers.size(); i++){
                System.out.println("Outlier encontrado: "+outLiers.get(i));
            }
        }
        
        System.out.println("*****************************************************************");
        
        amostra = new ArrayList<>();
        amostra.add(12.0);
        amostra.add(9.0);
        amostra.add(17.0);
        amostra.add(9.0);
        amostra.add(17.0);
        amostra.add(9.0);
        amostra.add(17.0);
        amostra.add(12.0);
        amostra.add(10.0);
        amostra.add(12.0);
        amostra.add(10.0);
        amostra.add(12.0);
        amostra.add(9.0);
        amostra.add(12.0);
        amostra.add(9.0);
        amostra.add(12.0);
        amostra.add(9.0);
        amostra.add(14.0);
        amostra.add(12.0);
        amostra.add(12.0);
        amostra.add(6.0);
        amostra.add(6.0);
        amostra.add(6.0);
        amostra.add(17.0);
        amostra.add(12.0);
        amostra.add(12.0);
        
        amostra = amostraEmRol(amostra);

        outLiers = retornaOutliers(amostra);
        
        if(outLiers == null){
            System.out.println("Não há outliers!");
        }else{
            for(int i = 0; i<outLiers.size(); i++){
                System.out.println("Outlier encontrado: "+outLiers.get(i));
            }
        }
        
        System.out.println("****************************");
        
        amostra = new ArrayList<>();
        amostra.add(80.0);
        amostra.add(79.0);
        amostra.add(78.0);
        amostra.add(80.0);
        amostra.add(76.0);
        amostra.add(75.0);
        amostra.add(77.0);
        amostra.add(77.0);
        amostra.add(76.0);
        amostra.add(74.0);
        
        amostra = amostraEmRol(amostra);

        outLiers = retornaOutliers(amostra);
        
        if(outLiers == null){
            System.out.println("Não há outliers!");
        }else{
            for(int i = 0; i<outLiers.size(); i++){
                System.out.println("Outlier encontrado: "+outLiers.get(i));
            }
        }
    }

    public static ArrayList<Double> retornaOutliers(ArrayList<Double> amostra) {
        ArrayList<Double> outLiers = new ArrayList<>();
        double q1 = 0, q2 = 0, q3 = 0;

        q1 = (amostra.size() + 1) / 4.0;
        if (converteInteiro(String.valueOf(q1)) == -1) { //verifica se o número obtido a partir da fórmula do primeiro quartil não é inteiro
            //se não for inteiro, compara os dois elementos entre o valor do quartil (anterior e posterior), e se forem iguais, o primeiro quartil terá o valor do anterior.
            if(Objects.equals(amostra.get((int)q1), amostra.get((int)q1-1))){
                q1 = amostra.get((int)q1-1);
            } else{ //senão, é feita a interpolação.
                q1 = amostra.get((int)q1-1) + (q1-(int)q1)*(amostra.get((int)q1)-amostra.get((int)q1-1)); //cálculo da interpolação do quartil 1.
            }
        }else{
            q1 = amostra.get(converteInteiro(String.valueOf(q1)));
        }
        
        q2 = (2 * (amostra.size() + 1)) / 4.0;
        if (converteInteiro(String.valueOf(q2)) == -1) { //verifica se o número obtido a partir da fórmula do segundo quartil não é inteiro
            //se não for inteiro, compara os dois elementos entre o valor do quartil (anterior e posterior), e se forem iguais, o segundo quartil terá o valor do anterior.
            if(Objects.equals(amostra.get((int)q2), amostra.get((int)q2-1))){
                q2 = amostra.get((int)q2-1);
            } else{ //senão, é feita a interpolação.
                q2 = amostra.get((int)q2-1) + (q2-(int)q2)*(amostra.get((int)q2)-amostra.get((int)q2-1)); //cálculo da interpolação do quartil 1.
            }
        }else{
            q2 = amostra.get(converteInteiro(String.valueOf(q2)));
        }
        
        q3 = (3 * (amostra.size() + 1)) / 4.0;
        if (converteInteiro(String.valueOf(q3)) == -1) { //verifica se o número obtido a partir da fórmula do segundo quartil não é inteiro
            //se não for inteiro, compara os dois elementos entre o valor do quartil (anterior e posterior), e se forem iguais, o segundo quartil terá o valor do anterior.
            if(Objects.equals(amostra.get((int)q3), amostra.get((int)q3-1))){
                q3 = amostra.get((int)q3-1);
            } else{ //senão, é feita a interpolação.
                q3 = amostra.get((int)q3-1) + (q3-(int)q3)*(amostra.get((int)q3)-amostra.get((int)q3-1)); //cálculo da interpolação do quartil 1.
            }
        }else{
            q3 = amostra.get(converteInteiro(String.valueOf(q3)));
        }
        
        String q1F = String.format("%.2f", q1);//formata o quartil 1 em duas casas decimais
        q1F = q1F.replace(',', '.');//troca a vírgula por um ponto (float para double)
        String q2F = String.format("%.2f", q2);//formata o quartil 2 em duas casas decimais
        q2F = q2F.replace(',', '.');//troca a vírgula por um ponto (float para double)
        String q3F = String.format("%.2f", q3);//formata o quartil 3 em duas casas decimais
        q3F = q3F.replace(',', '.');//troca a vírgula por um ponto (float para double)
        
        
        q1 = Double.parseDouble(q1F);
        q2 = Double.parseDouble(q2F);
        q3 = Double.parseDouble(q3F);
        
        double aiq = q3-q1; //cálculo da Amplitude Inter Quartílica, ou AIQ
        
        
        String aiqF = String.format("%.2f", aiq);
        aiq = Double.parseDouble(aiqF.replace(',', '.'));
        
        
        double limiteS = q3+(1.5*aiq);
        double limiteI = q1-(1.5*aiq);
        
        for(int i = 0; i<amostra.size(); i++){
            if(amostra.get(i)<limiteI){
                outLiers.add(amostra.get(i));
            }else{
                break;
            }
        }
        
        for(int i = amostra.size()-1; i>=0; i--){
            if(amostra.get(i)>limiteS){
                outLiers.add(amostra.get(i));
            }else{
                break;
            }
        }
        
        if(outLiers.isEmpty()){
            return null;
        } else{
            return outLiers;
        }
    }

    public static ArrayList<Double> amostraEmRol(ArrayList<Double> amostra) {
        Double aux;

        for (int i = 0; i < amostra.size(); i++) {
            for (int j = 0; j < amostra.size() - 1; j++) {
                if (amostra.get(j) > amostra.get(j + 1)) {
                    aux = amostra.get(j + 1);
                    amostra.set(j + 1, amostra.get(j));
                    amostra.set(j, aux);
                }
            }
        }

        return amostra;
    }

    private static int converteInteiro(String eita) {
        if (eita.contains(".0")) {
            double eitaD = Double.parseDouble(eita);
            int eitaI = (int) eitaD;
            return eitaI;
        } else {
            return -1;
        }
    }
}
