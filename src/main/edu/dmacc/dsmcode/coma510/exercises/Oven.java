package edu.dmacc.dsmcode.coma510.exercises;

public class Oven extends Equipment {

    public Oven() {
        super("oven", "under counter");
    }

    @Override
    public boolean useEquipment(int duration) {
        System.out.println("bake for " + duration + " minutes");
        return true;
    }

    @Override
    public boolean useEquipment(int duration, int intesity) {
        System.out.println("bake for " + duration + " minutes on level " + intesity);
        return true;
    }
}
