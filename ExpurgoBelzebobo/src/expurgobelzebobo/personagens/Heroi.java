// Contém a definição de Herói.

package expurgobelzebobo.personagens;

import expurgobelzebobo.elementos.Bolsa;
import expurgobelzebobo.elementos.classes.Classe;
import expurgobelzebobo.elementos.armas.Arma;
import expurgobelzebobo.elementos.trajes.Traje;

import java.util.Random;

public class Heroi extends Personagem {
    
    // Características do herói
    
    private Classe classe;                  // Classe do herói
    private Arma arma;                      // Arma do herói
    private Traje traje;                    // Traje do herói
    private int experiencia = 0;            // Experiência do herói
    public final Bolsa bolsa = new Bolsa(); // Bolsa do herói
    
    // Experiência máxima do herói
    
    private final int EXP_MAX = 900;
    
    // Construtor para criação do herói

    public Heroi(Classe classe, Arma arma, Traje traje, String nome) {
        super(nome, 1);
        this.classe = classe;
        this.arma = arma;
        this.traje = traje;
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
        if(this.experiencia + experiencia >= EXP_MAX) {
            this.experiencia = EXP_MAX;
        } else {
            this.experiencia = this.experiencia + experiencia;
        }        
    }
    
    // Método de ataque
    
    public double ataque(Inimigo inimigo, boolean erro, boolean critico) {
        
        Random gerador = new Random(); // Cria o objeto gerador, para gerar números aleatórios
        
        int fatorCritico = 2;                // Multiplicador de crítico
        int fatorErro = 0;                   // Mutiplicador de erro
        int fatorSorte = gerador.nextInt(5); // Calcula a sorte do herói neste ataque, um número entre 0 e 10
        double danoGerado;                   // Dano gerado pelo herói neste ataque
        
        // Variáveis auxiliares para armazenar os atributos do inimigo
        
        String resistencia = inimigo.getRaca().getResistencia(); // Atributo ao qual o inimigo é resistente
        String fraqueza = inimigo.getRaca().getFraqueza();       // Atributo ao qual o inimigo é vulnerável
        double defesa = inimigo.getDefesa();                     // Defesa do inimigo
        
        // Calcula a defesa do inimigo para o ataque atual de acordo seus atributos e a arma do herói
        
        if(arma.getAtributo().equals(resistencia)) {
            defesa = defesa + 0.30*defesa;
        } else if(arma.getAtributo().equals(fraqueza)) {
            defesa = defesa - 0.30*defesa;
        }
        
        // Calcula o dano infligido ao inimigo considerando o fator de erro e o fator de crítico
        
        danoGerado = (getAtaque()*getInteligencia()/defesa) + fatorSorte;
        
        if(erro) {
            danoGerado = danoGerado*fatorErro;
        } else if(critico) {
            danoGerado = danoGerado*fatorCritico;
        }
        
        inimigo.setHp(inimigo.getHp() - danoGerado); // Seta o novo hp do inimigo
        return danoGerado;                           // Retorna o dano gerado
    }
}
