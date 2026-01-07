package ch.fahrschule.app;

import ch.fahrschule.model.*;
import ch.fahrschule.methoden.*;

public class Main {
    Fahrschule fSchule = new Fahrschule();
    UserActions u = new UserActions(fSchule);
    Methoden m = new Methoden();
    Person user;
    int startAction;
    int menueAction;
    public Main() {
        while (true) {
            System.out.println("--------------------------");
            System.out.println("  Willkommen bei unserer  ");
            System.out.println("        FAHRSCHULE        ");
            System.out.println("1. Wenn du neu hier bist  ");
            System.out.println("2. Konto bereits erstellt ");
            System.out.println("3. Programm verlassen");

            startAction = m.intUserInput("[1 / 3]\n", 1, 3);
            if (startAction == 1) {
                user = u.kontoErstellen();
            } else if (startAction == 2) {
                do {
                    user = fSchule.findePersonNachID(m.stringUserInput("Logge dich mit deinem Nutzernamen ein >"));
                    if (user == null) {
                        System.out.println("Dieser Benutzer exestiert nicht!");
                    }
                } while (user == null);
            } else if (startAction == 3) {
                return;
            }
            while (menueAction != 3) {
                user.showMenue();
                menueAction = m.intUserInput("Gib 1, 2 oder 3 ein,", 1, 3);
                user.actions(menueAction);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
