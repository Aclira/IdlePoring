// Contém a definição de Cajado.
// Bônus de 3% ao ataque do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.armas;

public class Cajado extends Arma {
    
    public Cajado(boolean liberado) {
        super("Cajado", atb.getMagico(), 3/100, liberado);
    }
    
}
