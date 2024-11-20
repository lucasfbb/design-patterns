package Proxy.sistema;

import java.util.HashMap;
import java.util.Map;

public class ProxyRecurso implements Recurso {
    private final DadosConfidenciais dadosConfidenciais;
    private final int nivelMinimoPermissao;
    private final Map<String, Usuario> usuariosAutenticados;

    public ProxyRecurso(String nome, String cpf, int nivelMinimoPermissao) {
        this.dadosConfidenciais = new DadosConfidenciais(nome, cpf);
        this.nivelMinimoPermissao = nivelMinimoPermissao;
        this.usuariosAutenticados = new HashMap<>();
    }

    public void autenticarUsuario(Usuario usuario) {
        usuariosAutenticados.put(usuario.getNome(), usuario);
        System.out.println("Usuário '" + usuario.getNome() + "' autenticado com nível de permissão: " + usuario.getNivelPermissao());
    }

    @Override
    public void exibirDados(String usuario) {
        Usuario usuarioObj = usuariosAutenticados.get(usuario);

        if (usuarioObj == null) {
            System.out.println("Acesso negado! Usuário '" + usuario + "' não autenticado.");
            return;
        }

        if (usuarioObj.getNivelPermissao() < nivelMinimoPermissao) {
            System.out.println("Acesso negado! Usuário '" + usuario + "' não possui permissão suficiente.");
            return;
        }

        System.out.println("Acesso autorizado! Usuário '"+ usuario + "' pode acessar os dados.");
        dadosConfidenciais.exibirDados(usuario);
    }
}
