package service;

import model.Appliance;

import java.util.List;

public class SmartSuggestion {

    public static void generateSuggestions(
            List<Appliance> appliances) {

        Appliance highest = appliances.get(0);

        for (Appliance appliance : appliances) {

            double currentEnergy =
                    appliance.getPowerRating()
                            * appliance.getUsageHours();

            double highestEnergy =
                    highest.getPowerRating()
                            * highest.getUsageHours();

            if (currentEnergy > highestEnergy) {

                highest = appliance;
            }
        }

        System.out.println("\n===== ENERGY SAVING SUGGESTIONS =====");

        System.out.println(
                highest.getName()
                        + " consumes the most energy."
        );

        System.out.println(
                "Try reducing "
                        + highest.getName()
                        + " usage by 1-2 hours daily."
        );

        System.out.println(
                "Turn off appliances when not in use."
        );

        System.out.println(
                "Use energy-efficient appliances."
        );

        System.out.println(
                "Monitor electricity usage regularly."
        );
    }
}