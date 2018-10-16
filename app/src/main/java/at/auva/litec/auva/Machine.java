package at.auva.litec.auva;

import java.util.HashSet;

/**
 * Created by Anika on 16.10.2018.
 */

public class Machine {
    private boolean defective;
    private String defects;
    private String description;
    private String emergencyPlan;
    private String files;
    private int id;
    private int lastMaintainedBy;
    private int type;
    private String name;
    private String operationManual;
    private String picture;
    private HashSet<Integer> securityClothes = new HashSet<>();
    private HashSet<Integer> machineAdministrator = new HashSet<>();
    private HashSet<Integer> warnings = new HashSet<>();

    public Machine(int id, String name, int type, String description, String files, String picture, String emergencyPlan,
                   int lastMaintainedBy, String operationManual, String defects, boolean defective){

        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.files = files;
        this.picture = picture;
        this.emergencyPlan = emergencyPlan;
        this.lastMaintainedBy = lastMaintainedBy;
        this.operationManual = operationManual;
        this.defects = defects;
        this.defective = defective;


    }

    public boolean isDefective() {
        return defective;
    }

    public void setDefective(boolean defective) {
        this.defective = defective;
    }

    public String getDefects() {
        return defects;
    }

    public void setDefects(String defects) {
        this.defects = defects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmergencyPlan() {
        return emergencyPlan;
    }

    public void setEmergencyPlan(String emergencyPlan) {
        this.emergencyPlan = emergencyPlan;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLastMaintainedBy() {
        return lastMaintainedBy;
    }

    public void setLastMaintainedBy(int lastMaintainedBy) {
        this.lastMaintainedBy = lastMaintainedBy;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperationManual() {
        return operationManual;
    }

    public void setOperationManual(String operationManual) {
        this.operationManual = operationManual;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        picture = picture;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
