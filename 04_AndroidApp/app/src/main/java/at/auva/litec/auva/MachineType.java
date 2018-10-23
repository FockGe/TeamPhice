package at.auva.litec.auva;

/**
 * Created by Anika on 16.10.2018.
 */

public class MachineType {
    private int id;
    private String safetyInstructions;
    private String type;

    public MachineType(int id, String safetyInstructions, String type) {
        this.id = id;
        this.safetyInstructions = safetyInstructions;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSafetyInstructions() {
        return safetyInstructions;
    }

    public void setSafetyInstructions(String safetyInstructions) {
        this.safetyInstructions = safetyInstructions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
