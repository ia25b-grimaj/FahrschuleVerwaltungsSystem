package Testing;

import ch.fahrschule.methoden.Methoden;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodenTest {
    @Test
    void testIntInput() {
        Methoden m = new Methoden();
        InputStream originalIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream("-5\n10\n".getBytes()));

            double result = m.doubleUserInput("> ", 0, 500);
            assertEquals(10.0, result, 0.0001);
        } finally {
            System.setIn(originalIn);
        }
    }
}
