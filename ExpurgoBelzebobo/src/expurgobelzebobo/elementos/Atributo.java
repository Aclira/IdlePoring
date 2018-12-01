// Contém uma lista com todos os atributos do jogo.

package expurgobelzebobo.elementos;

public class Atributo {
    
    private final String distancia;    // Profissão Arqueiro, Arma Arco, Traje jaqueta
    private final String fisico;       // Profissão Guerreiro, Arma Espada, Traje Armadura
    private final String magico;       // Profissão Mago, Arma Cajado, Traje Tunica
    
    public Atributo() {
        this.distancia = "distancia";
        this.fisico = "fisico";
        this.magico = "magico";        
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
