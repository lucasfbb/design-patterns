package Strategy.Estrategias;

import Strategy.Estrategia;

public class Agressiva implements Estrategia{
    @Override
    public void executar() {
        System.out.println("Unidade avança agressivamente contra o inimigo!");
    }
}
