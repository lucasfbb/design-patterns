package Strategy.Estrategias;

import Strategy.Estrategia;

public class Defensiva implements Estrategia{
    @Override
    public void executar() {
        System.out.println("Unidade assume uma postura defensiva e se protege.");
    }
}
