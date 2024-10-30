package Strategy.Estrategias;
import Strategy.Estrategia;

public class Flanqueamento implements Estrategia {
    @Override
    public void executar() {
        System.out.println("Unidade tenta flanquear o inimigo pelas laterais.");
    }
}
