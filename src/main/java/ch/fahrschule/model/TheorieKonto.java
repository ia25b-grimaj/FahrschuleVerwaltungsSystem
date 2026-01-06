package ch.fahrschule.model;

public class TheorieKonto {
    private boolean pruefungBestanden;
    private Schueler schueler;

    //konstruktor
    public TheorieKonto(boolean pruefungBestanden, Schueler schueler) {
        this.pruefungBestanden = pruefungBestanden;
        this.schueler = schueler;
    }

    //getter setter
    public boolean isPruefungBestanden() {
        return pruefungBestanden;
    }
    public void setPruefungBestanden(boolean pruefungBestanden) {
        this.pruefungBestanden = pruefungBestanden;
    }

    public Schueler getSchueler() {
        return schueler;
    }
    public void setSchueler(Schueler schueler) {
        this.schueler = schueler;
    }
}
