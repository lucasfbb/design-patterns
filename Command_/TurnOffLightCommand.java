package Command_;

// Concrete command for turning off the light
class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
