// Contém a definição de Espada.
// Bônus de 30% ao ataque do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.armas;

public class Espada extends Arma {
    
    public Espada(boolean liberado) {
        super("Espada", atb.getFisico(), 0.3, liberado);
    }
}
