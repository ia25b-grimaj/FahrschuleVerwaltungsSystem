package ch.fahrschule.model;

public abstract class Person {
    private final String id;
    private String name;

    // Damit Schueler/Fahrlehrer in actions() auf die gleiche Fahrschule zugreifen können:
    private Fahrschule fahrschule;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        this.fahrschule = fahrschule;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Fahrschule getFahrschule() { return fahrschule; }
    public void setFahrschule(Fahrschule fahrschule) { this.fahrschule = fahrschule; }

    public abstract void showMenue();
    public abstract void actions(int chosen);
}
