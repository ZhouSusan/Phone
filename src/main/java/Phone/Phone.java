package Phone;

public abstract class Phone {

    private String versionNumber;
    private int batteryPercentage;
    private String ringTone;
    private String phoneCarrier;

    public Phone(String versionNumber, int batteryPercentage, String ringTone, String phoneCarrier) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.ringTone = ringTone;
        this.phoneCarrier = phoneCarrier;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public String getRingTone() {
        return ringTone;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public abstract void displayInfo();
}
