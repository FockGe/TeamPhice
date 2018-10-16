package at.auva.litec.auva;

public class Usergroup {
    private String description;
    private int id;
    private String name;
    private Usertype Usertype;

    public Usergroup(String description, int id, String name, Usertype usertype) {
        this.description = description;
        this.id = id;
        this.name = name;
        Usertype = usertype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usertype getUsertype() {
        return Usertype;
    }

    public void setUsertype(Usertype usertype) {
        Usertype = usertype;
    }
}
