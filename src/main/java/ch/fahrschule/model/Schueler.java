package ch.fahrschule.model;


import ch.fahrschule.methoden.Methoden;

public class Schueler extends Person {
    private String fuehrerscheinKategorie;
    private TheorieKonto theorieKonto;
    private final Fahrschule fSchule;

    //konstruktor
    public Schueler(String id, String name, String fuehrerscheinKategorie, Fahrschule fSchule) {
        super(id, name);
        this.fuehrerscheinKategorie = fuehrerscheinKategorie;
        this.fSchule = fSchule;
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

    @Override
    public void showMenue() {
        System.out.println("Hallo Fahrschüler");
        System.out.println("Du übst für die " + fuehrerscheinKategorie + " Kategorie");
        System.out.println("1. Fahrlektion buchen");
        System.out.println("2. Gebuchte Fahrlektionen anzeigen");
        System.out.println("3. Ausloggen");
    }

    @Override
    public void actions(int chosen) {
        Methoden m = new Methoden();
        int count = 0;
        if (chosen == 1) {
            if (fSchule.getFahrlehrerList().isEmpty()) {
                System.out.println("Zurzeit sind leider keine Fahrlehrer verfügbar");
                return;
            }
            System.out.println("Wähle von den folgenden einen Fahrlehrer aus:");
            for (Fahrlehrer fahrlehrer : fSchule.getFahrlehrerList()) {
                count += 1;
                System.out.println(count + ". " + fahrlehrer.getName());
            }
            Fahrlehrer selectedFahrlehrer = fSchule.getFahrlehrerList().get(m.intUserInput("Gib an welchen Lehrer du buchen willst >", 1, fSchule.getFahrlehrerList().size())-1);

            fSchule.bucheLektion(this, selectedFahrlehrer);
        } else if (chosen == 2) {
            return;
        }
    }
}

