// Simulação (Cliente)
public class EditorDeMapas {
    public static void main(String[] args) {
        // Criando o mapa e o caretaker
        Mapa mapa = new Mapa();
        Caretaker caretaker = new Caretaker();

        System.out.println("");
        System.out.println("========================================");

        // Adicionando elementos
        System.out.println("Adicionando elementos ao mapa:");
        Elemento elemento1 = new Elemento("Árvore", 1, 2);
        mapa.adicionarElemento(elemento1);
        caretaker.salvar(mapa.salvarEstado()); // Salvar estado
        System.out.println(mapa);

        Elemento elemento2 = new Elemento("Rocha", 3, 4);
        mapa.adicionarElemento(elemento2);
        caretaker.salvar(mapa.salvarEstado()); // Salvar estado
        System.out.println(mapa);

        Elemento elemento3 = new Elemento("Casa", 5, 6);
        mapa.adicionarElemento(elemento3);
        caretaker.salvar(mapa.salvarEstado()); // Salvar estado
        System.out.println(mapa);

        // Desfazer última alteração
        System.out.println("\nDesfazendo a última alteração:");
        Memento memento = caretaker.desfazer();
        if (memento != null) {
            mapa.restaurarEstado(memento);
        }
        System.out.println("Estado atual do mapa: "+ mapa);

        // Desfazer novamente
        System.out.println("\nDesfazendo novamente:");
        memento = caretaker.desfazer();
        if (memento != null) {
            mapa.restaurarEstado(memento);
        }
        System.out.println("Estado atual do mapa: "+ mapa);

        // Refazer uma alteração
        System.out.println("\nRefazendo uma alteração:");
        memento = caretaker.refazer();
        if (memento != null) {
            mapa.restaurarEstado(memento);
        }
        System.out.println("Estado atual do mapa: "+ mapa);

        System.out.println("\nRefazendo uma alteração:");
        memento = caretaker.refazer();
        if (memento != null) {
            mapa.restaurarEstado(memento);
        }
        System.out.println("Estado atual do mapa: "+ mapa);

        System.out.println("========================================");
        System.out.println("");
    }
}
