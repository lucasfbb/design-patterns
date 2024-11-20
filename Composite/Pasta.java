package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Componente {
    private final String nome;
    private final List<Componente> filhos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        filhos.add(componente);
    }

    public void remover(Componente componente) {
        filhos.remove(componente);
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "Pasta: " + nome);
        for (Componente filho : filhos) {
            filho.exibir(prefixo + "  ");
        }
    }
}
