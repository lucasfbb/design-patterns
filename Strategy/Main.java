package Strategy;

import Strategy.Estrategias.Agressiva;
import Strategy.Estrategias.Defensiva;
import Strategy.Estrategias.Flanqueamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jogo iniciado...");

        // Unidade começa com estratégia agressiva
        Unidade unidade = new Unidade(new Agressiva());
        unidade.agir();

        // Mudança de estratégia para defensiva
        unidade.mudarEstrategia(new Defensiva());
        unidade.agir();

        // Mudança de estratégia para flanqueamento
        unidade.mudarEstrategia(new Flanqueamento());
        unidade.agir();
    }
}
