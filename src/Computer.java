public class Computer extends Device {
    private boolean isLaptop;

    public Computer(String model, int storageGB, boolean isBroken, boolean isLaptop) {
        super(model, storageGB, isBroken);
        this.isLaptop = isLaptop;
    }

    public void playPCGame() {
        System.out.println("Playing a game!");
    }

    public void cleanKeyboard() {
        System.out.println("Cleaning the keyboard...");
    }
}
