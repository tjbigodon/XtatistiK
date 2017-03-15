/**
 * Classe responsável pela objetificação do dado a ser trabalhado.
 */
package classes;

/**
 *
 * @author Tarcísio Ribeiro Júnior
 *
 */
public class Valor {
   private String caractDado;

    public Valor(String caractDado) {
        this.caractDado = caractDado;
    }
    
    public Valor(){
    }
    
    public String getCaractDado() {
        return caractDado;
    }

    public void setCaractDado(String caractDado) {
        this.caractDado = caractDado;
    }
}
