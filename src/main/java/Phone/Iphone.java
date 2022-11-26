package Phone;
import Base.Ringable;

public class Iphone extends Phone implements Ringable {


    public Iphone(String versionNumber, int batteryPercentage, String ringTone, String phoneCarrier) {
        super(versionNumber, batteryPercentage, ringTone, phoneCarrier);
    }

    @Override
    public String ring() {
        return "CockDoooDoledo, CockDoooDoledo!";
    }

    @Override
    public String unlock() {
        return "Phone unlock by biometrics.";
    }

    @Override
    public void displayInfo() {
        System.out.format("\n Iphone's id: %s, Battery Percentage left: %s," + "Carrier: %s" +
                "RingTOne: %s\n", getVersionNumber(), getBatteryPercentage(), getPhoneCarrier(), getRingTone());
    }
}
