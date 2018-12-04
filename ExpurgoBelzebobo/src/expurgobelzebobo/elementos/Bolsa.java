package expurgobelzebobo.elementos;

import expurgobelzebobo.elementos.itens.Item;

import java.util.ArrayList;

public class Bolsa {
    
    private int tamanho; // Numero máximo de itens que a bolsa é capaz de comportar
    
    // Lista de itens que a bolsa pode comportar
    
    public final ArrayList<Item> itens = new ArrayList<>();
    
    // Método construtor para criação da bolsa
    
    public Bolsa() {
        this.tamanho = 10;
    }
    
    // Setter para alteração do tamanho da bolsa

    public void setTamanho(int expancao) {
        this.tamanho = this.tamanho + expancao;
    }
    
    // Métodos para manipulação dos itens contidos na bolsa
    
    public void adicionarItem(Item item) {
        itens.add(item);
    }
    
    public void removerItem(Item item) {
        itens.remove(item);
    }
    
    public void exibirItens() {
        for(int i = 0; i < itens.size(); i++) {
            System.out.print(i+1 + " - " + itens.get(i).getNome() + "(n" + itens.get(i).getNivel() + "): ");
            
            switch (itens.get(i).getNome()) {
                case "Adrenalina":
                    System.out.println("bônus de " + itens.get(i).getFatorDefesa()*100 + "% na defesa.");
                    break;
                case "Estamina":
                    System.out.println("bônus de " + itens.get(i).getFatorAtaque()*100 + "% no Ataque.");
                    break;
                default:
                    System.out.println("recupera " + itens.get(i).getFatorHp()*100 + "% do HP.");
                    break;
            }
        }
    }
    
    // Verifica se ainda existe espaço disponível na bolsa
    
    public boolean espacoDisponivel() {
        return itens.size() < tamanho;
    }
}
