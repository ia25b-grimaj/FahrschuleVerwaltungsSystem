package ch.fahrschule.model;

public class Fahrlektion implements Buchbar {
    private Schueler schueler;
    private Fahrlehrer fahrler;
    private int Minuten;
    private boolean bezahlt;

    public Fahrlektion(Schueler schueler, Fahrlehrer fahrler, int minuten, boolean bezahlt) {
        this.schueler = schueler;
        this.fahrler = fahrler;
        this.Minuten = minuten;
        this.bezahlt = bezahlt;
    }

    public void markiereBezahlt(boolean bezahlt) {
        this.bezahlt = bezahlt;
    }

    public String summary() {
        return "Lücken füller";
    }

    @Override
    public double berechnePreis(int minuten) {
        return 0;
    }
}