// Contém uma lista com todos os atributos do jogo.

package idledemon.elementos;

public class Atributo {
    
    // Lista de atributos
    
    private final String distancia;    // Profissão Arqueiro, Arma Arco, Traje jaqueta
    private final String fisico;       // Profissão Guerreiro, Arma Espada, Traje Armadura
    private final String magico;       // Profissão Mago, Arma Cajado, Traje Tunica
    
    // Construtor da lista de atributos
    
    public Atributo() {
        this.distancia = "Distância";
        this.fisico = "Físico";
        this.magico = "Mágico";
    }

    // Getters para leitura dos atributos

    public String getDistancia() {
        return distancia;
    }

    public String getFisico() {
        return fisico;
    }

    public String getMagico() {
        return magico;
    }
}
