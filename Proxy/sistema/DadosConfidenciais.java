package Proxy.sistema;

public class DadosConfidenciais implements Recurso {
    private final String nome;
    private final String cpf;

    public DadosConfidenciais(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void exibirDados(String usuario) {
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
