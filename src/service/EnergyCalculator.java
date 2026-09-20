package service;

import model.Appliance;

public class EnergyCalculator {

    public static double calculateUnits(Appliance appliance) {

        return (appliance.getPowerRating()
                * appliance.getUsageHours()) / 1000;
    }
}