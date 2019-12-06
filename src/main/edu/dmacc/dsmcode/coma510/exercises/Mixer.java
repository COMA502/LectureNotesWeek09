package edu.dmacc.dsmcode.coma510.exercises;

public class Mixer extends Equipment {

    public Mixer() {
        super("mixer", "corner");
    }

    @Override
    public boolean useEquipment(int duration) {
        System.out.println("mix for " + duration + " minutes");
        return true;
    }

    @Override
    public boolean useEquipment(int duration, int intesity) {
        System.out.println("mix for " + duration + " minutes on level " + intesity);
        return true;
    }
}
