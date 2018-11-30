// Contém a definição de Guerreiro.
// Bônus de 10% no ataque.
// Resistente a distância.
// Vulnerável a mágico.

package expurgobelzebobo.elementos.classes;

public class Guerreiro extends Classe {
    
    public Guerreiro() {
        super("Guerreiro", atb.getFisico(), atb.getDistancia(), atb.getMagico(), 0.1, 0.0, 0.0);
    }
    
}
