// Contém a definição de Mago.
// Bônus de 10% na inteligência.
// Resistente a distância.
// Vulnerável a físico.

package expurgobelzebobo.elementos.classes;

public class Mago extends Classe {
    
    public Mago() {
        super("Mago", atb.getMagico(), atb.getDistancia(), atb.getFisico(), 0.0, 0.0, 0.1);
    }
}
