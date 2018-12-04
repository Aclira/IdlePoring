// Contém a definição genérica de personagem.

package idledemon.personagens;

public abstract class Personagem {
    
    // Características do personagem
    
    private String nome;      // Nome do personagem
    private int nivel;        // Nivel do personagem
    private int ataque;       // Pontos de ataque do pesonagem
    private int defesa;       // Pontos de defesa do personagem
    private int inteligencia; // Pontos de inteligência do personagem
    private double hp;        // Pontos de vida do personagem
    
    // Constante básica para o cálculo de atributos
    
    protected final int CONST_BAS = 100;
    
    // Construtor para criação do personagem

    // Versão do herói e do do boss
    
    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = nivel*CONST_BAS;
        this.defesa = nivel*CONST_BAS;
        this.inteligencia = nivel*(CONST_BAS/10);
        this.hp = nivel*CONST_BAS;
    }
    
    // Versão do inimigo comum
    
    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 0;
        this.ataque = 0;
        this.defesa = 0;
        this.inteligencia = 0;
        this.hp = 0;
    }
    
    // Getters e setters para leitura e manipulação das características
    
    // Constante base
    
    public int getConst() {
        return CONST_BAS;
    }
    
    // Atributo nome

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Atributo nivel

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;        
    }
    
    // Atributo ataque

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    // Atributo defesa

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    // Atributo inteligencia

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }   
        
    // Atributo hp

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        if(hp < 1) {
            this.hp = 0.0;
        } else if (hp > nivel*CONST_BAS) {
            this.hp = nivel*CONST_BAS;
        } else {
            this.hp = hp;
        }
    }
}
