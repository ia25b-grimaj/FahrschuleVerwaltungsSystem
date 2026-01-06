package ch.fahrschule.model;


import ch.fahrschule.methoden.Methoden;

import java.util.List;

public class Fahrlehrer extends Person {
    private String lizenzNummer;
    private double stundenLohn;
    private List<String> kategorien;

    public Fahrlehrer(String id, String name, String lizenzNummer, double stundenLohn) {
        super(id, name);
        this.lizenzNummer = lizenzNummer;
        this.stundenLohn = stundenLohn;
    }

    public String getRolle() {
        return "Fahrlehrer";
    }
    public double getStundenLohn() {
        return stundenLohn;
    }


    public void showMenue() {
        System.out.println("Hallo Fahrlehrer" + getRolle());
        System.out.println("Was willst du tun?:");
        System.out.println("1. Kategorien welche du Anbietest bearbeiten");
        System.out.println("2. Stundenlohn bearbeiten");
        System.out.println("3. Ausloggen");
    }

    @Override
    public void actions(int chosen) {
        Methoden m = new Methoden();
        String kategorie;
        if (chosen == 1) {
            if (kategorien.isEmpty()) {
                System.out.println("Du musst zuerst kategorien hinzufügen");
                do {
                    kategorie = m.stringUserInput("Welche Kategorie bietest du an? (Exit zum verlassen) >");
                    kategorien.add(kategorie);
                } while (!kategorie.equalsIgnoreCase("Exit"));
            }
        } else if (chosen == 2) {
            System.out.println("Dein jetztiger Stundenlonhn beträgt " + stundenLohn + "CHF");
            stundenLohn = m.doubleUserInput("\n\nGib deinen neuen Stundenlohn ein >", 0, 500);
        }
    }
}