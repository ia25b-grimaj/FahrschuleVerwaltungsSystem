package Testing;

import ch.fahrschule.model.Fahrlehrer;
import ch.fahrschule.model.Fahrschule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrlehrerTest {

    private Fahrlehrer fl;

    @BeforeEach
    void setup() {
        fl = new Fahrlehrer("F1", "Max Muster", "LZ-123", 80.0, new Fahrschule());
    }

    @Test
    void constructor_setsInitialStundenlohn() {
        assertEquals(80.0, fl.getStundenLohn(), 0.0001);
    }

    @Test
    void setStundenLohn_setsValueCorrectly() {
        fl.setStundenLohn(120.50);
        assertEquals(120.50, fl.getStundenLohn(), 0.0001);
    }
}
