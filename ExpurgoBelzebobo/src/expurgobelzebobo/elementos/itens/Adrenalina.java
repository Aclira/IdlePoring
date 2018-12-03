// Contem a definição de Adrenalina.
// Bônus de pelo menos 5% na defesa do personagem a cada utilização.

package expurgobelzebobo.elementos.itens;

public class Adrenalina extends Item {
    
    public Adrenalina(int nivel, boolean liberado) {
        super("Adrenalina", 0.05, 0.0, 0.0, nivel, liberado);
    }
}
