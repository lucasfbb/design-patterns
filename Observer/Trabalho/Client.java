package Trabalho;

// Classe Cliente para testar o sistema
public class Client {
    public static void main(String[] args) {
        // Criando a fábrica (publisher)
        FabricaEletrodomesticos fabrica = new FabricaEletrodomesticos();

        // Criando as lojas (subscribers/observadores)
        LojaEletrodomesticos loja1 = new LojaEletrodomesticos("Loja 1");
        LojaEletrodomesticos loja2 = new LojaEletrodomesticos("Loja 2");

        // Adicionando as lojas como assinantes da fábrica
        fabrica.addLoja(loja1);
        fabrica.addLoja(loja2);

        // Testando o sistema de notificações
        // A fábrica produz um novo lote e notifica as lojas
        System.out.println("Teste 1: Produzindo o primeiro lote de geladeiras.");
        fabrica.produzNovoEletrodomestico("Geladeira", 10); // Deve notificar ambas as lojas

        // Removendo uma loja e produzindo outro lote
        System.out.println("Teste 2: Removendo Loja 1 e produzindo outro lote.");
        fabrica.removerLoja(loja1); // Loja 1 não receberá mais notificações

        fabrica.produzNovoEletrodomestico("Geladeira", 5); // Deve notificar apenas a Loja 2
    }
}