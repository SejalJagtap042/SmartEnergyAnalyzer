package database;

import model.Appliance;
import service.BillCalculator;
import service.EnergyCalculator;

import java.util.List;

public class BillTest {

    public static void main(String[] args) {

        ApplianceDAO dao = new ApplianceDAO();

        List<Appliance> appliances =
                dao.getAllAppliances();

        double totalEnergy = 0;

        System.out.println("SMART ENERGY ANALYZER");
        System.out.println("---------------------");

        for (Appliance appliance : appliances) {

            double energy =
                    EnergyCalculator.calculateUnits(appliance);

            double bill =
                    BillCalculator.calculateBill(energy);

            totalEnergy += energy;

            System.out.println(
                    appliance.getName()
                            + " -> "
                            + energy
                            + " kWh -> ₹"
                            + bill
            );
        }

        double totalBill =
                BillCalculator.calculateBill(totalEnergy);

        System.out.println("---------------------");
        System.out.println(
                "Total Energy: "
                        + totalEnergy
                        + " kWh"
        );

        System.out.println(
                "Estimated Bill: ₹"
                        + totalBill
        );
    }
}