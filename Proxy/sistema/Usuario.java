package Proxy.sistema;

public class Usuario {
    private final String nome;
    private final int nivelPermissao; // 1: Básico, 2: Avançado, 3: Administrativo

    public Usuario(String nome, int nivelPermissao) {
        this.nome = nome;
        this.nivelPermissao = nivelPermissao;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelPermissao() {
        return nivelPermissao;
    }
}
