package Strategy;

public class Unidade {
    private Estrategia estrategia;

    public Unidade(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void mudarEstrategia(Estrategia novaEstrategia) {
        this.estrategia = novaEstrategia;
        System.out.println("Estratégia mudada.");
    }

    public void agir() {
        estrategia.executar();
    }
}