// Contém a definição geral de habilidade

package idledemon.elementos;

public class Habilidade {
    
    // Características da habilidade
    
    private final String nome;     // Nome da habilidade
    private final String atributo; // Atributo da habiliadade
    
    // Construtor para criação da habilidade
    
    public Habilidade(String nome, String atributo) {
        this.nome = nome;
        this.atributo = atributo;
    }

    // Getters para leitura das características da habilidade
    
    public String getNome() {
        return nome;
    }

    public String getAtributo() {
        return atributo;
    }
}
