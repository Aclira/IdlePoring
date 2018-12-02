// Contém a definição de inimigo

package expurgobelzebobo.personagens;

import expurgobelzebobo.elementos.racas.Raca;

import java.util.Random;

public class Inimigo extends Personagem {
    
    // Características do inimigo
    
    private Raca raca;    // Raça do inimigo
    private boolean boss; // Determina se o inimigo é um chefe de fase
    
    // Constutor para criação do inimigo
    
    public Inimigo(Raca raca, boolean boss, int nivel) {        
        super(raca.getNome(), nivel);
        this.boss = boss;
        this.raca = raca;
    }
    
    // Getters para leitura das características
    
    public Raca getRaca() {
        return raca;
    }

    public boolean isBoss() {
        return boss;
    }
    
    public void setBoss(boolean boss) {
        this.boss = boss;
    }
    
    
    // Método de ataque
    
    public double ataque(Heroi heroi, boolean erro, boolean critico) {
        
        Random gerador = new Random(); // Cria o objeto gerador, para gerar números aleatórios
        
        int fatorCritico = 2; // Multiplicador de crítico
        int fatorErro = 0;    // Mutiplicador de erro
        int fatorSorte;       // Calcula a sorte do inimigo neste ataque
        double danoGerado;    // Dano gerado pelo inimigo neste ataque
        
        // Variáveis auxiliares para armazenar os atributos do herói
        
        String resistencia = heroi.getClasse().getResistencia(); // Atributo ao qual o herói é resistente
        String fraqueza = heroi.getClasse().getFraqueza();       // Atributo ao qual o herói é vulnerável
        String traje = heroi.getTraje().getAtributo();           // Atributo do traje do herói
        double defesa = heroi.getDefesa();                       // Defesa do inimigo
        
        // Calcula a defesa do herói para o ataque atual de acordo seus atributos e a habilidade do inimigo
        
        if(raca.getAtributo().equals(resistencia) || raca.getAtributo().equals(traje)) {
            defesa = defesa + 0.30*defesa;
        } else if(raca.getNomeHabilidade().equals(fraqueza)) {
            defesa = defesa - 0.30*defesa;
        }
        
        // Calcula o dano infligido ao herói considerando o fator de erro, o fator de crítico e o fator de sorte
        
        if(boss) {
            fatorSorte = gerador.nextInt(10);
        } else {
            fatorSorte = gerador.nextInt(5);
        }
        
        danoGerado = (getAtaque()*getInteligencia()/defesa) + fatorSorte;
        
        if(erro && boss == false) {
            danoGerado = danoGerado*fatorErro;
        } else if(critico) {
            danoGerado = danoGerado*fatorCritico;
        }
        
        heroi.setHp(heroi.getHp() - 1);//danoGerado); // Seta o novo hp do herói
        return danoGerado;                       // Retorna o dano gerado
    }
}
