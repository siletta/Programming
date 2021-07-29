package world;

public class Plant {
    public String name;
    public final static int ID = 12;

    private String type;
    protected String size;

    int height; //this is PACKAGE level visibility

    public Plant() {
        this.name = "Ibiscus";
        this.type = "type of plant";
        this.size = "large";
        this.height = 50;
    }

}
