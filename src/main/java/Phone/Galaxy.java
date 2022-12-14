package Phone;
import Base.Ringable;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String ringTone, String phoneCarrier) {
        super(versionNumber, batteryPercentage, ringTone, phoneCarrier);
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Phone unlocked through pin number.";
    }
    @Override
    public void displayInfo() {
        System.out.printf("This Galaxy's phone:\n %s carrier,\n version Number %s," +
                        "\n has %s battery percentage left,\n and it goes %s when it rings."
        , getPhoneCarrier(), getVersionNumber(),getBatteryPercentage(), getRingTone());
    }
}
