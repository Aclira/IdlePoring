// Contém da definição de Ogro.
// Resistente a físico.
// Vulnerável a mágico.

package idledemon.elementos.racas;

public class Ogro extends Raca {
    
    // Cria as habilidades da raça
    
    private void habilidades() {
        novaHabilidade("Pancada de Porrete", atb.getFisico());
    }
    
    public Ogro(){
        super("Ogro", atb.getFisico(), atb.getMagico());
        habilidades();
    }
}
