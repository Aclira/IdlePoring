// Contém a definição de Tunica.
// Bônus de 30% à defesa do personagem que possui classe com o mesmo atributo.

package idledemon.elementos.trajes;

public class Tunica extends Traje {
    
    public Tunica(boolean liberado) {        
        super("Tunica", atb.getMagico(), 0.3, liberado);
    }
}
