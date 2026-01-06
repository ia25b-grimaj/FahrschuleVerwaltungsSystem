package ch.fahrschule.methoden;

import ch.fahrschule.model.*;

public class UserActions {
    private final Methoden m = new Methoden();
    private final Fahrschule fSchule;

    public UserActions(Fahrschule fSchule) {
        this.fSchule = fSchule;
    }

    public Person kontoErstellen() {
        System.out.println("Als welche Rolle soll dieses Konto erstellt werden?");
        System.out.println("1. Neulenker / Schüler");
        System.out.println("2. Fahrlehrer");

        int rolle = m.intUserInput("[1 / 2] > ", 1, 2);

        String username;
        do {
            username = m.stringUserInput("Gib deinen Nutzernamen ein: ").trim();
            if (username.isEmpty()) {
                System.out.println("Username darf nicht leer sein.");
                continue;
            }
            if (fSchule.findePersonNachID(username) != null) {
                System.out.println("Dieser Nutzername existiert bereits!");
            }
        } while (username.isEmpty() || fSchule.findePersonNachID(username) != null);

        String name = m.stringUserInput("Gib deinen Namen ein: ").trim();

        if (rolle == 1) {
            String kat = m.stringUserInput("Welche Führerscheinkategorie willst du erwerben: ").trim();
            Schueler s = new Schueler(username, name, kat, fSchule);
            TheorieKonto t = new TheorieKonto(m.booleanUserInput("Hast du deine Theorieprüfung bestanden? [1=Ja / 2=Nein] > "), s);
            s.setTheorieKonto(t);

            fSchule.schuelerHinzufuegen(s);
            s.setFahrschule(fSchule);
            return s;
        } else {
            String lizenz = m.stringUserInput("Gib deine Lizenznummer an: ").trim();
            double stundenAnsatz = m.doubleUserInput("Gib deinen Stundenansatz ein (CHF): ", 0, 500);

            Fahrlehrer f = new Fahrlehrer(username, name, lizenz, stundenAnsatz, fSchule);
            fSchule.fahrlehrerHinzufuegen(f);
            f.setFahrschule(fSchule);
            return f;
        }
    }
}
