/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

/**
 *
 * @author IFgoiano
 */
public class TesteTukey {
    double qtab;
    double qmRes;
    
    public double calculaDMS(double qtab, double qmRes, int rep1, int rep2){
        this.qtab = qtab;
        this.qmRes = qmRes;
        if(rep1==rep2){
            return qtab*(Math.sqrt(qmRes/rep1));
        }else{
            return qtab*(Math.sqrt(qmRes/2)*((1/rep1)+(1/rep2)));
        }
    }
    
    public String[] analisaMedias(double[] amostraMedias, double dms, int[] numAmostras){
        String numero = String.valueOf(0.5*amostraMedias.length*(amostraMedias.length-1)).replace(".", ",");
        String[] aux = numero.split(",");
        int numDados = Integer.parseInt(aux[0]);
        String[] analiseMedias = new String[numDados];
        int cont=0;
        for(int i=0; i<amostraMedias.length; i++){
            for(int j=i+1; j<amostraMedias.length; j++ ){
                dms = calculaDMS(qtab, qmRes, numAmostras[i], numAmostras[j]);
                if(dms>(Math.abs(amostraMedias[i]-amostraMedias[j]))){
                    analiseMedias[cont] = (i+1)+"x"+(j+1)+" = NS"; 
                }else{
                    analiseMedias[cont] = (i+1)+"x"+(j+1)+" = *"; 
                }
                cont++;
            }
        }
        return analiseMedias;
    }
}
