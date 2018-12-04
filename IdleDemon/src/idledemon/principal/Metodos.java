// Contém os métodos auxiliares para manipulação de objetos relativos ao herói

package idledemon.principal;

import idledemon.personagens.Heroi;
import idledemon.elementos.classes.*;
import idledemon.elementos.armas.*;
import idledemon.elementos.trajes.*;

import java.util.Scanner;

public class Metodos {
    
    private final Scanner entrada = new Scanner(System.in); // Armazena as entradas do uusário
    
    public Metodos() {} // Construtor da classe: existe para que seja possível acessar os seus métodos
    
    // Método para criar o herói
    
    protected Heroi criarHeroi() {
        
        // Recebe o nome do jogador
        
        System.out.print("\nInforme o seu nome: ");
        String nome = entrada.nextLine();
        
        // Exibe um menu com as opções de classe
        
        System.out.println("\nEscolha a sua classe: ");
        
        System.out.print("1 - Arqueiro: bônus de 30% na defesa base, ");
        System.out.println("resistente a ataques mágicos e vulnerável a ataques físicos");
        
        System.out.print("2 - Guerreiro: bônus de 30% no ataque base,");
        System.out.println("resistente a ataques a distância e vulnerável a ataques mágicos");
        
        System.out.print("3 - Mago: bônus de 30% na inteligência base,");
        System.out.println("resistente a ataques a distância e vulnerável a ataques físicos");
        
        System.out.print("Escolha: ");
        int escolha = entrada.nextInt();
        
        // Cria um novo heroi de acordo com a classe escolhida pelo jogador
        
        switch (escolha) {
            case 1:
                Arqueiro arqueiro = new Arqueiro();
                Arco arco = new Arco(true);
                Jaqueta jaqueta = new Jaqueta(true);
                Heroi heroiArqueiro = new Heroi(arqueiro, arco, jaqueta, nome);
                bonusClasse(heroiArqueiro);
                return heroiArqueiro;
            case 2:
                Guerreiro guerreiro = new Guerreiro();
                Espada espada = new Espada(true);
                Armadura armadura = new Armadura(true);
                Heroi heroiGuerreiro = new Heroi(guerreiro, espada, armadura, nome);
                bonusClasse(heroiGuerreiro);
                return heroiGuerreiro;
            default:
                Mago mago = new Mago();
                Cajado cajado = new Cajado(true);
                Tunica tunica = new Tunica(true);
                Heroi heroiMago = new Heroi(mago, cajado, tunica, nome);
                bonusClasse(heroiMago);
                return heroiMago;
        }
    }
    
    // Método para exibir atributos
    
    protected void exibirAtributos(Heroi heroi) {
        
        System.out.println("\nNome: " + heroi.getNome());
        System.out.println("Classe: " + heroi.getClasse().getNome());
        System.out.println("Tipo de ataque: " + heroi.getClasse().getAtributo());
        System.out.println("Resistente a: " + heroi.getClasse().getResistencia());
        System.out.println("Vulneravel a: " + heroi.getClasse().getFraqueza());
        System.out.println("Arma: " + heroi.getArma().getNome());
        System.out.println("Traje: " + heroi.getTraje().getNome());
        System.out.println("HP: " + (int)heroi.getHp());
        System.out.println("Ataque: " + heroi.getAtaque());
        System.out.println("Defesa: " + heroi.getDefesa());
        System.out.println("Inteligência: " + heroi.getInteligencia());
        System.out.println("Nível: " + heroi.getNivel());
        System.out.println("Experiência: " + heroi.getExperiencia());
    }
    
    // Método para trocar de arma
    
    protected void trocarArma(Heroi heroi) {
        
        // Exibe um menu com as armas disponíveis
        
        System.out.println("\nATENÇÃO: trocar de arma vai remover todos os bônus de Estamina.");
        System.out.println("Escolha a arma que deseja utilizar:");
        
        System.out.print("1 - Arco: bônus de 30% ao ataque de arqueiros ");
        System.out.println("e vantagem contra inimigos vulneráveis a ataques a distância (qualquer classe)");
        
        System.out.print("2 - Cajado: bônus de 30% ao ataque de magos ");
        System.out.println("e vantagem contra inimigos vulneráveis a ataques mágicos (qualquer classe)");
        
        System.out.print("3 - Espada: bônus de 30% ao ataque de guerreiros ");
        System.out.println("e vantagem contra inimigos vulneráveis a ataques físicos (qualquer classe)");
        
        System.out.println("  - Cancelar");
        System.out.print("Escolha: ");        
        int escolha = entrada.nextInt();
        
        // Esquipa a arma escolhida pelo jogador
        
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
            default:
                break;
        }
        
        bonusEquipamento(heroi); // Calcula o bônus de equipamento
    }
    
    // Método para trocar de traje
    
    protected void trocarTraje(Heroi heroi) {
        
        // Exibe um menu com os trajes disponíveis
        
        System.out.println("\nATENÇÃO: trocar de traje vai remover todos os bônus de Adrenalina.");
        System.out.println("Escolha o traje que deseja utilizar:");
        
        System.out.print("1 - Armadura: bônus de 30% na defesa de guerreiros e ");
        System.out.println("vantagem ao se defender de ataques físicos (qualquer classe)");
        
        System.out.print("2 - Jaqueta: bônus de 30% na defesa de arqueiros e ");
        System.out.println("vantagem ao se defender de ataques a distância (qualquer classe)");
        
        System.out.print("3 - Túnica: bônus de 30% na defesa de magos e");
        System.out.println("vantagem ao se defender de ataques mágicos (qualquer classe)");
        
        System.out.print("Escolha: ");        
        int escolha = entrada.nextInt();
        
        // Equipa o traje escolhido pelo jogador
        
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
            default:
                break;
        }
        
        bonusEquipamento(heroi); // Calcula o bônus de equipamento
    }
    
    // Método para usar item
    
    protected void usarItem(Heroi heroi) {
        
        // Exibe um menu com os itens disponíveis
        
        System.out.println("\nEscolha o item que dejesa utilizar:");
        heroi.bolsa.exibirItens();
        System.out.println("  - Cancelar");
        System.out.print("Escolha: ");        
        int escolha = entrada.nextInt();
        
        // Verifica se a escolha do jogador se encontra no intervalores de itens da bolsa
        
        if(escolha <= heroi.bolsa.lista.tam() && !heroi.bolsa.lista.empty()) {
            
            // Dados relativos ao item
        
            int nivel = heroi.bolsa.lista.next(escolha-1).getNivel(); // Armazena o nível do item
            int ataque = heroi.getAtaque();                           // Armazena o ataque do herói
            int defesa = heroi.getDefesa();                           // Armazena a defesa do herói
            double hp = heroi.getHp();                                // Armazena o hp do herói
        
            // Dados relativos ao herói
        
            double ftAtaque = heroi.bolsa.lista.next(escolha-1).getFatorAtaque(); // Armaneza o bônus de ataque
            double ftDefesa = heroi.bolsa.lista.next(escolha-1).getFatorDefesa(); // Armazena o bônus de defesa
            double ftHp = heroi.bolsa.lista.next(escolha-1).getFatorHp();         // Armazena o recuperador de HP
        
            // Atualização de atributos
        
            heroi.setAtaque((int)(ataque + ftDefesa*nivel*ataque)); // Calcula o bônus de ataque do item
            heroi.setDefesa((int)(defesa + ftAtaque*nivel*defesa)); // Calcula o bônus de defesa do item
            heroi.setHp(hp + ftHp*nivel*hp);                        // Insere o fator de recuperação de hp
        
            heroi.bolsa.removerItem(heroi.bolsa.lista.next(escolha-1)); // Remove o item utilizado
        }
    }
    
    // Método para calcular o bônus de classe
    
    private void bonusClasse(Heroi heroi) {
        
        int nivel = heroi.getNivel();                   // Recebe o nivel atual do herói
        int ataque = nivel*heroi.getConst();            // Cacula o ataque base
        int defesa = nivel*heroi.getConst();            // Calcula a defesa base
        int inteligencia = nivel*(heroi.getConst()/10); // Calcula inteligencia base
        
        double fatorAtaque = heroi.getClasse().getFatorAtaque();             // Recebe o fator de ataque
        double fatorDefesa = heroi.getClasse().getFatorDefesa();             // Recebe o fator de defesa
        double fatorInteligencia = heroi.getClasse().getFatorInteligencia(); // Recebe o fator de inteligência
        
        // Seta os atributos atualizados de acordo com a classe
        
        heroi.setAtaque((int)(ataque + fatorAtaque*ataque));
        heroi.setDefesa((int)(defesa + fatorDefesa*defesa));
        heroi.setInteligencia((int)(inteligencia + fatorInteligencia*inteligencia));
    }
    
    // Método para aplicar os bônus de arma e de traje: utilizado quando o jogador muda o equipamento
    
    private void bonusEquipamento(Heroi heroi) {
        
        int nivel = heroi.getNivel();        // Recebe o nivel atual do herói
        int ataque = nivel*heroi.getConst(); // Cacula o ataque base
        int defesa = nivel*heroi.getConst(); // Calcula a defesa base
        
        // Compara o atributo da classe com o atributo da arma para calcular o bônus de ataque
        
        if(heroi.getClasse().getAtributo().equals(heroi.getTraje().getAtributo())) {
            heroi.setAtaque((int)(ataque + ataque*heroi.getArma().getFatorAtaque()));
        }
        
        // Compara o atributo da classe com o atributo do traje para calcular o bônus de defesa
        
        if(heroi.getClasse().getAtributo().equals(heroi.getTraje().getAtributo())) {
            heroi.setDefesa((int)(defesa + defesa*heroi.getTraje().getFatorDefesa()));
        }
    }
    
    // Método para atualizar o nível
    
    public void atualizarNivel(Heroi heroi, int experiencia) {
        
        heroi.setExperiencia(experiencia); // Adiciona a experiência recebida à experiência atual
        
        int nivel = (heroi.getExperiencia() + 100)/100; // Calcula o nível para a experiência atual
        
        // Calcula a mudança nos atributos, caso o nível para a experiência atual seja maior que o nível atual
        
        if(nivel > heroi.getNivel()) {
            
            // Calcula os bônus adquiridos durante o jogo
        
            int ataque = heroi.getAtaque() - heroi.getNivel()*heroi.getConst();
            int defesa = heroi.getDefesa() - heroi.getNivel()*heroi.getConst();
            
            // Seta a experiência base para o novo vível
            
            heroi.setAtaque(heroi.getNivel()*heroi.getConst());
            heroi.setDefesa(heroi.getNivel()*heroi.getConst());
            heroi.setInteligencia(heroi.getNivel()*(heroi.getConst()/10));
            heroi.setHp(heroi.getNivel()*heroi.getConst());
            
            bonusClasse(heroi); // Acrescenta o bônus de classe
            
            // Adiciona os bônus adquiridos durante o jogo
            
            heroi.setNivel(nivel);
            heroi.setAtaque(heroi.getAtaque() + ataque);
            heroi.setDefesa(heroi.getDefesa() + defesa);
        }
    }
}
