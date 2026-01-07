package ch.fahrschule.model;

public abstract class Person {
    private final String id;
    private String name;

    private Fahrschule fSchule;

    public Person(String id, String name, Fahrschule fSchule) {
        this.id = id;
        this.name = name;
        this.fSchule = fSchule;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Fahrschule getFahrschule() { return fSchule; }
    public void setFahrschule(Fahrschule fahrschule) { this.fSchule = fahrschule; }

    public abstract void showMenue();
    public abstract void actions(int chosen);
}
