// Contém a definição de Guerreiro.
// Bônus de 30% no ataque.
// Resistente a distância.
// Vulnerável a mágico.

package idledemon.elementos.classes;

public class Guerreiro extends Classe {
    
    public Guerreiro() {
        super("Guerreiro", atb.getFisico(), atb.getDistancia(), atb.getMagico(), 0.3, 0.0, 0.0);
    }
}
