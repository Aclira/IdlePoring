// Contém o corpo principal do programa

package expurgobelzebobo.principal;

import expurgobelzebobo.personagens.*;
import expurgobelzebobo.elementos.Batalha;
import expurgobelzebobo.elementos.racas.*;
import expurgobelzebobo.flyweight.FlyweightFactory;
import static java.lang.Math.random;
import java.util.Random;

import java.util.Scanner;

public class Play {
  
    static Random gerador = new Random(); 
    static Ogro ogro = new Ogro();
    static Elfo elfo = new Elfo();
    static Planta planta = new Planta();
    static Slime slime = new Slime();
         
    
    public static void main(String[] args) { 

        
        Scanner entrada = new Scanner(System.in); // Armazena as entradas do usuário
        
        Metodos metodos = new Metodos();
        
        System.out.println("Bem vindo ao Idle Demon!");
        Heroi heroi = metodos.criarHeroi();
        boolean jogar = true;
        int nivel = 1;
        
        while(jogar) {
            
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Nova batalha");
            System.out.println("2 - Desafia boss");
            System.out.println("3 - Trocar Arma");
            System.out.println("4 - Trocar traje");
            System.out.println("5 - Usar item");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");
            
            int escolha = entrada.nextInt();
            
            switch (escolha) {
                case 1:
                    {
                        
                        Inimigo inimigo = (Inimigo)FlyweightFactory.getInimigo(getRandomRaca());
                        Batalha batalha = new Batalha(heroi, inimigo, nivel);
                        break;
                    }
                case 2:
                    {
                        Demonio demonio = new Demonio();
                        Inimigo inimigo_2 = new Inimigo(demonio, true, nivel);
                        Batalha batalha = new Batalha(heroi, inimigo_2, nivel);
                        nivel++;
                        break;
                    }
                case 3:
                    metodos.trocarArma(heroi);
                    break;
                case 4:
                    metodos.trocarTraje(heroi);
                    break;
                case 5:
                    metodos.usarItem(heroi);
                    break;
                default:
                    jogar = false;
                    break;
            }
        }
    }    
    private static Raca getRandomRaca(){
        Raca racas[] = {elfo, ogro, planta, slime};
        //return racas[(int)(Math.random()*racas.length)];
        return racas[(int)gerador.nextInt(racas.length)];
    }
    
}