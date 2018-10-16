package at.auva.litec.auva;

/**
 * Created by Anika on 16.10.2018.
 */

public class Warning {
    private String description;
    private int id;
    private String name;
    private String symbol;

    public Warning(String description, int id, String name, String symbol) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.symbol = symbol;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
