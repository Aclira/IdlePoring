package expurgobelzebobo.elementos;

import expurgobelzebobo.elementos.armas.Arma;
import expurgobelzebobo.elementos.itens.Item;
import expurgobelzebobo.elementos.trajes.Traje;

import java.util.ArrayList;

public class Bolsa {
    
    private int tamanho; // Numero máximo de itens que a bolsa é capaz de comportar
    
    // Lista de itens que a bolsa pode comportar
    
    private final ArrayList<Arma> armas = new ArrayList<>();
    private final ArrayList<Item> itens = new ArrayList<>();
    private final ArrayList<Traje> trajes = new ArrayList<>();
    
    // Método construtor
    
    public Bolsa() {
        this.tamanho = 10;
    }
    
    // Setter para alteração do tamanho da bolsa

    public void setTamanho(int expancao) {
        this.tamanho = this.tamanho + expancao;
    }
    
    // Métodos para manipulação dos objetos da bolsa
    
    // Adicionar uma arma na lista
    
    public void adicionarArma(Arma arma) {
        armas.add(arma);
    }
    
    // Remover uma arma da lista
    
    public void removerArma(Arma arma) {
        armas.remove(arma);
    }
    
    // Adicionar um item na lista
    
    public void adicionarItem(Item item) {
        itens.add(item);
    }
    
    // Remover um item da lista
    
    public void removerItem(Item item) {
        itens.remove(item);
    }
    
    // Adicionar um traje na lista
    
    public void adicionarTraje(Traje traje) {
        trajes.add(traje);
    }
    
    // Remover um traje da lista
    
    public void removerTraje(Traje traje) {
        trajes.remove(traje);
    }
    
    // Método para verificar a quantidade de objetos na bolsa
    
    private int quantidadeObjetos() {
        return armas.size() + itens.size() + trajes.size();
    }
    
    // Método para verificar se a bolsa ainda tem espaço disponível
    
    public boolean espacoDisponivel() {
        return quantidadeObjetos() < tamanho;
    }
    
    // Exibe o conteúdo da bolsa
    
    public void exibirObjetos() {
        
        // Exibe as armas
        
        for(int i = 0; i < armas.size(); i++) {
            System.out.println(armas.get(i).getNome());
        }
        
        // Exibe os trajes
        
        for(int i = 0; i < trajes.size(); i++) {
            System.out.println(trajes.get(i).getNome());
        }
        
        // Exibe os itens
        
        for(int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i).getNome() + " (" + itens.get(i).getNivel() + ").");
        }
    }
}
