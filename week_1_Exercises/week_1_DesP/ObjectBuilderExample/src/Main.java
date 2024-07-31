public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setOS("Windows 10")
                .build();

        Computer officeComputer = new Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setOS("Windows 10")
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
