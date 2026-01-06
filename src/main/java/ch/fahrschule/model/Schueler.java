package ch.fahrschule.model;

import ch.fahrschule.methoden.Methoden;

public class Schueler extends Person {
    private String fuehrerscheinKategorie;
    private TheorieKonto theorieKonto;

    //konstruktor
    public Schueler(String id, String name, String fuehrerscheinKategorie) {
        super(id, name);
        this.fuehrerscheinKategorie = fuehrerscheinKategorie;
    }

    //getter setter
    public String getFuehrerscheinKategorie() {
        return fuehrerscheinKategorie;
    }
    public void setFuehrerscheinKategorie(String fuehrerscheinKategorie) {
        this.fuehrerscheinKategorie = fuehrerscheinKategorie;
    }

    public TheorieKonto getTheorieKonto() {
        return theorieKonto;
    }
    public void setTheorieKonto(TheorieKonto theorieKonto) {
        this.theorieKonto = theorieKonto;
    }

    public String getRolle() {
        return "Schueler";
    }

    public void showMenue() {
        Methoden m = new Methoden();
        System.out.println("Hallo Fahrschüler");
        System.out.println("Du übst für die" + fuehrerscheinKategorie + " Kategorie");
        System.out.println("1. Fahrlektion buchen");
        System.out.println("2. Gebuchte Fahrlektionen anzeigen");
        System.out.println("3. Ausloggen");

    }
}
