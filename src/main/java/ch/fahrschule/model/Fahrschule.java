package ch.fahrschule.model;

import ch.fahrschule.methoden.Methoden;

import java.util.ArrayList;

public class Fahrschule {
    private ArrayList<Fahrlehrer> fahrlehrerList;
    private ArrayList<Schueler> schuelerList;
    private ArrayList<Fahrlektion> fahrlektionList;
    private Schueler currentSchueler;
    private Fahrschule fSchule;


    //konstruktor
    public Fahrschule(ArrayList<Fahrlehrer> fahrlehrerList, ArrayList<Schueler> schuelerList, ArrayList<Fahrlektion> fahrlektionList, Fahrschule fSchule) {
        this.fahrlehrerList = fahrlehrerList;
        this.schuelerList = schuelerList;
        this.fahrlektionList = fahrlektionList;
        this.fSchule = fSchule;
    }
    public Fahrschule() {
        this.fahrlehrerList = new ArrayList<>();
        this.schuelerList = new ArrayList<>();
        this.fahrlektionList = new ArrayList<>();
    }

    //getter setter
    public Schueler getCurrentSchueler() {
        return currentSchueler;
    }
    public void setCurrentSchueler(Schueler currentSchueler) {
        this.currentSchueler = currentSchueler;
    }

    public ArrayList<Fahrlektion> getFahrlektion() {
        return fahrlektionList;
    }

    public ArrayList<Fahrlehrer> getFahrlehrerList() {
        return fahrlehrerList;
    }

    public ArrayList<Schueler> getSchuelerList() {
        return schuelerList;
    }


    public void schuelerHinzufuegen(Schueler s) {
        schuelerList.add(s);
    }

    public void fahrlehrerHinzufuegen(Fahrlehrer f) {
        fahrlehrerList.add(f);
    }

    public Fahrlektion bucheLektion(Schueler s, Fahrlehrer f) {
        Methoden m = new Methoden();
        System.out.println("Vielen dank dass Sie Fahrlektionen bei uns buchen.");

        int lektionen = m.intUserInput("Geben sie ein wie viele Lektionen sie buchen wollen > ", 1, 12);

        Fahrlektion fl = new Fahrlektion(s, f, lektionen, false);
        fahrlektionList.add(fl);

        System.out.println("Erfolgreich gebucht: " + fl);
        return fl;
    }

    public Person findePersonNachID(String id) {
        if (fahrlehrerList != null) {
            for (Fahrlehrer f : fahrlehrerList) {
                if (f.getId().equals(id)) {
                    return f;
                }
            }
        }
        if (schuelerList != null) {
            for (Schueler s : schuelerList) {
                if (s.getId().equals(id)) {
                    return s;
                }
            }
        }
        return null;
    }
}
