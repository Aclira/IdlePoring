// Implementa a interface do padrão Iterator

package idledemon.principal.iterator;

import idledemon.elementos.itens.Item;

public interface InterfaceIterator {
    int tam();               // Retorna o tamanho da lista
    boolean empty();         // Verifica se a lista está vazia
    void add(Item item);     // Adiciona um item a lista
    void rem(Item item);     // Remove um item da lista
    Object next(int indice); // Retorna um elemento da lista 
}
