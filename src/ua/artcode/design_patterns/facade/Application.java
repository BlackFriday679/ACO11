package ua.artcode.design_patterns.facade;

/**
 * Created by serhii on 06.02.16.
 */
class CPU {
    public void execute() {  }
}

class Memory {
    public void load() {  }
}

class HardDrive {
    public void read() {  }
}

/* Facade */

class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        hardDrive.read();
        memory.load();
        cpu.execute();
    }
}

/* Client */

class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
