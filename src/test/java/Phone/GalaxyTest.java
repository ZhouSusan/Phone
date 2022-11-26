package Phone;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GalaxyTest {

    private final ByteArrayOutputStream outContext = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContext));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void GalaxySuccessTest() {

        // arrange
        Galaxy galaxy = new Galaxy("S9", 99, "Doo Be Doo Be Doo!", "Verizon");

        // act
        galaxy.displayInfo();

        // assert
        assertEquals("This Galaxy's phone:\n Verizon carrier,\n" +
                " version Number S9,\n" +
                " has 99 battery percentage left,\n" +
                " and it goes Doo Be Doo Be Doo! when it rings.", outContext.toString());

        assertEquals("Doo Be Doo Be Doo!", galaxy.ring());
        assertEquals("Phone unlocked through pin number.", galaxy.unlock());
    }
}
