// Contém a definição de Herói.

package expurgobelzebobo.personagens;

import expurgobelzebobo.elementos.Bolsa;
import expurgobelzebobo.elementos.classes.Classe;
import expurgobelzebobo.elementos.armas.Arma;
import expurgobelzebobo.elementos.itens.Item;
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

    private void setExperiencia(int experiencia) {
        if(this.experiencia + experiencia >= EXP_MAX) {
            this.experiencia = EXP_MAX;
        } else {
            this.experiencia = this.experiencia + experiencia;
        }        
    }
    
    // Método para atualizar o nível
    
    public void atualizarNivel(int experiencia) {
        
        setExperiencia(experiencia); // Adiciona a experiência recebida à experiência atual
        
        int nivel = (this.experiencia + 100)/100; // Calcula o nível para a experiência atual
        
        // Calcula a mudança nos atributos, caso o nível para a experiência atual seja maior que o nível atual
        
        if(nivel > getNivel()) {
            
            setNivel(nivel);
            setAtaque(getAtaque() + CONST_BAS);
            setDefesa(getDefesa() + CONST_BAS);
            setInteligencia(getInteligencia() + (CONST_BAS/10));
            setHp(getHp() + CONST_BAS);
        }
    }
    
    // Método para calcular os bônus de arma e traje
    
    private void bonusEquipamento(Arma arma, Traje traje) {
        
        int nivel = getNivel();       // Recebe o nivel atual do herói
        int ataque = nivel*CONST_BAS; // Cacula o ataque base
        int defesa = nivel*CONST_BAS; // Calcula a defesa base
        
        // Compara o atributo da classe com o atributo da arma para calcular o bônus de ataque
        
        if(classe.getAtributo().equals(arma.getAtributo())) {
            setAtaque((int)(ataque + ataque*arma.getFatorAtaque()));
        }
        
        // Compara o atributo da classe com o atributo do traje para calcular o bônus de defesa
        
        if(classe.getAtributo().equals(traje.getAtributo())) {
            setDefesa((int)(defesa + defesa*traje.getFatorDefesa()));
        }
    }
    
    // Método para usar item
    
    public void usarItem(Item item) {
        
        int nivel = item.getNivel(); // Armazena o nível do item
        int ataque = getAtaque();    // Armazena o ataque do herói
        int defesa = getDefesa();    // Armazena a defesa do herói
        double hp = getHp();         // Armazena o hp do herói
        
        setAtaque((int)(ataque + item.getFatorAtaque()*nivel*ataque)); // Calcula o bônus de ataque do item
        setDefesa((int)(defesa + item.getFatorDefesa()*nivel*defesa)); // Calcula o bônus de defesa do item
        setHp(hp + item.getFatorHp()*nivel*hp);                        // Insere o fator de recuperação de hp
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
