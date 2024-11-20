package Composite;

public class Arquivo implements Componente {
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "Arquivo: " + nome);
    }
}
