

import java.util.ArrayList;
import java.util.List;
// Classe FabricaEletrodomesticos (Publisher)
public class FabricaEletrodomesticos {
    private List<Loja> lojas = new ArrayList<>(); // Lista de lojas que receberão notificações
    private String produto;
    private int quantidade;

    // Método para adicionar uma loja à lista de assinantes
    public void addLoja(Loja loja) {
        lojas.add(loja);
    }

    // Método para remover uma loja da lista de assinantes
    public void removerLoja(Loja loja) {
        lojas.remove(loja);
    }

    // Método para notificar as lojas sobre novos produtos disponíveis
    private void notificarLojas() {
        for (Loja store : lojas) {
            store.update(produto, quantidade); // Notifica cada loja
        }
    }

    // Método para produzir novos produtos e notificar os assinantes
    public void produzNovoEletrodomestico(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        System.out.println("Fábrica produziu um novo lote de " + quantidade + " " + produto + "(s).");
        notificarLojas(); // Notifica todas as lojas sobre o novo produto
    }
}
