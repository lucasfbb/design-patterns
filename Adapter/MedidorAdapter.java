package Adapter;

public class MedidorAdapter implements Medidor {
    private final MedidorEmPolegadas medidorEmPolegadas;

    public MedidorAdapter(MedidorEmPolegadas medidorEmPolegadas) {
        this.medidorEmPolegadas = medidorEmPolegadas;
    }

    @Override
    public double getValorEmCentimetros() {
        return medidorEmPolegadas.getValorEmPolegadas() * 2.54; // Converte polegadas para centímetros
    }
}
