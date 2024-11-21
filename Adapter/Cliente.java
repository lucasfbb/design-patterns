package Adapter;

public class Cliente {
    public static void main(String[] args) {
        // Objeto existente que retorna medições em polegadas
        MedidorEmPolegadas medidorEmPolegadas = new MedidorEmPolegadas();

        // Adapter para traduzir polegadas para centímetros
        Medidor medidorAdapter = new MedidorAdapter(medidorEmPolegadas);

        // Usando o valor em polegadas
        System.out.println("Valor em polegadas: " + medidorEmPolegadas.getValorEmPolegadas());

        // Usando o valor em centímetros
        System.out.println("Valor em centímetros: " + medidorAdapter.getValorEmCentimetros());
    }
}
