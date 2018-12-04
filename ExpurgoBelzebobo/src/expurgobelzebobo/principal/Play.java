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
    
    

    
    // Método para selecionar uma raça aleatória
    private static Raca getRandomRaca(Raca racas[]){
        //Raca racas[] = {elfo, ogro, planta, slime};
        return racas[gerador.nextInt(racas.length)];
    }
    
    public static void main(String[] args) { 
        int nivel = 1;
        
        
        Ogro ogro = new Ogro();
        Elfo elfo = new Elfo();
        Planta planta = new Planta();
        Slime slime = new Slime();
        

        

        Scanner entrada = new Scanner(System.in); // Armazena as entradas do usuário
        Metodos metodos = new Metodos();          // Instancia a classe métodos
        
        // Inicializa o jogo
        
        System.out.println("Bem vindo ao Idle Demon!"); // Mensagem inicial
        Heroi heroi = metodos.criarHeroi();             // Cria um nome herói
        boolean jogar = true;                           // Seta a variável de controle do laço principal
                                          // Seta o nível inicial dos inimigos como 1
        
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
                    Raca[] racas = {ogro, elfo, planta, slime};
                    Inimigo inimigo_1 = (Inimigo)FlyweightFactory.getInimigo(getRandomRaca(racas));
                    Batalha batalhaNormal = new Batalha(heroi, inimigo_1, nivel);
                    System.out.println(heroi.getExperiencia());
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