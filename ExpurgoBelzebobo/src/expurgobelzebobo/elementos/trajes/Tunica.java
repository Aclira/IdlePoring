// Contém a definição de Tunica.
// Bônus de 3% à defesa do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.trajes;

public class Tunica extends Traje {
    
    public Tunica(boolean liberado) {        
        super("Tunica", atb.getMagico(), 0.03, liberado);
    }
    
}
