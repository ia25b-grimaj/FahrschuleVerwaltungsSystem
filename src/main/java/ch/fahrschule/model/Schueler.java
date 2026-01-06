package ch.fahrschule.model;


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

        int count = 0;
        if (chosen == 1) {
            if (fSchule.getFahrlehrerList().isEmpty()) {
                System.out.println("Zurzeit sind leider keine Fahrlehrer verfügbar");
            } else {
                System.out.println("Wähle von den folgenden einen Fahrlehrer aus:");
                for (Fahrlehrer fahrlehrer : fSchule.getFahrlehrerList()) {
                    count += 1;
                    System.out.println(count);
                    System.out.println(fahrlehrer.getName());
                }
            }
            fSchule.bucheLektion(fSchule.findePersonNachID());
        } else if (chosen == 2) {
            System.out.println("Nummer 2 ");
        }
    }
}
