public class Patron {
    private String name;
    private String patrons;

    public Patron(String name, int patrons) {
        this.name = name;
        this.patrons = String.valueOf(patrons);
    }
    public String getName() {
        return name;
    }

    public String getPatrons() {
        return patrons;
    }
}
