package Testing;

import ch.fahrschule.model.Fahrlehrer;
import ch.fahrschule.model.Fahrschule;
import ch.fahrschule.model.Schueler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchuelerTest {
    @BeforeEach
    void setUp() {
        Fahrschule fSchule = new Fahrschule();
        Schueler schueler = new Schueler("Jepi", "Jamie", "A1", fSchule);
    }


}
