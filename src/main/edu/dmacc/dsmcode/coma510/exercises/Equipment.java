package edu.dmacc.dsmcode.coma510.exercises;

public abstract class Equipment {

    private String equipmentType;
    private String equipmentLocation;

    public Equipment() {
    }

    public Equipment(String equipmentType, String equipmentLocation) {
        this.equipmentType = equipmentType;
        this.equipmentLocation = equipmentLocation;
    }

    public abstract boolean useEquipment(int duration);

    public abstract boolean useEquipment(int duration, int intensity);
}
