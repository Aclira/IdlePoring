// Contém uma lista com todos os atributos do jogo.

package expurgobelzebobo.elementos;

public abstract class Atributo {
    
    private final String distancia = "distancia"; // Profissão Arqueiro, Arma Arco, Traje jaqueta
    private final String fisico = "fisico";       // Profissão Guerreiro, Arma Espada, Traje Armadura
    private final String magico = "magico";       // Profissão Mago, Arma Cajado, Traje Tunica

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
