package ch.fahrschule.methoden;

import ch.fahrschule.model.*;

public class UserActions {
    Methoden m =  new Methoden();
    Fahrschule fSchule = new Fahrschule();
    String username = "";
    public UserActions(Fahrschule fSchule) {
        this.fSchule = fSchule;
    }
    public Person kontoErstellen() {
        System.out.println("Als welche Rolle soll dieses Konto erstellt werden?");
        System.out.println("Neulenker oder Fahrlehrer");
        if (m.intUserInput("[1 / 2]\n", 1, 2) == 1) {
            if (fSchule.getFahrlehrerList().isEmpty() || fSchule.getSchuelerList().isEmpty()) {
                do {
                    username = m.stringUserInput("Gib deinen Nutzernamen ein: ");
                    if (fSchule.findePersonNachID(username) != null) {
                        System.out.println("Dieser Nutzername exestiert schon bereits!");
                    }
                } while (fSchule.findePersonNachID(username) != null);
            }
            Schueler s = new Schueler(username, m.stringUserInput("Gib deinen Namen ein:"), m.stringUserInput("Welche Führerscheinkategorie willst du erwerben:"));
            TheorieKonto t = new TheorieKonto(m.booleanUserInput("Hast du deine Prüfung bestanden? [1=Ja / 2=Nein]"), s);
            s.setTheorieKonto(t);
            fSchule.schuelerHinzufuegen(s);
            return s;
        } else {
            do {
                username = m.stringUserInput("Gib deinen Nutzernamen ein: ");
                if (fSchule.findePersonNachID(username) == null) {
                    System.out.println("Dieser Nutzername exestiert schon bereits!");
                }
            } while (fSchule.findePersonNachID(username) != null);
            Fahrlehrer f = new Fahrlehrer(username, m.stringUserInput("Gib deinen Namen ein: "), m.stringUserInput("Gib deine Lizenznummer an: "), m.doubleUserInput("Gib deine Stunden ansatz ein: ", 0, 500));
            fSchule.fahrlehrerHinzufuegen(f);
            return f;
        }
    }
}
