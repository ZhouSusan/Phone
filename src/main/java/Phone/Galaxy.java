package Phone;
import Base.Ringable;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int  batteryPercentage, String ringTone, String phoneCarrier) {
        super(versionNumber, batteryPercentage, ringTone, phoneCarrier);
    }

    public String ring() {
        return this.getRingTone();
    }

    public String unlock() {
        return "Phone unlocked through pin number.";
    }
    @Override
    public void displayInfo() {

    }
}
