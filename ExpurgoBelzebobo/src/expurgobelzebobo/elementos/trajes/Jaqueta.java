// Contém a definição de Jaqueta.
// Bônus de 30% à defesa do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.trajes;

public class Jaqueta extends Traje {
    
    public Jaqueta(boolean liberado) {        
        super("Jaqueta", atb.getDistancia(), 0.3, liberado);
    }
}
