public class Phone extends Device {
    private String caseColor;
    private String phoneNumber;

    public Phone(String model, int storageGB, boolean isBroken, String caseColor, String phoneNumber) {
        super(model, storageGB, isBroken);
        this.caseColor = caseColor;
        this.phoneNumber = phoneNumber;
    }

    public void callFriend(String f) {
        System.out.println("Calling " + f + "...");
    }

    public void textFriend(String f) {
        System.out.println("Texting " + f + "...");
    }
}
