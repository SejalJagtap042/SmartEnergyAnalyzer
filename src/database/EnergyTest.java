package database;

import model.Appliance;
import service.EnergyCalculator;

import java.util.List;

public class EnergyTest {

    public static void main(String[] args) {

        ApplianceDAO dao = new ApplianceDAO();

        List<Appliance> appliances =
                dao.getAllAppliances();

        double totalEnergy = 0;

        System.out.println("ENERGY CALCULATOR TEST");
        System.out.println("----------------------");

        for (Appliance appliance : appliances) {

            double energy =
                    EnergyCalculator.calculateUnits(appliance);

            totalEnergy += energy;

            System.out.println(
                    appliance.getName()
                            + " -> "
                            + energy
                            + " kWh"
            );
        }

        System.out.println("----------------------");
        System.out.println(
                "Total Energy = "
                        + totalEnergy
                        + " kWh"
        );
    }
}