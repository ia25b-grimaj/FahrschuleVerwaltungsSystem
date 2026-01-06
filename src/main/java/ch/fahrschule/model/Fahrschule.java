package ch.fahrschule.model;

import java.util.ArrayList;

public class Fahrschule {
    private ArrayList<Fahrlehrer> fahrlehrerList;
    private ArrayList<Schueler> schuelerList;
    private ArrayList<Fahrlektion> fahrlektionList;
    private Schueler currentSchueler;


    //konstruktor
    public Fahrschule(ArrayList<Fahrlehrer> fahrlehrerList, ArrayList<Schueler> schuelerList, ArrayList<Fahrlektion> fahrlektionList) {
        this.fahrlehrerList = fahrlehrerList;
        this.schuelerList = schuelerList;
        this.fahrlektionList = fahrlektionList;
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

    public Fahrlektion bucheLektion(Schueler s, Fahrlehrer f, int minuten) {
        return null;
    }

    public double berechneOffeneKosten(Schueler s) {
        return 0;
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
