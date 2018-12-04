// Alunos: Acza Lira Silva (201704940024)
//         José de Senna Pereira Neto (201704940010)

// Padrão flyweigth: aplicado na criação de novos inimigos para a batalha
// Padrão iterator: aplicado na manipulação de objetos na bolsa do herói

// Contém o corpo principal do programa

package idledemon.principal;

import idledemon.principal.flyweight.FlyweightFactory;
import idledemon.personagens.*;
import idledemon.elementos.racas.*;
import idledemon.elementos.Batalha;

import java.util.Random;
import java.util.Scanner;

public class Play {
    
    static Random gerador = new Random(); // Cria o objeto gerador para gerar números aleatórios
    
    // Inicializa as instâncias base das raças
    
    private static final Ogro OGRO = new Ogro();
    private static final Elfo ELFO = new Elfo();
    private static final Planta PLANTA = new Planta();
    private static final Slime SLIME = new Slime();

    // Método para selecionar uma raça aleatória
    
    private static Raca getRandomRaca() {
        Raca racas[] = {ELFO, OGRO, PLANTA, SLIME};
        return racas[gerador.nextInt(racas.length)];
    }
    
    // Seta os atributos iniciais dos inimigos comuns
    
    private static void setAtributos(Inimigo inimigo, int nivelFase) {
        inimigo.setNivel(nivelFase);
        inimigo.setAtaque(nivelFase*(inimigo.getConst()/2));
        inimigo.setDefesa(nivelFase*(inimigo.getConst()/2));
        inimigo.setInteligencia(nivelFase*((inimigo.getConst()/2)/10));
        inimigo.setHp(nivelFase*(inimigo.getConst()/2));
    }
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in); // Armazena as entradas do usuário
        Metodos metodos = new Metodos();          // Instancia a classe métodos
        
        // Inicializa o jogo
        
        System.out.println("Bem vindo ao Idle Demon!"); // Mensagem inicial
        Heroi heroi = metodos.criarHeroi();             // Cria um nome herói
        boolean jogar = true;                           // Seta a variável de controle do laço principal
        int nivel = 1;                                  // Seta o nível inicial dos inimigos como 1
        
        while(jogar) {
            
            // Exibe um menu com as opções disponíveis no jogo
            
            System.out.println();
            System.out.println("Nível dos inimigos: " + nivel + " (aumenta se vencer o boss)");
            System.out.print("HP de " + heroi.getNome() + ": " + (int)heroi.getHp() + ".");
            System.out.println(" O que deseja fazer?");
            System.out.println("1 - Nova batalha");
            System.out.println("2 - Desafia boss");
            System.out.println("3 - Ver atributos");
            System.out.println("4 - Trocar Arma");
            System.out.println("5 - Trocar traje");
            System.out.println("6 - Usar item");
            System.out.println("  - Sair");
            System.out.print("Escolha: ");
            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Inimigo inimigo_1 = (Inimigo)FlyweightFactory.getInimigo(getRandomRaca());
                    setAtributos(inimigo_1, nivel);
                    System.out.print("\n" + inimigo_1.getNome() + " apareceu.");
                    System.out.print(" HP de " + heroi.getNome() + ": " + (int)heroi.getHp());
                    System.out.println(" HP de " + inimigo_1.getNome() + ": " + (int)inimigo_1.getHp());
                    Batalha batalhaNormal = new Batalha(heroi, inimigo_1, nivel);
                    break;
                case 2:
                    Demonio demonio = new Demonio();
                    Inimigo inimigo_2 = new Inimigo(demonio, true, nivel);
                    System.out.print("\nDEMÔNIO APARECEU !!");
                    System.out.print("\nHP de " + heroi.getNome() + ": " + (int)heroi.getHp());
                    System.out.println(" HP de " + inimigo_2.getNome() + ": " + (int)inimigo_2.getHp());
                    Batalha batalhaBoss = new Batalha(heroi, inimigo_2, nivel);
                    heroi.bolsa.setTamanho(nivel);
                    nivel++;
                    break;
                case 3:
                    metodos.exibirAtributos(heroi);
                    break;
                case 4:
                    metodos.trocarArma(heroi);
                    break;
                case 5:
                    metodos.trocarTraje(heroi);
                    break;
                case 6:
                    metodos.usarItem(heroi);
                    break;
                default:
                    jogar = false;
                    break;
            }
        }
    }
}