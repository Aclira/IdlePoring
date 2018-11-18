// Contem a definição de Estamina.
// Bônus de pelo menos 5% no ataque do personagem a cada utilização.

package expurgobelzebobo.elementos.itens;

public class Estamina extends Item {
    
    public Estamina(int nivel, boolean liberado) {
        super("Estamina", 5/100, 0, 0, nivel, liberado);
    }
    
}
