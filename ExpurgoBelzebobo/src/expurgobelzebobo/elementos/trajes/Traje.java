// Contém a definição genérica de Traje.

package expurgobelzebobo.elementos.trajes;

import expurgobelzebobo.elementos.Atributo;

public abstract class Traje {
    
    protected static Atributo atb = new Atributo(); // Carrega a lista de atributos
    
    // Características do traje
    
    private final String nome;        // Nome da arma
    private final String atributo;    // Recebe o atributo da arma
    private final double fatorDefesa; // Bônus de defesa concedido ao personagem de classe com mesmo atributo
    private boolean liberado;         // Liberadade para utilização
    
    // Construtor para criação do traje

    public Traje(String nome, String atributo, double fatorAtaque, boolean liberado) {
        this.nome = nome;
        this.atributo = atributo;
        this.fatorDefesa = fatorAtaque;
        this.liberado = liberado;
    }
    
    // Getters para leitura das características do traje

    public String getNome() {
        return nome;
    }

    public String getAtributo() {
        return atributo;
    }

    public double getFatorDefesa() {
        return fatorDefesa;
    }

    public boolean isLiberado() {
        return liberado;
    }
    
    // Setter para manipulação do fator de liberação

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }    
}
