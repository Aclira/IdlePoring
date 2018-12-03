// Contém a definição de Arqueiro.
// Bônus de 10% na defesa.
// Resistente a mágico.
// Vulnerável a físico.

package expurgobelzebobo.elementos.classes;

public class Arqueiro extends Classe {
    
    public Arqueiro() {
        super("Arqueiro", atb.getDistancia(), atb.getMagico(), atb.getFisico(), 0.0, 0.1, 0.0);
    }
}
