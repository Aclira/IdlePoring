// Contém a definição genérica de Raça

package expurgobelzebobo.elementos.racas;

import expurgobelzebobo.elementos.Atributo;

public abstract class Raca { 
    
    protected static Atributo atb = new Atributo(); // Carrega a lista de atributos
    
    // Características da raça
    
    private final String nome;           // Nome da raça
    private final String atributo;       // Atributo da habilidade raça
    private final String resistencia;    // Atributo ao qual a raça é resistente
    private final String fraqueza;       // Atributo ao qual a raça é vulnerável
    private final String nomeHabilidade; // Nome da habilidade da raça    
    
    // Construtor para criação da raça
    
    public Raca(String nome, String atributo, String resistencia, String fraqueza, String nomeHabilidade) {
        this.nome = nome;
        this.atributo = atributo;
        this.resistencia = resistencia;
        this.fraqueza = fraqueza;
        this.nomeHabilidade = nomeHabilidade;
    }
    
    // Getters para leitura das características da raça

    public String getNome() {
        return nome;
    }

    public String getAtributo() {
        return atributo;
    }
    
    public String getResistencia() {
        return resistencia;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }
        
}
