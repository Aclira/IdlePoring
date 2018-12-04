// Contém a definição genérica de Arma.

package idledemon.elementos.armas;

import idledemon.elementos.Atributo;

public abstract class Arma {
    protected static Atributo atb = new Atributo(); // Carrega a lista de atributos
    
    // Características da arma
    
    private final String nome;        // Nome da arma
    private final String atributo;    // Recebe o atributo da arma
    private final double fatorAtaque; // Bônus de ataque da arma
    private boolean liberado;         // Liberadade para utilização
    
    // Construtor para criação da arma

    public Arma(String nome, String atributo, double fatorAtaque, boolean liberado) {
        this.nome = nome;
        this.atributo = atributo;
        this.fatorAtaque = fatorAtaque;
        this.liberado = liberado;
    }
    
    // Getters para leitura dos características da arma

    public String getNome() {
        return nome;
    }

    public String getAtributo() {
        return atributo;
    }

    public double getFatorAtaque() {
        return fatorAtaque;
    }

    public boolean isLiberado() {
        return liberado;
    }
    
    // Setter para manipulação do fator de liberação

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }    
}
