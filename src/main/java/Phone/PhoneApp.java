package Phone;

public class PhoneApp {
    public static void main(String[] args) {
        Galaxy galaxy9 = new Galaxy("M2DHN78I", 56, "Blah, Blah, Blah ...Blah!", "T-mobile");
        System.out.printf("My phone rings like %s.\n", galaxy9.ring());
        System.out.println(galaxy9.unlock());
        galaxy9.displayInfo();

        System.out.println("\n*********************************");
        Iphone iPhone7 = new Iphone("WFTE137-21", 100, "CockDoooDoledo, CockDoooDoledo!", "AT&T");
        System.out.printf("\nIphone rings like %s.\n", iPhone7.ring());
        System.out.println(iPhone7.unlock());
        iPhone7.displayInfo();
    }
}
