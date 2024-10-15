package Facade;

// Facade class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started");
    }

    public void shutdownComputer() {
        hardDrive.write();
        memory.clear();
        cpu.shutdown();
        System.out.println("Computer shut down");
    }
}
