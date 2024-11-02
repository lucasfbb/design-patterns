package Trabalho;

// Classe ConcreteObserver - Representa uma loja que recebe notificações sobre novos produtos
class LojaEletrodomesticos implements Loja {
    private String nome;

    public LojaEletrodomesticos(String nome) {
        this.nome = nome;
    }

    // Método chamado quando há uma atualização na fábrica
    @Override
    public void update(String produto, int quantidade) {
        System.out.println(nome + " foi notificada: " + quantidade + " " + produto + "(s) agora estão disponíveis.");
    }
}
