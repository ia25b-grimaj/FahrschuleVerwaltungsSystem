package Testing;

import ch.fahrschule.app.UserInterface;
import ch.fahrschule.model.Fahrlehrer;
import ch.fahrschule.model.Fahrschule;
import ch.fahrschule.model.Schueler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    void menueTestMain() {
        UserInterface ui = new UserInterface();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ui.startScreen();

        String output = out.toString();

        assertTrue(output.contains("--------------------------"));
        assertTrue(output.contains("  Willkommen bei unserer  "));
        assertTrue(output.contains("        FAHRSCHULE        "));
        assertTrue(output.contains("1. Wenn du neu hier bist  "));
        assertTrue(output.contains("2. Konto bereits erstellt "));
        assertTrue(output.contains("3. Programm verlassen     "));
        assertTrue(output.contains("--------------------------"));
    }
}
