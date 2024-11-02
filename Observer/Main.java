public class Main {
    public static void main(String[] args) {
        // Cria o sujeito (estação meteorológica)
        WeatherStation weatherStation = new WeatherStation();

        // Cria observadores (dispositivos de exibição)
        DisplayDevice device1 = new DisplayDevice("Dispositivo 1");
        DisplayDevice device2 = new DisplayDevice("Dispositivo 2");

        // Adiciona observadores à estação meteorológica
        weatherStation.addObserver(device1);
        weatherStation.addObserver(device2);

        // Muda a temperatura e notifica os observadores
        System.out.println("Atualizando temperatura para 25.5°C:");
        weatherStation.setTemperature(25.5f);

        System.out.println("Atualizando temperatura para 28.3°C:");
        weatherStation.setTemperature(28.3f);

        // Remove um observador e atualiza novamente
        weatherStation.removeObserver(device1);

        System.out.println("Atualizando temperatura para 22.1°C:");
        weatherStation.setTemperature(22.1f);
    }
}
