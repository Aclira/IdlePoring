// Contem a definição de Estamina.
// Bônus de pelo menos 5% na defesa do personagem a cada utilização.

package expurgobelzebobo.elementos.itens;

public class Adrenalina extends Item {
    
    public Adrenalina(int nivel, boolean liberado) {
        super("Adrenalina", 5/100, 0, 0, nivel, liberado);
    }
    
}
