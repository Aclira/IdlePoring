// Contém a definição de Espada.
// Bônus de 3% ao ataque do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.armas;

public class Espada extends Arma {
    
    public Espada(boolean liberado) {
        super("Espada", atb.getFisico(), 3/100, liberado);
    }
    
}
