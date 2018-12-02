// Contém a definição de Slime.
// Resistente a físico.
// Vulnerável a mágico.

package expurgobelzebobo.elementos.racas;

public class Slime extends Raca {
    
    // Cria as habilidades da raça
    
    private void habilidades() {
        novaHabilidade("Cuspe Ácido", atb.getDistancia());
    }
    
    public Slime(){
        super("Slime", atb.getFisico(), atb.getMagico());
        habilidades();
    }
}
