// Contém os métodos auxiliares para manipulação de objetos relativos ao herói

package expurgobelzebobo.principal;

import expurgobelzebobo.personagens.*;
import expurgobelzebobo.elementos.armas.*;
import expurgobelzebobo.elementos.classes.*;
import expurgobelzebobo.elementos.trajes.*;

import java.util.Scanner;

public class Metodos {
    
    private final Scanner entrada = new Scanner(System.in); // Armazena as entradas do uusário
    
    // Construtor da classe: existe para que seja possível instanciá-la
    
    public Metodos() {
        
    }
    
    // Método para criar herói
    
    protected Heroi criarHeroi() {
        
        System.out.print("Informe o seu nome: ");
        String nome = entrada.toString();
        
        System.out.println("Escolha a sua classe: ");
        System.out.println("1 - Arqueiro");
        System.out.println("2 - Guerreiro");
        System.out.println("3 - Mago");
        System.out.print("Escolha: ");
        int escolha = entrada.nextInt();
        
        switch (escolha) {
            case 1:
                Arqueiro arqueiro = new Arqueiro();
                Arco arco = new Arco(true);
                Jaqueta jaqueta = new Jaqueta(true);
                Heroi heroiArqueiro = new Heroi(arqueiro, arco, jaqueta, nome);
                return heroiArqueiro;
            case 2:
                Guerreiro guerreiro = new Guerreiro();
                Espada espada = new Espada(true);
                Armadura armadura = new Armadura(true);
                Heroi heroiGuerreiro = new Heroi(guerreiro, espada, armadura, nome);
                return heroiGuerreiro;
            default:
                Mago mago = new Mago();
                Cajado cajado = new Cajado(true);
                Tunica tunica = new Tunica(true);
                Heroi heroiMago = new Heroi(mago, cajado, tunica, nome);
                return heroiMago;
        }
    }
    
    // Método para trocar de arma
    
    protected void trocarArma(Heroi heroi) {
        
        System.out.println("Escolha a arma que deseja utilizar:");
        System.out.println("ATENÇÃO: trocar de arma vai remover todos os bônus de Estamina.");
        System.out.println("1 - Arco: ideal para arqueiros");
        System.out.println("2 - Cajado: ideal para magos");
        System.out.println("3 - Espada: ideal para guerreiros");
        System.out.print("Escolha: ");
        
        int escolha = entrada.nextInt();
        
        switch (escolha) {
            case 1:
                Arco arco = new Arco(true);
                heroi.setArma(arco);
                break;
            case 2:
                Cajado cajado = new Cajado(true);
                heroi.setArma(cajado);
                break;
            case 3:
                Espada espada = new Espada(true);
                heroi.setArma(espada);
                break;
        }
    }
    
    // Método para trocar de traje
    
    protected void trocarTraje(Heroi heroi) {
        
        System.out.println("Escolha o traje que deseja utilizar:");
        System.out.println("ATENÇÃO: trocar de traje vai remover todos os bônus de Adrenalina.");
        System.out.println("1 - Armadura: ideal para guerreiros");
        System.out.println("2 - Jaqueta: ideal para arqueiros");
        System.out.println("3 - Túnica: ideal para magos");
        System.out.print("Escolha: ");
        
        int escolha = entrada.nextInt();
        
        switch (escolha) {
            case 1:
                Armadura armadura = new Armadura(true);
                heroi.setTraje(armadura);
                break;
            case 2:
                Jaqueta jaqueta = new Jaqueta(true);
                heroi.setTraje(jaqueta);
                break;
            case 3:
                Tunica tunica = new Tunica(true);
                heroi.setTraje(tunica);
                break;
        }
    }
    
    // Método para usar item
    
    protected void usarItem(Heroi heroi) {
        
        System.out.println("Escolha o item que dejesa utilizar:");
        heroi.bolsa.exibirItens();
        System.out.print("Escolha: ");
        
        int escolha = entrada.nextInt();
        
        // Dados relativos ao item
        
        int nivel = heroi.bolsa.itens.get(escolha-1).getNivel();                // Armazena o nível do item
        int ataque = heroi.getAtaque();                                         // Armazena o ataque do herói
        int defesa = heroi.getDefesa();                                         // Armazena a defesa do herói
        double hp = heroi.getHp();                                              // Armazena o hp do herói
        
        // Dados relativos ao herói
        
        double fatorAtaque = heroi.bolsa.itens.get(escolha-1).getFatorAtaque(); // Armaneza o bônus de ataque
        double fatorDefesa = heroi.bolsa.itens.get(escolha-1).getFatorDefesa(); // Armazena o bônus de defesa
        double fatorHp = heroi.bolsa.itens.get(escolha-1).getFatorHp();         // Armazena o recuperador de HP
        
        // Atualização de atributos
        
        heroi.setAtaque((int)(ataque + fatorDefesa*nivel*ataque)); // Calcula o bônus de ataque do item
        heroi.setDefesa((int)(defesa + fatorAtaque*nivel*defesa)); // Calcula o bônus de defesa do item
        heroi.setHp(hp + fatorHp*nivel*hp);                        // Insere o fator de recuperação de hp
        
        heroi.bolsa.removerItem(heroi.bolsa.itens.get(escolha-1)); // Remove o item utilizado
    }
}
