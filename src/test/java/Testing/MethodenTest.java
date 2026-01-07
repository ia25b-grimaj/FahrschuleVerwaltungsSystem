package Testing;

import ch.fahrschule.methoden.Methoden;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class MethodenTest {

    @Test
    void intUserInput() {
        InputStream originalIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream("-5\n23\n".getBytes()));

            Methoden m = new Methoden();
            int result = m.intUserInput("> ", 0, 500);

            assertEquals(23, result);
        } finally {
            System.setIn(originalIn);
        }
    }

    @Test
    void doubleUserInput() {
        InputStream originalIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream("-5\n46\n".getBytes()));

            Methoden m = new Methoden();
            double result = m.doubleUserInput("> ", 0, 500);

            assertEquals(46.0, result, 0.0001);
        } finally {
            System.setIn(originalIn);
        }
    }

    @Test
    void booleanUserInputFalse() {
        //Returns false when user types 2
        InputStream originalIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream("2\n".getBytes()));

            Methoden m = new Methoden();
            boolean result = m.booleanUserInput("> ");

            assertFalse(result);
        } finally {
            System.setIn(originalIn);
        }
    }

    @Test
    void booleanUserInputTrue() {
        //Returns True when user types 1
        InputStream originalIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream("1\n".getBytes()));

            Methoden m = new Methoden();
            boolean result = m.booleanUserInput("> ");

            assertTrue(result);
        } finally {
            System.setIn(originalIn);
        }
    }

    @Test
    void stringUserInput_readsWholeLine() {
        InputStream originalIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream("Hallo Welt\n".getBytes()));

            Methoden m = new Methoden();
            String result = m.stringUserInput("> ");

            assertEquals("Hallo Welt", result);
        } finally {
            System.setIn(originalIn);
        }
    }
}
