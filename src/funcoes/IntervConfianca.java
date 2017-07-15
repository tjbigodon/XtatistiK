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
public class IntervConfianca {
    private double media;
    private double tTab;
    private double desvioPadraoAmostra;
    private int n;
    
    public static void main(String[] args) {
        
    }

    public IntervConfianca(double media, double tTab, double desvioPadraoAmostra, int n) {
        this.media = media;
        this.tTab = tTab;
        this.desvioPadraoAmostra = desvioPadraoAmostra;
        this.n = n;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double gettTab() {
        return tTab;
    }

    public void settTab(double tTab) {
        this.tTab = tTab;
    }

    public double getDesvioPadraoAmostra() {
        return desvioPadraoAmostra;
    }

    public void setDesvioPadraoAmostra(double desvioPadraoAmostra) {
        this.desvioPadraoAmostra = desvioPadraoAmostra;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public double limInf(){
        return media-tTab*(desvioPadraoAmostra/Math.sqrt(n));
    }
    
    public double limSup(){
        return media+tTab*(desvioPadraoAmostra/Math.sqrt(n));
    }
    
    public boolean verifica(double h0){
        if(limInf()<=h0 && h0<=limSup()){
            return true;
        }else{
            return false;
        }
    }
    
}
