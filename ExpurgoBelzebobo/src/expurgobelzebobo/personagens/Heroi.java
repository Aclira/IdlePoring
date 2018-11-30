// Contém a definição de Herói.

package expurgobelzebobo.personagens;

import expurgobelzebobo.elementos.classes.Classe;
import expurgobelzebobo.elementos.armas.Arma;
import expurgobelzebobo.elementos.trajes.Traje;

public class Heroi extends Personagem {
    
    // Características do herói
    
    private Classe classe;
    private Arma arma;
    private Traje traje;
    private int experiencia;
    
    // Experiência máxima do herói
    
    private final int EXP_MAX = 900;
    
    // Construtor para criação do herói

    public Heroi(Classe classe, Arma arma, Traje traje, int experiencia, String nome) {
        super(nome, experiencia/100 + 1);
        this.classe = classe;
        this.arma = arma;
        this.traje = traje;
        this.experiencia = experiencia;
    }
    
    // Getters e Setters para leitura/manipulação das características
    
    // Atributo classe

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    // Atributo arma

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    // Atributo traje

    public Traje getTraje() {
        return traje;
    }

    public void setTraje(Traje traje) {
        this.traje = traje;
    }
    
    // Atributo experiencia

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if(experiencia > EXP_MAX) {
            this.experiencia = EXP_MAX;
        } else {
            this.experiencia = experiencia;
        }        
    }
        
}
