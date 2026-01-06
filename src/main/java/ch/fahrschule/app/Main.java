package ch.fahrschule.app;

import ch.fahrschule.model.*;
import ch.fahrschule.methoden.*;

public class Main {
    Fahrschule fSchule = new Fahrschule();
    UserActions u = new UserActions(fSchule);
    Methoden m = new Methoden();
    Person user;
    public Main() {
        System.out.println("--------------------------");
        System.out.println("  Willkommen bei unserer  ");
        System.out.println("        FAHRSCHULE        ");
        System.out.println("1. Wenn du neu hier bist  ");
        System.out.println("2. Konto bereits erstellt ");

        if (m.intUserInput("[1 / 2]\n", 1, 2) == 1) {
            u.kontoErstellen();
            user = u.kontoErstellen();
        } else {
            do {
                user = fSchule.findePersonNachID(m.stringUserInput("Logge dich mit deinem Nutzernamen ein >"));
                if (user == null) {
                    System.out.println("Dieser Benutzer exestiert nicht!");
                }
            } while (user == null);
        }
        user.showMenue();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
