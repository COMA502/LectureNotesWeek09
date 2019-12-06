package edu.dmacc.dsmcode.coma510.examples;

import edu.dmacc.dsmcode.coma510.exercises.Equipment;
import edu.dmacc.dsmcode.coma510.exercises.Mixer;
import edu.dmacc.dsmcode.coma510.exercises.Oven;

public class BakeryEquipmentFactory {

    public Equipment getEquipment(String name) {
        if (name.equals("oven")) {
            return new Oven();
        } else if (name.equals("mixer")) {
            return new Mixer();
        } else {
            throw new IllegalArgumentException(name + " is an unknown equipment");
        }
    }
}
