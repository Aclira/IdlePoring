// Contém o corpo principal do programa

package expurgobelzebobo.principal;

import expurgobelzebobo.personagens.*;
import expurgobelzebobo.elementos.Batalha;
import expurgobelzebobo.elementos.racas.*;
import expurgobelzebobo.principal.flyweight.FlyweightFactory;
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
            System.out.println("O que deseja fazer?");
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
                    System.out.println("\n" + inimigo_1.getNome() + " apareceu.");
                    Batalha batalhaNormal = new Batalha(heroi, inimigo_1, nivel);
                    inimigo_1.setHp(nivel*50);
                    break;
                case 2:
                    System.out.println("\nDEMÔNIO APARECEU !!");
                    Demonio demonio = new Demonio();
                    Inimigo inimigo_2 = new Inimigo(demonio, true, nivel);
                    Batalha batalhaBoss = new Batalha(heroi, inimigo_2, nivel);
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