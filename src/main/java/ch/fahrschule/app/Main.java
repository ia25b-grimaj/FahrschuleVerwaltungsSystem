package ch.fahrschule.app;

import ch.fahrschule.model.*;
import ch.fahrschule.methoden.*;

public class Main {

    Fahrschule fSchule = new Fahrschule();
    UserActions u = new UserActions(fSchule);
    Methoden m = new Methoden();
    UserInterface ui = new UserInterface();

    Person user;
    int startAction;
    int menueAction;

    public Main() {


        // --- Testdaten: 3 Fahrlehrer und 1 Fahrschüler erstellen ---
        Fahrlehrer fahrlehrer1 = new Fahrlehrer("L1", "Max Muster", "LIZ1234", 45.0, fSchule);
        Fahrlehrer fahrlehrer2 = new Fahrlehrer("L2", "Anna Beispiel", "LIZ5678", 50.0, fSchule);
        Fahrlehrer fahrlehrer3 = new Fahrlehrer("L3", "Peter Test", "LIZ9012", 48.5, fSchule);

        fSchule.fahrlehrerHinzufuegen(fahrlehrer1);
        fSchule.fahrlehrerHinzufuegen(fahrlehrer2);
        fSchule.fahrlehrerHinzufuegen(fahrlehrer3);

        Schueler schueler1 = new Schueler("S1", "Laura Schüler", "B", fSchule);
        fSchule.schuelerHinzufuegen(schueler1);

        System.out.println("Fahrlehrer und Fahrschüler erfolgreich erstellt!");
        

        while (true) {
            ui.startScreen();

            startAction = m.intUserInput("[1 / 3]\n", 1, 3);
            if (startAction == 1) {
                user = u.kontoErstellen();
            } else if (startAction == 2) {
                do {
                    user = fSchule.findePersonNachID(
                            m.stringUserInput("Logge dich mit deinem Nutzernamen ein >")
                    );
                    if (user == null) {
                        System.out.println("Dieser Benutzer exestiert nicht!");
                    }
                } while (user == null);
            } else {
                return;
            }

            menueAction = 0;
            while (menueAction != 3) {
                user.showMenue();
                menueAction = m.intUserInput("Gib 1, 2 oder 3 ein,", 1, 3);
                user.actions(menueAction);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
