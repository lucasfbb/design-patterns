package Command_;

// Client
public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(turnOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}

