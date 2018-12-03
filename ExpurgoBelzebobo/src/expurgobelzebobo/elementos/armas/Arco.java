// Contém a definição de Arco.
// Bônus de 3% ao ataque do personagem que possui classe com o mesmo atributo.

package expurgobelzebobo.elementos.armas;

public class Arco extends Arma {
    
    public Arco(boolean liberado) {        
        super("Arco", atb.getDistancia(), 0.03, liberado);
    }
}
