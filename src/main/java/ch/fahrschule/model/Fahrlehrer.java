package ch.fahrschule.model;

public class Fahrlehrer extends Person {
    private String lizenzNummer;
    private double stundenLohn;

    public Fahrlehrer(String id, String name, String lizenzNummer, double stundenLohn) {
        super(id, name);
        this.lizenzNummer = lizenzNummer;
        this.stundenLohn = stundenLohn;
    }

    public String getRolle() {
        return "Fahrlehrer";
    }

    public void showMenue() {
        System.out.println("Hallo Fahrlehrer" + getRolle());
        System.out.println("Was willst du tun?:");
    }
}