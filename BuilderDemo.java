package assignment1;

// The "product" to be built
class Computer {
    private String cpu;
    private String gpu;
    private int ramSize;
    private String storage;
    private String operatingSystem;

    // We'll provide getters to view the final built computer
    public String getCpu() { return cpu; }
    public String getGpu() { return gpu; }
    public int getRamSize() { return ramSize; }
    public String getStorage() { return storage; }
    public String getOperatingSystem() { return operatingSystem; }

    // We'll make these package-private so only the builder can set them.
    void setCpu(String cpu) { this.cpu = cpu; }
    void setGpu(String gpu) { this.gpu = gpu; }
    void setRamSize(int ramSize) { this.ramSize = ramSize; }
    void setStorage(String storage) { this.storage = storage; }
    void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    public void showSpecs() {
        System.out.println("=== Computer Specs ===");
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("RAM: " + ramSize + " GB");
        System.out.println("Storage: " + storage);
        System.out.println("OS: " + operatingSystem);
        System.out.println("======================");
    }
}

// The Builder interface
interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setRamSize(int ramSize);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setOperatingSystem(String os);

    Computer build();
}

// A Concrete Builder
class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        // Start with a blank Computer
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this; // returning 'this' for method chaining
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        computer.setGpu(gpu);
        return this;
    }

    @Override
    public ComputerBuilder setRamSize(int ramSize) {
        computer.setRamSize(ramSize);
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public ComputerBuilder setOperatingSystem(String os) {
        computer.setOperatingSystem(os);
        return this;
    }

    @Override
    public Computer build() {
        return this.computer; // Return the fully built Computer
    }
}

// A quick demo of the Builder usage
public class BuilderDemo {
    public static void main(String[] args) {
        // Step 1: Create a builder
        ComputerBuilder builder = new GamingComputerBuilder();

        // Step 2: Configure it step by step
        Computer gamingPC = builder
                .setCpu("Intel Core i9")
                .setGpu("NVIDIA RTX 3080")
                .setRamSize(32)
                .setStorage("2TB SSD")
                .setOperatingSystem("Windows 11")
                .build();

        // Step 3: Show the final product
        gamingPC.showSpecs();
    }
}