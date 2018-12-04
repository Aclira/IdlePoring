package expurgobelzebobo.elementos;

import expurgobelzebobo.elementos.itens.Item;
import expurgobelzebobo.principal.iterator.*;

public class Bolsa {
    
    private int tamanho; // Numero máximo de itens que a bolsa é capaz de comportar
    
    // Cria uma nova lista de itens: contém os exemplos com ArrayList e Vetor, para demonstrar o Iterator
    
    public final ItemArrayList lista = new ItemArrayList(); // Utilizando ArrayList
    public final ItemVetor Lista = new ItemVetor();         // Utilizando Vetores
    
    // Construtor da bolsa, que define o seu tamanho
    
    public Bolsa() {
        this.tamanho = 10;
    }
    
    // Setter para alteração do tamanho da bolsa

    public void setTamanho(int expancao) {
        this.tamanho = this.tamanho + expancao;
    }
    
    // Verifica se ainda existe espaço disponível na bolsa
    
    public boolean espacoDisponivel() {
        return lista.tam() < tamanho;
    }
    
    // Métodos para manipulação dos itens contidos na bolsa
    
    public void adicionarItem(Item item) {
        lista.add(item);
    }
    
    public void removerItem(Item item) {
        lista.rem(item);
    }
    
    public void exibirItens() {
        for(int i = 0; i < lista.tam(); i++) {
            System.out.print(i+1 + " - " + lista.next(i).getNome() + "(n" + lista.next(i).getNivel() + "): ");
            
            switch (lista.next(i).getNome()) {
                case "Adrenalina":
                    System.out.println("bônus de " + lista.next(i).getFatorDefesa()*100 + "% na defesa.");
                    break;
                case "Estamina":
                    System.out.println("bônus de " + lista.next(i).getFatorAtaque()*100 + "% no Ataque.");
                    break;
                default:
                    System.out.println("recupera " + lista.next(i).getFatorHp()*100 + "% do HP.");
                    break;
            }
        }
    }
}
