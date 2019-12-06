package edu.dmacc.dsmcode.coma510.examples;

public class FactoryMain {

    public static void main(String[] args) {
        String[] recipeEquipment = {"oven", "mixer"};

        // Without a factory pattern, the more equipment we have
        // the longer and more complex our main is...
//        for(String equipmentName : recipeEquipment) {
//            if (equipmentName.equals("oven")) {
//                new Oven();
//            } else if (equipmentName.equals("mixer")) {
//                new Mixer();
//            } else {
//                throw new IllegalArgumentException(equipmentName + " is an unknown equipment");
//            }
//        }

        // Using factory pattern, the more equipment we have
        // the main doesn't change! ;)
        BakeryEquipmentFactory factory = new BakeryEquipmentFactory();
        for (String equipmentName : recipeEquipment) {
            factory.getEquipment(equipmentName);
        }
    }
}
