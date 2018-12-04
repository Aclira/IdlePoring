// Contém da definição de Elfo.
// Resistente a distância.
// Vulnerável a físico.

package idledemon.elementos.racas;

public class Elfo extends Raca {
    
    // Cria as habilidades da raça
    
    private void habilidades() {
        novaHabilidade("Tiro de Arco", atb.getDistancia());
        novaHabilidade("Feixe de Energia", atb.getMagico());
    }
    
    public Elfo(){
        super("Elfo", atb.getDistancia(), atb.getFisico());
        habilidades();
    }
}
