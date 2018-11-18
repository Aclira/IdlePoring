// Contém a definição genérica de Arma.

package expurgobelzebobo.elementos.armas;

import expurgobelzebobo.elementos.Atributo;

public abstract class Arma {
    
    protected static Atributo atb; // Carrega a lista de atributos
    
    // Características da arma
    
    private final String nome;       // Nome da arma
    private final String atributo;   // Recebe o atributo da arma
    private final float fatorAtaque; // Bônus de ataque da arma
    private boolean liberado;        // Liberadade para utilização
    
    // Construtor para criação da arma

    public Arma(String nome, String atributo, float fatorAtaque, boolean liberado) {
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

    public float getFatorAtaque() {
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
