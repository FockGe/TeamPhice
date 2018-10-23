package at.auva.litec.auva;

import java.util.HashSet;

public class Room {
    public HashSet<Integer> Maschines=new HashSet<>(  );
    private int Id;
    private String RoomNumber;
    private String descripion;
    private String firstResponders;
    private String emergenyPlan;
    private String guestInfo;

    public Room(int id, String roomNumber, String descr, String fRes, String emergenyPlan, String guestInfo ){
        this.Id=id;
        this.RoomNumber=roomNumber;
        this.descripion=descr;
        this.firstResponders=fRes;
        this.emergenyPlan=emergenyPlan;
        this.guestInfo=guestInfo;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public String getEmergenyPlan() {
        return emergenyPlan;
    }

    public void setEmergenyPlan(String emergenyPlan) {
        this.emergenyPlan = emergenyPlan;
    }

    public String getFirstResponders() {
        return firstResponders;
    }

    public void setFirstResponders(String firstResponders) {
        this.firstResponders = firstResponders;
    }

    public String getGuestInfo() {
        return guestInfo;
    }

    public void setGuestInfo(String guestInfo) {
        this.guestInfo = guestInfo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }
}
