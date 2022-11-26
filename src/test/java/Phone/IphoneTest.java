package Phone;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IphoneTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void IphoneSuccessTest() {

        Iphone iPhoneTest1 = new Iphone("WEHUR1IU2-0", 17, "Boom, Boom, Clap, Get up..", "Cricket");
        iPhoneTest1.displayInfo();
        assertAll(() -> assertEquals("\n Iphone's id: WEHUR1IU2-0, Battery Percentage left: 17, Carrier: Cricket,RingTOne: Boom, Boom, Clap, Get up..\n",
                outContent.toString()),
                () -> assertEquals("Boom, Boom, Clap, Get up..", iPhoneTest1.ring()),
                () -> assertEquals("Phone unlock by biometrics.", iPhoneTest1.unlock()));
    }
}
