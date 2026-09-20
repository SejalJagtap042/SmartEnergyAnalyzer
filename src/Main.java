import database.ApplianceDAO;
import model.Appliance;
import service.BillCalculator;
import service.EnergyCalculator;
import service.SmartSuggestion;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ApplianceDAO dao = new ApplianceDAO();

        while (true) {

            System.out.println("\n===== SMART ENERGY ANALYZER =====");
            System.out.println("1. View Appliances");
            System.out.println("2. Calculate Total Energy");
            System.out.println("3. Predict Bill");
            System.out.println("4. Exit");
            System.out.println("5. Smart Suggestions");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    List<Appliance> appliances =
                            dao.getAllAppliances();

                    for (Appliance appliance : appliances) {

                        System.out.println(
                                appliance.getId()
                                        + " | "
                                        + appliance.getName()
                                        + " | "
                                        + appliance.getPowerRating()
                                        + "W | "
                                        + appliance.getUsageHours()
                                        + " Hours"
                        );
                    }

                    break;

                case 2:

                    double totalEnergy = 0;

                    List<Appliance> energyList =
                            dao.getAllAppliances();

                    for (Appliance appliance : energyList) {

                        totalEnergy +=
                                EnergyCalculator.calculateUnits(appliance);
                    }

                    System.out.println(
                            "Total Energy = "
                                    + totalEnergy
                                    + " kWh"
                    );

                    break;

                case 3:

                    double totalUnits = 0;

                    List<Appliance> billList =
                            dao.getAllAppliances();

                    for (Appliance appliance : billList) {

                        totalUnits +=
                                EnergyCalculator.calculateUnits(appliance);
                    }

                    double bill =
                            BillCalculator.calculateBill(totalUnits);

                    System.out.println(
                            "Estimated Bill = ₹"
                                    + bill
                    );

                    break;


                case 5:

                    List<Appliance> suggestionList =
                            dao.getAllAppliances();

                    SmartSuggestion.generateSuggestions(
                            suggestionList
                    );

                    break;

                case 4:

                    System.out.println("Thank You!");
                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}