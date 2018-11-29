// Contém a definição genérica de Classe.

package expurgobelzebobo.elementos.classes;

import expurgobelzebobo.elementos.Atributo;

public abstract class Classe {
    
    protected static Atributo atb = new Atributo(); // Carrega a lista de atributos
    
    // Características da classe
    
    private final String nome; // Nome da classe
    private final String atributo; // Atributo da classe
    private final String resistencia; // Atributo ao qual a classe é resistente
    private final String fraqueza; // Atributo ao qual a classe é vulnerável
    private final double fatorAtaque; // Bônus de ataque que a classe recebe
    private final double fatorDefesa; // Bônus de defesa que a classe recebe
    private final double fatorInteligencia; // Bônus de inteligência que a classe recebe    
    
    // Construtor para criação da classe

    public Classe(String nom, String atr, String res, String fra, double ftAtq, double ftDef, double ftInt) {
        this.nome = nom;
        this.atributo = atr;
        this.resistencia = res;
        this.fraqueza = fra;
        this.fatorAtaque = ftAtq;
        this.fatorDefesa = ftDef;
        this.fatorInteligencia = ftInt;
    }
    
    // Getters para leitura das características da classe

    public static Atributo getAtb() {
        return atb;
    }

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

    public double getFatorAtaque() {
        return fatorAtaque;
    }

    public double getFatorDefesa() {
        return fatorDefesa;
    }

    public double getFatorInteligencia() {
        return fatorInteligencia;
    }    
    
}
