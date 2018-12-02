// Contém uma lista com todos os atributos do jogo.

package expurgobelzebobo.elementos;

public class Atributo {
    
    // Lista de atributos
    
    private final String distancia;    // Profissão Arqueiro, Arma Arco, Traje jaqueta
    private final String fisico;       // Profissão Guerreiro, Arma Espada, Traje Armadura
    private final String magico;       // Profissão Mago, Arma Cajado, Traje Tunica
    private final String geral;        // Referência a todos os atributos
    private final String nenhum;       // Referência a nenhum dos atributos
    
    // Construtor da lista de atributos
    
    public Atributo() {
        this.distancia = "distancia";
        this.fisico = "fisico";
        this.magico = "magico";    
        this.geral = "geral";
        this.nenhum = "nenhum";
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
    
    public String getGeral() {
        return geral;
    }
    
    public String getNenhum() {
        return nenhum;
    }

}
