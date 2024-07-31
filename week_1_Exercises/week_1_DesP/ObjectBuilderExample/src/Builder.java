public class Builder {
    String CPU;
    String RAM;
    String storage;
    String GPU;
    String OS;

    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Builder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public Builder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}