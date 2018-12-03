// Contém a definição genérica de personagem.

package expurgobelzebobo.personagens;

public abstract class Personagem {
    
    // Características do personagem
    
    private String nome;      // Nome do personagem
    private int nivel;        // Nivel do personagem
    private int ataque;       // Pontos de ataque do pesonagem
    private int defesa;       // Pontos de defesa do personagem
    private int inteligencia; // Pontos de inteligência do personagem
    private double hp;        // Pontos de vida do personagem
    
    // Nivel máximo de personagem e constante básica para o cálculo de atributos
    
    private final int NIVEL_MAX = 10;
    protected final int CONST_BAS = 100;
    
    // Construtor para criação do personagem

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = nivel*CONST_BAS;
        this.defesa = nivel*CONST_BAS;
        this.inteligencia = nivel*(CONST_BAS/10);
        this.hp = nivel*CONST_BAS;
    }
    
    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.ataque = nivel*CONST_BAS;
        this.defesa = nivel*CONST_BAS;
        this.inteligencia = nivel*(CONST_BAS/10);
        this.hp = nivel*CONST_BAS;
    }
    
    // Getters e setters para leitura e manipulação das características
    
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
        if(nivel >= NIVEL_MAX) {
            this.nivel = NIVEL_MAX;
        } else {
            this.nivel = nivel;
        }        
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
        } else {
            this.hp = hp;
        }       
    }
}
