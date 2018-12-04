package expurgobelzebobo.elementos;

import expurgobelzebobo.elementos.armas.Arma;
import expurgobelzebobo.elementos.itens.Item;
import expurgobelzebobo.elementos.trajes.Traje;

import java.util.ArrayList;

public class Bolsa {
    
    private int tamanho; // Numero máximo de itens que a bolsa é capaz de comportar
    
    // Listas de itens que a bolsa pode comportar
    
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
    
    // Adicionar e remover uma arma da bolsa
    
    public void adicionarArma(Arma arma) {
        armas.add(arma);
    }
    
    public void removerArma(Arma arma) {
        armas.remove(arma);
    }
    
    // Adicionar e remover um item da bolsa
    
    public void adicionarItem(Item item) {
        itens.add(item);
    }
    
    public void removerItem(Item item) {
        itens.remove(item);
    }
    
    // Adicionar e remover um traje da bolsa
    
    public void adicionarTraje(Traje traje) {
        trajes.add(traje);
    }
    
    public void removerTraje(Traje traje) {
        trajes.remove(traje);
    }
    
    // Métodos para exibir o conteúdo da bolsa
    
    // Armas
    
    public void exibirArmas() {
        for(int i = 0; i < armas.size(); i++) {
            System.out.println(armas.get(i).getNome());
        }
    }
    
    // Trajes
    
    public void exibirTrajes() {
        for(int i = 0; i < trajes.size(); i++) {
            System.out.println(trajes.get(i).getNome());
        }
    }
    
    // Itens
    
    public void exibirItens() {
        for(int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i).getNome() + " (" + itens.get(i).getNivel() + ").");
        }
    }
    
    // Todos
    
    public void exibirObjetos() {
        exibirArmas();
        exibirTrajes();
        exibirItens();
    }
    
    // Verifica se ainda existe espaço disponível na bolsa
    
    private int quantidadeObjetos() {
        return armas.size() + itens.size() + trajes.size();
    }
    
    public boolean espacoDisponivel() {
        return quantidadeObjetos() < tamanho;
    }
}
