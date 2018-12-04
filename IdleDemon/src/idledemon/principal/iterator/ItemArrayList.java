// Exemplo de implemetação do iterator utilizando ArrayList

package idledemon.principal.iterator;

import idledemon.elementos.itens.Item;

import java.util.ArrayList;

public class ItemArrayList implements InterfaceIterator {
    
    private final ArrayList<Item> lista = new ArrayList<>(); // Cria uma nova lista do objeto item
    
    @Override // Retorna o tamanho da lista
    public int tam() {
       return lista.size();
    }
    
    @Override // Verifica se a lista está vazia
    public boolean empty() {
        return lista.isEmpty();
    }
    
    @Override // Adiciona um item a lista
    public void add(Item item) {
        lista.add(item);
    }
    
    @Override // Remove um item da lista
    public void rem(Item item) {
        lista.remove(item);
    }
    
    @Override // Retorna um item da lista
    public Item next(int indice) {
        return lista.get(indice);
    }
}
