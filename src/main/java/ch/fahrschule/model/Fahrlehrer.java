package ch.fahrschule.model;

import ch.fahrschule.methoden.Methoden;

import java.util.ArrayList;
import java.util.List;

public class Fahrlehrer extends Person {
    private String lizenzNummer;
    private double stundenLohn;
    private final List<String> kategorien = new ArrayList<>();

    public Fahrlehrer(String id, String name, String lizenzNummer, double stundenLohn, Fahrschule fSchule) {
        super(id, name, fSchule);
        this.lizenzNummer = lizenzNummer;
        this.stundenLohn = stundenLohn;
    }

    public String getRolle() { return "Fahrlehrer"; }

    public String getLizenzNummer() { return lizenzNummer; }
    public void setLizenzNummer(String lizenzNummer) { this.lizenzNummer = lizenzNummer; }

    public double getStundenLohn() { return stundenLohn; }
    public void setStundenLohn(double stundenLohn) { this.stundenLohn = stundenLohn; }

    public List<String> getKategorien() { return kategorien; }

    @Override
    public void showMenue() {
        System.out.println("\nHallo " + getName() + " (" + getRolle() + ")");
        System.out.println("Was willst du tun?");
        System.out.println("1. Kategorien bearbeiten");
        System.out.println("2. Stundenlohn bearbeiten");
        System.out.println("3. Ausloggen");
    }

    @Override
    public void actions(int chosen) {
        Methoden m = new Methoden();

        if (chosen == 1) {
            while (true) {
                System.out.println("\nDeine Kategorien: " + (kategorien.isEmpty() ? "(keine)" : kategorien));
                System.out.println("1. Kategorie hinzufügen");
                System.out.println("2. Kategorie entfernen");
                System.out.println("3. Zurück");
                int c = m.intUserInput("[1-3] > ", 1, 3);

                if (c == 1) {
                    String k = m.stringUserInput("Kategorie (oder 'exit') > ").trim();
                    if (k.equalsIgnoreCase("exit")) return;
                    if (!k.isEmpty() && !kategorien.contains(k)) {
                        kategorien.add(k);
                        System.out.println("Hinzugefügt.");
                    } else {
                        System.out.println("Ungültig oder schon vorhanden.");
                    }
                } else if (c == 2) {
                    if (kategorien.isEmpty()) {
                        System.out.println("Keine Kategorien zum Entfernen.");
                        continue;
                    }
                    String k = m.stringUserInput("Welche Kategorie entfernen? > ").trim();
                    if (kategorien.remove(k)) {
                        System.out.println("Entfernt.");
                    } else {
                        System.out.println("Nicht gefunden.");
                    }
                } else {
                    return;
                }
            }
        } else if (chosen == 2) {
            System.out.println("Dein jetziger Stundenlohn beträgt " + stundenLohn + " CHF");
            stundenLohn = m.doubleUserInput("Gib deinen neuen Stundenlohn ein > ", 0, 500);
            System.out.println("Gespeichert: " + stundenLohn + " CHF");
        }
    }
}
