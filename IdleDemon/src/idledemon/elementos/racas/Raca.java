// Contém a definição genérica de Raça

package idledemon.elementos.racas;

import idledemon.elementos.Atributo;
import idledemon.elementos.Habilidade;

import java.util.ArrayList;

public class Raca { 
    
    protected static Atributo atb = new Atributo();              // Carrega a lista de atributos
    private final ArrayList<Habilidade> hab = new ArrayList<>(); // Cria uma lista de habilidades
    
    // Características da raça
    
    private final String nome;        // Nome da raça
    private final String resistencia; // Atributo ao qual a raça é resistente
    private final String fraqueza;    // Atributo ao qual a raça é vulnerável
        
    // Construtor para criação da raça
    
    public Raca(String nome, String resistencia, String fraqueza) {
        this.nome = nome;
        this.resistencia = resistencia;
        this.fraqueza = fraqueza;
    }
    
    // Getters para leitura das características da raça

    public String getNome() {
        return nome;
    }
    
    public String getResistencia() {
        return resistencia;
    }

    public String getFraqueza() {
        return fraqueza;
    }
    
    // Métodos para manipulação da lista de habilidades
    
    // Criar novas habilidades
    
    protected void novaHabilidade(String nome, String atributo) {
        hab.add(new Habilidade(nome, atributo));
    }
    
    // Conferir as habilidades
    
    public int numeroDeHabilidades() {
        return hab.size();
    }
    
    // Verificar o nome da habilidade
    
    public String nomeHabilidade(int indice) {
        return hab.get(indice).getNome();
    }
    
    // Verificar o atributo da habilidade
    
    public String atributoHabiliade(int indice) {
        return hab.get(indice).getAtributo();
    }
}
