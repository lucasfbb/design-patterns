package Composite;

public class Cliente {
    public static void main(String[] args) {
        // Criação de arquivos individuais (Leaf)
        Componente arquivo1 = new Arquivo("Arquivo1.txt");
        Componente arquivo2 = new Arquivo("Arquivo2.txt");
        Componente arquivo3 = new Arquivo("Arquivo3.txt");

        // Criação de pastas (Composite)
        Pasta pastaRaiz = new Pasta("Raiz");
        Pasta pastaSub1 = new Pasta("SubPasta1");
        Pasta pastaSub2 = new Pasta("SubPasta2");

        // Compondo a hierarquia
        pastaRaiz.adicionar(arquivo1);
        pastaRaiz.adicionar(pastaSub1);

        pastaSub1.adicionar(arquivo2);
        pastaSub1.adicionar(pastaSub2);

        pastaSub2.adicionar(arquivo3);

        // Exibindo a hierarquia
        System.out.println("Estrutura de Arquivos:");
        pastaRaiz.exibir("");
    }
}