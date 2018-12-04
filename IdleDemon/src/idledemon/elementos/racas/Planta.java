// Contém da definição de Planta.
// Resistente a distância.
// Vulnerável a mágico.

package idledemon.elementos.racas;

public class Planta extends Raca {
    
    // Cria as habilidades da raça
    
    private void habilidades() {
        novaHabilidade("Chicote de Hera", atb.getFisico());
        novaHabilidade("Folha Navalha", atb.getDistancia());
    }
    
    public Planta(){
        super("Planta", atb.getDistancia(), atb.getMagico());
        habilidades();
    }
}
