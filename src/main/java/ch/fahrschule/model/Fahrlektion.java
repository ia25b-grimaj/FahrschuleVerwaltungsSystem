package ch.fahrschule.model;

public class Fahrlektion implements Buchbar {
    private final Schueler schueler;
    private final Fahrlehrer fahrlehrer;
    private final int lektionen;
    private boolean bezahlt;

    public Fahrlektion(Schueler schueler, Fahrlehrer fahrlehrer, int lektionen, boolean bezahlt) {
        this.schueler = schueler;
        this.fahrlehrer = fahrlehrer;
        this.lektionen = lektionen;
        this.bezahlt = bezahlt;
    }

    public Schueler getSchueler() { return schueler; }
    public Fahrlehrer getFahrlehrer() { return fahrlehrer; }
    public int getLektionen() { return lektionen; }
    public boolean isBezahlt() { return bezahlt; }

    public void markiereBezahlt(boolean bezahlt) {
        this.bezahlt = bezahlt;
    }

    @Override
    public double berechnePreis(int lektionen, Fahrlehrer fahrlehrer) {
        return lektionen * fahrlehrer.getStundenLohn();
    }

    public double getPreis() {
        return berechnePreis(lektionen, fahrlehrer);
    }

    @Override
    public String toString() {
        return "Fahrlektion{" +
                "schueler=" + schueler.getName() +
                ", fahrlehrer=" + fahrlehrer.getName() +
                ", lektionen=" + lektionen +
                ", preis=" + getPreis() + " CHF" +
                ", bezahlt=" + (bezahlt ? "Ja" : "Nein") +
                '}';
    }
}
