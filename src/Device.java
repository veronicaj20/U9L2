public class Device {
    private String model;
    private int storageGB;
    private boolean isBroken;

    public Device(String model, int storageGB, boolean isBroken) {
        this.model = model;
        this.storageGB = storageGB;
        this.isBroken = isBroken;
    }

    public void fixDevice() {
        if (isBroken) {
            System.out.println("This device is being repaired... done!");
            isBroken = false;
        }
        else {
            System.out.println("This device is not broken!");
        }

    }

    public void charge() {
        System.out.println("Charging to 100%...");
    }
}
