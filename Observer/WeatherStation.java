public class WeatherStation extends Subject {
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers(temperature); // Notifica os observadores da mudança
    }
}
