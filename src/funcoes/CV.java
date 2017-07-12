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
public class CV {
    public double calculaCV(double qmres, double mediaGeral){
        return (100*Math.sqrt(qmres))/mediaGeral;
    }
}
