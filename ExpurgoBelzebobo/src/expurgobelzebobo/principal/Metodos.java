// Contém os métodos principais do jogo

package expurgobelzebobo.principal;

import expurgobelzebobo.personagens.*;
import expurgobelzebobo.elementos.armas.*;
import expurgobelzebobo.elementos.trajes.*;

import java.util.Scanner;

public class Metodos {
    
    private Scanner entrada = new Scanner(System.in); // Armazena as entradas do uusário
    
    // Chama o método para troca de arma
    
    private void trocarArma(Heroi heroi) {
        
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
    
    // Chama o método para troca de traje
    
    private void trocarTraje(Heroi heroi) {
        
        System.out.println("Escolha a arma que deseja utilizar:");
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
}
