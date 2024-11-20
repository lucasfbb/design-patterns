package Proxy.cliente;

import Proxy.sistema.ProxyRecurso;
import Proxy.sistema.Usuario;

public class Cliente {
    public static void main(String[] args) {
        // Criar Proxy para proteger um recurso com permissão mínima de nível 2
        ProxyRecurso proxy = new ProxyRecurso("Lucas Gabriel", "1234567890", 2);

        // Criar usuários com diferentes níveis de permissão
        Usuario usuarioBasico = new Usuario("Alice", 1);
        Usuario usuarioAvancado = new Usuario("Bob", 2);
        Usuario usuarioAdmin = new Usuario("Carol", 3);

        // Autenticar usuários
        proxy.autenticarUsuario(usuarioBasico);
        proxy.autenticarUsuario(usuarioAvancado);
        proxy.autenticarUsuario(usuarioAdmin);

        // Testar acessos
        System.out.println("\nTeste 1: Usuário básico tenta acessar"); // Esperado: falha
        proxy.exibirDados("Alice");

        System.out.println("\nTeste 2: Usuário avançado tenta acessar"); // Esperado: sucesso
        proxy.exibirDados("Bob");

        System.out.println("\nTeste 3: Usuário administrador tenta acessar"); // Esperado: sucesso
        proxy.exibirDados("Carol");

        System.out.println("\nTeste 4: Usuário não autenticado tenta acessar"); // Esperado: falha
        proxy.exibirDados("Dave");
    }
}
