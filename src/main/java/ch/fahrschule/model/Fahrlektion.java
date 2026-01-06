package ch.fahrschule.model;

public class Fahrlektion implements Buchbar {
    private Schueler schueler;
    private Fahrlehrer fahrler;
    private int lektion;
    private boolean bezahlt;

    public Fahrlektion(Schueler schueler, Fahrlehrer fahrler, int lektionen, boolean bezahlt) {
        this.schueler = schueler;
        this.fahrler = fahrler;
        this.lektion = lektionen;
        this.bezahlt = bezahlt;
    }

    public void markiereBezahlt(boolean bezahlt) {
        this.bezahlt = bezahlt;
    }

    @Override
    public double berechnePreis(int lektionen, Fahrlehrer fahrler) {
        return lektionen * fahrler.getStundenLohn();
    }
}