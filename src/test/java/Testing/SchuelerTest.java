package Testing;

import ch.fahrschule.model.Fahrschule;
import ch.fahrschule.model.Schueler;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchuelerTest {

    @Test
    void fuehrerscheinkategorieTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Fahrschule fSchule = new Fahrschule();
        Schueler schueler = new Schueler("S1", "Test Schüler", "A1", fSchule);

        schueler.showMenue();

        String output = out.toString();

        assertTrue(output.contains("Hallo Fahrschüler"));
        assertTrue(output.contains("Du übst für die A1 Kategorie"));
        assertTrue(output.contains("1. Fahrlektion buchen"));
        assertTrue(output.contains("2. Gebuchte Fahrlektionen anzeigen"));
        assertTrue(output.contains("3. Ausloggen"));
    }
}
