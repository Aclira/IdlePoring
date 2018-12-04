// Contém a definição de Cajado.
// Bônus de 30% ao ataque do personagem que possui classe com o mesmo atributo.

package idledemon.elementos.armas;

public class Cajado extends Arma {
    
    public Cajado(boolean liberado) {
        super("Cajado", atb.getMagico(), 0.3, liberado);
    }
}
